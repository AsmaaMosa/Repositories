package com.repositories.domain.usecase.base

import com.repositories.domain.model.ErrorData


interface UseCaseResult<Type> {
    fun onSuccess(type: Type)
    fun onError(error: ErrorData)
}