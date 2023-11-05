/**
In this program, we start by setting a variable limit to the maximum number we want to
check for prime numbers. In this case, we've set it to 20.
 */

fun main() {
    val limit = 20
    println("Prime numbers up to $limit: " + (2..limit).filter { isPrime(it) }.joinToString(" "))
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) return false
    return (2 until number).all { number % it != 0 }
}
