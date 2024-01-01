package kotlintest

sealed class Either<out L, out R> {
    data class Left<L>(val left: L) : Either<L, Nothing>() {
        override fun toString() = "Left($left)"
    }

    data class Right<R>(val right: R) : Either<Nothing, R>() {
        override fun toString() = "Right($right)"
    }

    inline fun <R2> mapRight(transform: (R) -> R2): Either<L, R2> =
        when (this) {
            is Left -> this
            is Right -> Right(transform(right))
        }

    inline fun <L2> mapLeft(transform: (L) -> L2): Either<L2, R> =
        when (this) {
            is Left -> Left(transform(left))
            is Right -> this
        }

    inline fun <T> fold(ifLeft: (L) -> T, ifRight: (R) -> T) =
        when (this) {
            is Left -> ifLeft(left)
            is Right -> ifRight(right)
        }
}

fun <L> leftOf(value: L) = Either.Left(value)

fun <R> rightOf(value: R) = Either.Right(value)