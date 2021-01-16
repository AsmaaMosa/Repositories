package com.repositories.data

import com.repositories.domain.GitHubRepositoriesRepo
import com.repositories.domain.model.RepositoriesModel
import repoSource.RepoDataSourceImp

class GitHubRepositoriesRepoImp(private val dataSource: RepoDataSourceImp) :
    GitHubRepositoriesRepo {
    override suspend fun getRepositories(query: String): RepositoriesModel {
        return dataSource.getRepositories(query)
    }
}