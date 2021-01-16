package repoSource

import com.repositories.domain.model.RepositoriesModel

class RepoDataSourceImp(private val apiService: GithubRepositoriesApiService) : RepoDataSource {
    override suspend fun getRepositories(query: String): RepositoriesModel {
        return apiService.getRepositories(query)
    }
}