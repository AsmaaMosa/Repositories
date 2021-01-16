package com.repositories.domain

import com.repositories.domain.model.RepositoriesModel

interface GitHubRepositoriesRepo {
    suspend fun getRepositories(query: String): RepositoriesModel
}