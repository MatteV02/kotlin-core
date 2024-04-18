# Kotlin's collection framework

## Kotlin Exercises (Generics)

**[IterableToString.kt]** Write a generic function returning a string representing all the elements of an object
implementing the `Iterable<E>` interface. The elements should be separated by commas.

Examples:

* iterableToString([1, 2, 3]) → "1, 2, 3, "
* iterableToString(["a", "b", "c"]) → "a, b, c, "

The method has the following prototype:

```kotlin
fun <E> iterableToString(src: Iterable<E>): String
```

where:

* **src** is the Iterable object to be converted to String.

---

**[Divide.kt]** Write a generic function returning the floating point division of any two numbers regardless of
their specific type e.g. Int, Double, etc. (see kotlin.Number class).

Examples:

* divide(4, 2) → 2.0
* divide(4.0, 2) → 2.0
* divide(4, 2.0) → 2.0

The method has the following prototype:

```kotlin
fun <T: Number> divide(a : T, b: T): Double
```

where:

* **a** is the divided.
* **b** is the divisor.

---

**[Append.kt]** Write a generic static method that appends the elements of one list to another list of the same type.

Examples:

* append([], [1, 2]) → [1, 2]
* append([1, 2], [3, 4]) → [1, 2, 3, 4]
* append(["a", "c"], ["c", "d"]) → ["a", "c", "c", "d"]

The method has the following prototype:

```kotlin
fun <T> append(dst : MutableList<T>, src : List<T>)
```

where:

* **dst** is the destination to which append values.
* **src** is the source of the values.

---

**[AppendBounded.kt]** Modify the exercise Append.kt so that *src* can contain elements of a subclass. For
example, if people is a list of Person objects and students is a list of Student objects, then append(people, students)
should compile but append(students, people) should not. The prototype is not reported because it is the answer.

---

**[Reverse.kt]** Write a generic static method to reverse a list.

Examples:

* reverse([1, 2]) → [2, 1]
* reverse([1, 2, 3, 4]) → [4, 3, 2, 1]
* reverse(["hello", "world"]) → ["world", "hello"]

The method has the following prototype:

```kotlin
fun <T> reverse(list : MutableList<T>)
```

where:

* **list** is the list to be reversed.

---

**[CountOccurrences.kt]** Write a generic static method counting all occurrences of a specific item of type T within a `Array<T>`.
It the passed item is null, the method should return the number of null values within the array.

Examples:

* countOccurrences([1, 2, 2, 2], 2) → 3
* countOccurrences([null, null, 3, 4], null) → 2
* countOccurrences(["hello", "world", null, null], "hello") → 1

The method has the following prototype:

```kotlin
fun <T> countOccurrences(src : Array<T>, item: T?) : Int
```

where:

* **src** is the array to be searched within.
* **item** is the item to be searched.

---

**[BinarySearch.kt]**  Binary search is one of the most popular algorithms. It finds the position of a target value within a sorted array. Write a generic static method implementing binary search within a `Array<T>`, where T is any `Comparable` type. The method returns -1 if the target value is not found.

Examples:

* find([0, 1, 2, 3, 4, 5], 2) → 2
* find([0, 1, 2, 3, 4, 5], 3) → 3
* find([0, 1, 2, 3, 4, 5], -2) → -1
* find([0, 1, 2, 3, 4, 5], 10) → -1

The method has the following prototype:

```kotlin
fun <T : Comparable<T>>  find(array: Array<T>, key: T): Int
```

where:

* **array** is the array to be searched within.
* **key** is the key to be searched.

---

**[Pair.kt]** Define a generic class Pair<K,V> representing a generic pair of objects with different types. The class must have two internal attributes named *first* and *second* of type K and V, respectively. Constructor, getters, and setters are also required.

```kotlin
class Pair<K, V>(/* constructor */) {
    // write code here
}
```

---

**[PairSameType.kt]** Modify the Pair class (see Pair.kt) so that both values have the same type. Furthermore, add a method *swap()* that swaps the first and second elements of the pair.


```kotlin
class PairSameType<T> {
    // ...
    fun swap()
    // ...
}
```

---

**[PairUtil.kt]** Write a generic static method whose argument is a Pair object. The method returns a new pair,
with the first and second element swapped. The method has the following prototype:

```kotlin
fun <K, V> swap(src : Pair<K, V>): Pair<V, K>
```

where:

* **src** is a generic Pair of two objects with different types.

---

**[MapToPairs.kt]** Write a generic static method that, given a Map<K, V>, returns a List<Pair<K, V>> of the key/value pairs in the map (see Map.entrySet()). The method has the following prototype:

```kotlin
fun <K, V> mapToPairs(src: Map<K, V>): List<Pair<K, V>>
```

where:

* **src** is generic key/value map.

---

**[Measure.kt]** Transform the Measurer interface (reported below) into a generic interface. Additionally, implement two static generic methods returning the maximum and minimum values of an array (see prototype below), using a Measurer object as the sorting criterion. Note well: The *measure()* method of the Measurer interface associates every object to an easy to sort double value!

```kotlin
interface Measurer {
    fun measure(obj : Any): Double
}
```

```kotlin
fun <T> max(array: Array<T>, measurer: Measurer<T>): T
fun <T> min(array: Array<T>, measurer: Measurer<T>): T
```

where:

* **array** is the array in which searching for minimum and maximum
* **measurer** is an object implementing the Measurer<T> interface

---

**[MinMax.kt]** Write two generic static methods returning the maximum and minimum values of a generic list. An
instance of Comparator (see kotlin.Comparator<T>) is used as a sorting criterion. The methods have the following
prototype:

```kotlin
fun <T> max(list : List<T>, cmp : Comparator<in T>): T
fun <T> min(list : List<T>, cmp : Comparator<in T>): T
```

where:

* **list** is the list in which searching for minimum and maximum
* **cmp** is an object implementing the Comparator interface

---

**[mycollections package]** Implement a generic version of the minimalist collection framework contained within the
*exercises.collections.mycollections* package.

---