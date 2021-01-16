package com.repositories.domain.usecase

import com.repositories.domain.GitHubRepositoriesRepo
import com.repositories.domain.model.ItemModel
import com.repositories.domain.usecase.base.BaseUseCase

class GetRepositoriesUseCase(private val repo: GitHubRepositoriesRepo ) :
    BaseUseCase<MutableList<ItemModel>, String>() {
    override suspend fun execute(params: String?): MutableList<ItemModel> {
        return repo.getRepositories(params ?: "").items
    }
}