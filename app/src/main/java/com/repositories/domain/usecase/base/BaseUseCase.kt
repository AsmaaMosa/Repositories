package com.repositories.domain.usecase.base

import com.repositories.domain.model.ErrorData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import java.lang.Exception

abstract class BaseUseCase<V, D> {

    abstract suspend fun execute(params: D? = null): V

    fun invoke(coroutineScope: CoroutineScope, params: D?, onResult: UseCaseResult<V>?) {
        coroutineScope.launch {
            try {
                onResult?.onSuccess(execute(params))
            } catch (ex: Exception) {
                onResult?.onError(ErrorData(ex, ex.message.toString(), ""))
            }
        }
    }
}