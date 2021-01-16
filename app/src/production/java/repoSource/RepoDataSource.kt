package repoSource

import com.repositories.domain.model.RepositoriesModel

interface RepoDataSource {
    suspend fun getRepositories(query: String): RepositoriesModel
}