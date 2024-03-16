/**
In this program, we start by setting a variable limit to the maximum number we want to
check for prime numbers. In this case, we've set it to 20.
 */

fun main() {
    val limit = 20
    println("Prime numbers up to $limit: ${(2..limit).filter { it.isPrime() }.joinToString(", ")}")
}

fun Int.isPrime(): Boolean = this <= 1 || (2 until this).none { this % it == 0 }