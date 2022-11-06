package com.valoy.compose.presentation.ui.common

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import retrofit2.HttpException
import java.io.IOException
import kotlin.coroutines.cancellation.CancellationException

typealias Results<T> = Either<Error, T>

sealed class Error {
    class Server(val code: Int) : Error()
    object Connectivity : Error()
    class Unknown(val message: String) : Error()
}

fun Exception.toError(): Error = when (this) {
    is IOException -> Error.Connectivity
    is HttpException -> Error.Server(code())
    else -> Error.Unknown(message ?: "")
}

inline fun <T> tryCall(action: () -> T): Results<T> = try {
    action().right()
} catch (e: Exception) {
    e.toError().left()
} catch (e: CancellationException){
    throw e
}

fun <A> A.failure(): Either<A, Nothing> = Either.Left(this)

fun <A> A.success(): Either<Nothing, A> = Either.Right(this)

