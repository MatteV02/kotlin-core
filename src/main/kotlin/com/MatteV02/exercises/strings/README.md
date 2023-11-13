# Kotlin Strings

**[Concatenate.kt]** Write a method accepting a `Array<String>` returning a single string representing the concatenation
of all strings of the array (see `text.StringBuilder` class).

Examples:

* concatenate(["Hello", " ", "World!"]) → "Hello World!"
* concatenate(["H", "e", "llo", " ", "World!"]) → "Hello World!"
* concatenate(["Hello World", "!"]) → "Hello World!"

The method has the following prototype:

```kotlin
fun concatenate(strings: Array<String>): String {
    // write your code here
}
```

where:

* **strings** is the `String` array to be concatenated

---

**[Reverse.kt]** Write a method accepting a string and returning the reversed string (see `String.get()` method).

Examples:

* reverse("String test") → "tset gnirtS"
* reverse("John Doe") → "eoD nhoJ"
* reverse("Hello World!") → "!dlroW olleH"

The method has the following prototype:

```kotlin
fun reverse(string: String): String {
    // write your code here
}
```

where:

* **string** is the string to be reversed

---

**[RemoveFirstTwoChars.kt]** Write a method accepting a string and returning the same string without the first two
characters (see `StringBuilder` class).

Examples:

* removeFirstTwoChars("Hello World!") → "llo World!"
* removeFirstTwoChars("No") → ""
* removeFirstTwoChars("Y") → ""

The method has the following prototype:

```kotlin
fun removeFirstTwoChars(string: String): String {
    // write your code here
}
```

where:

* **string** is the string to be processed

---

**[RemoveFirstTwoCharsIf.kt]** Write a method accepting a string and returning the same string without the first
two characters. Keep the first character if it is 'H' and keep the second character if it is 'e' (see `StringBuilder`
class).

Examples:

* removeFirstTwoCharsIf("Hello World!") → "Hello World!"
* removeFirstTwoCharsIf("Good World!") → "od World!"
* removeFirstTwoCharsIf("Ho") → "H"
* removeFirstTwoCharsIf("Ne") → "e"
* removeFirstTwoCharsIf("Y") → ""

The method has the following prototype:

```kotlin
fun removeFirstTwoCharsIf(string: String): String {
    // write your code here
}
```

where:

* **string** is the string to be processed

---

**[GoodAtTheBeginning.kt]** Write a method accepting a string and returning a boolean value. The function returns
true if "good" appears at the beginning of the string (see `String.get()` method).

Examples:

* goodAtTheBeginning("good Sweet") → true
* goodAtTheBeginning(" good Sweet") → false
* goodAtTheBeginning("goo") → false

The method has the following prototype:

```kotlin
fun goodAtTheBeginning(string: String): Boolean {
    // write your code here
}
```

where:

* **string** is the string to be processed

---

**[GoodAroundTheBeginning.kt]** Write a method accepting a string and returning true if "good" appears either at index 0
or 1 of the given string (see `String.startsWith()` method).

Examples:

* goodAroundTheBeginning("good Sweet") → true
* goodAroundTheBeginning("_good Sweet") → true
* goodAroundTheBeginning("__good Sweet") → false
* goodAroundTheBeginning("goo") → false

The method has the following prototype:

```kotlin
fun goodAroundTheBeginning(string: String): Boolean {
    // write your code here
}
```

where:

* **string** is the string to be processed

---

**[RemoveFirstLast.kt]** Write a method accepting a string and returning the same string trimmed of the first and
last characters if the first and last characters are equal. Otherwise, the original string is returned (see
`String.substring()`, `String.get()` methods).

Examples:

* removeFirstLast("google") → "google"
* removeFirstLast("aenema") → "enem"
* removeFirstLast("FF") → ""
* removeFirstLast("F") → "F"

The method has the following prototype:

```kotlin
fun removeFirstLast(string: String): String {
    // write your code here
}
```

where:

* **string** is the string to be processed

---

**[DuplicateChars.kt]** Write a method accepting a string and returning all recurring characters contained into the
string as a `Array<Char>`. More specifically, recurring characters have to be returned in alphabetical order (
see `String.contains()`, `String.toCharArray()`). For example: headmistressship -> [e,h,i,s].

Examples:

* duplicateChars("whistleblower") → [e, l, w]
* duplicateChars("ss") → [s]
* duplicateChars("s") → []
* duplicateChars("") → []

The method has the following prototype:

```kotlin
fun duplicateChars(string: String): Array<Char> {
    // write your code here
}
```

where:

* **string** is the string to be processed

---

**[Palindrome.kt]** Write a method accepting a string and returning true if the string is a palindrome (
see `StringBuilder` class).

Examples:

* palindrome("whistleblower") → false
* palindrome("radar") → true
* palindrome("r") → true
* palindrome("") → true

The method has the following prototype:

```kotlin
fun isPalindrome(string: String): Boolean {
    // write your code here
}
```

where:

* **string** is the string to be processed

---

**[CountYZ.kt]** Write a method accepting a string, and counting the number of words ending in 'y' or 'z' so the 'y'
in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case-sensitive) (you can use Java `Scanner`
class if you are in trouble).

Examples:

* countYZ("fez day") → 2
* countYZ("day fez") → 2
* countYZ("day fyyyz") → 2

The method has the following prototype:

```kotlin
fun countYZ(string: String): Int {
    // write your code here
}
```

where:

* **string** is the string to be processed

---

**[EqualIsNot.kt]** Write a method accepting a string, and returning true if the number of appearances of "is" anywhere
in the string is equal to the number of appearances of "not" anywhere in the string (case-sensitive) (
See `String.indexOf()`).

Examples:

* equalIsNot("This is not") → false
* equalIsNot("This is notnot") → true
* equalIsNot("noisxxnotyynotxisi") → true

The method has the following prototype:

```kotlin
fun equalIsNot(string: String): Boolean {
    // write your code here
}
```

where:

* **string** is the string to be processed

---

**[SumDigits.kt]** Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other
characters. Return 0 if there are no digits in the string. (see `Character` class)

Examples:

* sumDigits("aa1bc2d3") → 6
* sumDigits("aa11b33") → 8
* sumDigits("Chocolate") → 0

The method has the following prototype:

```kotlin
fun sumDigits(string: String): Int {
    // write your code here
}
```

where:

* **string** is the string to be processed
