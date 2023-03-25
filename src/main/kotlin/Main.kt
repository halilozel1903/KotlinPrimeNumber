/**
In this program, we start by setting a variable limit to the maximum number we want to
check for prime numbers. In this case, we've set it to 20.
 */

fun main() {
    val limit = 20
    print("Prime numbers up to $limit: ")
    for (i in 2..limit) {
        if (isPrime(i)) {
            print("$i ")
        }
    }
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }
    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}
