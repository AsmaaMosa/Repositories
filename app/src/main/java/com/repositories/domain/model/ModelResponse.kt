package com.repositories.domain.model


data class ModelResponse<T>(
    val responseStatus: ResponseStatus,
    var data: T? = null,
    val errorData: ErrorData? = null
)

data class ResponseStatus constructor(val status: Status) {
    companion object {
        @JvmStatic
        val Loading = ResponseStatus(Status.RUNNING)

        @JvmStatic
        val Success = ResponseStatus(Status.SUCCESS)

        @JvmStatic
        val Error = ResponseStatus(Status.FAILED)
    }
}


data class ErrorData(val throwable: Throwable, var errorMessage: String, val errorCode: String)
enum class Status {
    RUNNING,
    SUCCESS,
    FAILED
}