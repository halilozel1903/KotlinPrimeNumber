## Kotlin Prime Number 🔢 🎖️ 💥

![Kotlin Prime Number](https://www.zealousweb.com/wp-content/uploads/2020/05/Banner-2.jpg)

A prime number is a positive integer greater than 1 that has no positive integer divisors other than 1 and itself. In other words, a prime number is a number that can only be divided evenly by 1 and itself.

Here's a simple program in `Kotlin` to find all prime numbers up to a given number:

```kotlin
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
```
In this program, we start by setting a variable limit to the maximum number we want to check for prime numbers. In this case, we've set it to `20`.

Next, we print a message to indicate that we're looking for prime numbers up to the limit.

We then use a for loop to iterate through all the numbers from 2 up to the limit. For each number, we call the `isPrime()` to determine whether it's a prime number.

The `isPrime()` takes an integer parameter number and returns a boolean value indicating whether it's a prime number. First, we check if the number is less than or equal to 1, in which case it's not a prime number. Then we use another for loop to check all the numbers from 2 up to one less than the number itself. If we find any number that divides the number evenly, we know it's not a prime number and we return false. If we make it through the entire loop without finding a divisor, we know the number is a prime number and we return true.

When we run the program, it will output all the prime numbers up to the limit we set:

```kotlin
Prime numbers up to 20: 2 3 5 7 11 13 17 19
```
## Donation 💸

You can support by buying a coffee. ☕️

[!["Buy Me A Coffee"](https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png)](https://www.buymeacoffee.com/halilozel1903)


## License ℹ️
```
MIT License

Copyright (c) 2023 Halil OZEL

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```