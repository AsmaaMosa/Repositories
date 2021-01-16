package repoSource

import com.repositories.domain.model.RepositoriesModel
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubRepositoriesApiService {
    @GET("search/repositories")
    suspend fun getRepositories(@Query("q") query: String): RepositoriesModel
}