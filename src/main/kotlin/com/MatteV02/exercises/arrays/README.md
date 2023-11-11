# Kotlin Arrays

**[CopyArray.kt]** Write a method accepting a `Array<Double>` and returning a copy of the initial `Array<Double>` (see
Array<T>.copyOf()).

Examples:

* copyArray([1, 2, 3]) → [1, 2, 3]
* copyArray([2, 1, 1]) → [2, 1, 1]

The method has the following prototype:

```kotlin
fun copyArray(v: Array<Double>): Array<Double> {
	// write your code here
}
```

where:

* **v** is the array to be copied.

---

**[FillArray.kt]** Write a method returning an `Array<Double>` already filled with values (see Array<T>.fill,
kotlin.random.Random).

Examples:

* fillArray(3, 0, false) → [0, 0, 0]
* fillArray(5, 1, false) → [1, 1, 1, 1, 1]
* fillArray(5, 1, true) → [0.99, 1.02, 1.01, 0.97, 0.95]
* fillArray(3, 100, true) → [102.45, 99.33, 96.34]

The method has the following prototype:

```kotlin
fun fillArray(size: Int, value: Double, addNoise: Boolean): Array<Double> {
	// write your code here
}
```

where:

* **size** is the size of the new array.
* **value** is the value to be assigned to all the elements of the new array.
* **addNoise** if true, all the elements have to be randomized between plus or minus 5 percent of **value**.

---

**[DivideArray.kt]** Write a method accepting a `Array<Double>` and a `Double` value returning a
different `Array<Double>`
representing the original `Array<Double>` divided by factor.

Examples:

* divideArray([1, 1, 1], 2.0) → [0.5, 0.5, 0.5]
* divideArray([2, 1, 1], 1.0) → [2.0, 1.0, 1.0]
* divideArray([10, 10], 10.0) → [1.0, 1.0]

The method has the following prototype:

```kotlin
fun divideArray(v: Array<Double>, factor: Double): Array<Double> {
	// write your code here
}
```

where:

* **v** is the `Array<Double>` array to be processed.
* **factor** is the divisor to be used.

---

**[DivideArrays.kt]** Write a method accepting two `Array<Double>` returning a different `Array<Double>` representing
the first
array divided by the second array. Every element of the first array is divided by the corresponding element of the
second array. The two arrays must have the same size. Returns `null` otherwise.

Examples:

* divideArrays([1, 1, 1], [3, 3, 3]) → [0.33, 0.33, 0.33]
* divideArrays([2, 1, 1], [10, 10, 10]) → [0.2, 0.1, 0.1]
* divideArrays([10, 10], [5, 5]) → [2.0, 2.0]

The method has the following prototype:

```kotlin
fun divideArrays(v1: Array<Double>, v2: Array<Double>): Array<Double>? {
	// write your code here
}
```

where:

* **v1** is the array of the dividends.
* **v2** is the array of the divisors.

---

**[Fibonacci.kt]** Write a method accepting an `Int` and returning a `Array<Long>` composed of the first n numbers of
the
Fibonacci series.

Examples:

* fibonacci(1) → [0]
* fibonacci(2) → [0, 1]
* fibonacci(5) → [0, 1, 1, 2, 3]

The method has the following prototype:

```kotlin
fun fibonacci(n: Int): Array<Long> {
	// write your code here
}
```

where:

* **n** is the number of Fibonacci numbers to be generated.

---

**[BubbleSort.kt]** Write two methods for ordering an `Array<Int>`. The only difference between the two methods is that
the
first one orders the original `Array<Int>` directly and returns `Unit`, while the second one returns a sorted COPY of
the
original `Array<Int>` (you can use the Bubble Sort algorithm).

Examples:

* bubbleSort([6, 3, 4, 2]) → [2, 3, 4, 6]
* bubbleSort([9, 8, 7, 4]) → [4, 7, 8, 9]
* bubbleSort([1, 0, 0, 0]) → [0, 0, 0, 1]

The method has the following prototype:

```kotlin
fun bubbleSort(v: Array<Int>) {
	// write your code here
}

fun bubbleSortCopy(v: Array<Int>): Array<Int> {
	// write your code here
}
```

where:

* **v** is the `Array<Int>` array to be sorted.

---

**[MoveZeroEnd.kt]** Write a method accepting an `Array<Int>` eventually containing zeros and returning an `Array<Int>`
in which all
the zeros are at the end of the array. Maintain the relative order of the other (non-zero) elements.

Examples:

* moveZeroEnd([0, 0, 4, 2]) → [4, 2, 0, 0]
* moveZeroEnd([9, 0, 0, 4]) → [9, 4, 0, 0]
* moveZeroEnd([1, 0, 0, 0]) → [1, 0, 0, 0]

The method has the following prototype:

```kotlin
fun moveZerosEnd(v: Array<Int>): Array<Int> {
	// write your code here
}
```

where:

* **v** is the `Array<Int>` array to be processed.

---

**[Splitter.kt]** Write a method accepting an `Int` and returning the sequence of the digits as an `Array<Int>`.

Examples:

* 321 → [3, 2, 1]
* 123 → [1, 2, 3]

The method has the following prototype:

```kotlin
fun splitter(input: Int): Array<Int> {
	// write your code here
}
```

where:

* **input** is the integer number taken as input.

---

**[IsEverywhere.kt]** We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the
array, at least one of the pair is that value. Return true if the given value is everywhere in the array.

Examples:

* isEverywhere([1, 2, 1, 3], 1) → true
* isEverywhere([1, 2, 1, 3], 2) → false
* isEverywhere([1, 2, 1, 3, 4], 1) → false

The method has the following prototype:

```kotlin
fun isEverywhere(v: Array<Int>, value: Int): Boolean {
	// write your code here
}
```

where:

* **v** is the `Array<Int>` array to be processed.
* **value** is the value to be verified (if it is everywhere).

---

**[TenRun.kt]** For each multiple of 10 in the given array, change all the values following it to be that multiple of
10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

Examples:

* tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
* tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
* tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]

The method has the following prototype:

```kotlin
fun tenRun(v: Array<Int>): Array<Int> {
	// write your code here
}
```

where:

* **v** is the `Array<Int>` array to be processed.

---

**[FizzBuzz.java]** Consider the series of numbers beginning at **start** and running up to but not including **end**.
For example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new `Array<String>` array containing the string form
of
these numbers. For multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of
both 3 and 5 use "FizzBuzz" (see Integer.toString()).

Examples:

* fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
* fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
* fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]

The method has the following prototype:

```kotlin
fun fizzBuzz(start: Int, end: Int): Array<String> {
	// write your code here
}
```

where:

* **start** is the beginning of the number series (included)
* **end** is the end of the number series (excluded)

---

**[MatchUp.kt]** Given two `Array<Int>` v1 and v2 of the same length, for every element in v1, consider the
corresponding
element in v2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less,
but are not equal.

Examples:

* matchUp([1, 2, 3], [2, 3, 10]) → 2
* matchUp([1, 2, 3], [2, 3, 5]) → 3
* matchUp([1, 2, 3], [2, 3, 3]) → 2

The method has the following prototype:

```kotlin
fun matchUp(v1: Array<Int>, v2: Array<Int>): Int {
	// write your code here
}
```

where:

* **v1** is the first array
* **v2** is the second array

---

**[CanBalance.kt]** Given a non-empty array, return true if there is a place to split the array so that the sum of the
numbers on one side is equal to the sum of the numbers on the other side.

Examples:

* canBalance([1, 1, 1, 2, 1]) → true
* canBalance([2, 1, 1, 2, 1]) → false
* canBalance([10, 10]) → true

The method has the following prototype:

```kotlin
fun canBalance(v: Array<Int>): Boolean {
	// write your code here
}
```

where:

* **v** is the array to be evaluated

---

**[SearchArray.kt]** Given a `Array<String>` and a `String` return true if the `String` is contained within
the `Array<String>`.
If the `String` is not present return false. Write two different versions:
(a) uses brute-force search (i.e., which is slow! because tests all elements of the array);
(b) sorts the array and uses binary search (which is much faster!) (see `Array<out T>.binarySearch`)

Both versions should not modify the original array!

Examples:

* containsBruteForce(["car", "boat", "bike", "plane"], "bike") → true
* containsBruteForce(["car", "boat", "bike", "plane"], "helicopter") → false
* containsBinary(["car", "boat", "bike", "plane"], "bike") → true
* containsBinary(["car", "boat", "bike", "plane"], "helicopter") → false

The method has the following prototype:

```kotlin
fun containsBruteForce(strings: Array<String>, searched: String): Boolean {
	// write your code here
}

fun containsBinary(strings: Array<String>, searched: String): Boolean {
	// write your code here
}
```

where:

* **strings** is the array
* **searched** is the string to be searched

---

**[DeepCopy]** Write a method accepting an `Array<Array<Int>>` and returning a deep copy of the original.
Deep copies differ from shallow copies in that the whole multidimensional array is duplicated instead of the first tier
of pointers only.

The method has the following prototype:

```kotlin
fun deepCopy(original: Array<Array<Int>>): Array<Array<Int>> {
	// write your code here
}
```