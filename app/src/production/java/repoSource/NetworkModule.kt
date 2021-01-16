package repoSource

import com.repositories.domain.GitHubRepositoriesRepo
import com.repositories.domain.usecase.GetRepositoriesUseCase
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

private const val TIME_OUT = 30L


val NetworkModule = module {
    single { createGithubRepositoriesApiService(get()) }

    single { createRetrofit(get(), "https://api.github.com/") }

    single { createOkHttpClient() }
    single { createDataSource(get()) }
    single { GsonConverterFactory.create() }

}

fun createOkHttpClient(): OkHttpClient {
    val httpLoggingInterceptor = HttpLoggingInterceptor()
    httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BASIC
    return OkHttpClient.Builder()
        .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
        .readTimeout(TIME_OUT, TimeUnit.SECONDS)
        .addInterceptor(httpLoggingInterceptor).build()
}

fun createRetrofit(okHttpClient: OkHttpClient, url: String): Retrofit {
    return Retrofit.Builder()
        .baseUrl(url)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create()).build()
}

fun createGithubRepositoriesApiService(retrofit: Retrofit): GithubRepositoriesApiService {
    return retrofit.create(GithubRepositoriesApiService::class.java)
}

fun createDataSource(apiService: GithubRepositoriesApiService): RepoDataSourceImp {
    return RepoDataSourceImp(apiService)
}

fun createGetRepositoriesUseCase(postsRepository: GitHubRepositoriesRepo): GetRepositoriesUseCase {
    return GetRepositoriesUseCase(postsRepository)
}