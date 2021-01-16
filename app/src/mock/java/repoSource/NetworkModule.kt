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
    single { createDataSource() }
}

fun createDataSource(): DataSource {
    return DataSource()
}

fun createGetRepositoriesUseCase(postsRepository: GitHubRepositoriesRepo): GetRepositoriesUseCase {
    return GetRepositoriesUseCase(postsRepository)
}