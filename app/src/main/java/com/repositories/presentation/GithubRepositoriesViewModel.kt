package com.repositories.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.repositories.domain.model.*
import com.repositories.domain.usecase.GetRepositoriesUseCase
import com.repositories.domain.usecase.base.UseCaseResult

class GithubRepositoriesViewModel(private val useCase: GetRepositoriesUseCase) : ViewModel() {

    val githubRepositoriesLiveData by lazy { MutableLiveData<ModelResponse<MutableList<ItemModel>>>() }

    fun getRepositories(params: String) {
        githubRepositoriesLiveData.value = ModelResponse(ResponseStatus.Loading)
        useCase.invoke(
            viewModelScope,
            params = params,
            object : UseCaseResult<MutableList<ItemModel>> {
                override fun onSuccess(type: MutableList<ItemModel>) {
                    githubRepositoriesLiveData.value = ModelResponse(ResponseStatus.Success, type)
                }

                override fun onError(error: ErrorData) {
                    githubRepositoriesLiveData.value =
                        ModelResponse(ResponseStatus.Error, errorData = error)
                }

            })

    }

}