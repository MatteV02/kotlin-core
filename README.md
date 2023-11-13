# Kotlin-core

> [!WARNING]
> This repository is still a work in progress: links may not work, exercises may be missing or still not resolved,
> etc.  
> If you have particular requests (eg. you want an exercise to be resolved soon, can't find anymore a file, link
> broken), **please open an issue**!

This repository is an adaptation of the exercises provided
in [nbicocchi/java-core](https://github.com/nbicocchi/java-core/tree/main) for Kotlin programming language.  
I've made this repo mainly for making practice in Kotlin language. Feel free to comment my work by opening GitHub
issues! Any help is accepted!

## TODOs

- [ ] upload exercises from [nbicocchi/java-core](https://github.com/nbicocchi/java-core/tree/main)
	- [ ] adapt the exercises texts to Kotlin language
- [ ] adapt README.md package descriptions to Kotlin
- [ ] resolve exercises
	- [ ] [warmup](README.md#1-basics)
	- [ ] [arrays](README.md#1-basics)
	- [ ] [strings](README.md#1-basics)
	- [ ] [oop](README.md#2-object-oriented-design)
	- [ ] [collections](README.md#3-data-structures-kotlin-collections)
	- [ ] [generics](README.md#4-generic-data-structures-generics)
	- [ ] [functional](README.md#5-functional-programming)
	- [ ] [exception](README.md#6-exceptions)
	- [ ] [IO](README.md#7-io-framework)
	- [ ] [multi-threading](README.md#8-multi-threading)
- [ ] Project modules
	- [ ] GUI application with [Kotlin multiplatform](https://www.jetbrains.com/kotlin-multiplatform/)
	- [ ] DB application

## Exercises Modules

### 1. Basics

> _Packages_: [com.MatteV02.exercises.warmup](src/main/kotlin/com/MatteV02/exercises/warmup), [com.MatteV02.exercises.arrays](src/main/kotlin/com/MatteV02/exercises/arrays), [com.MatteV02.exercises.strings](src/main/kotlin/com/MatteV02/exercises/strings)

- Variables, methods and parameter passing
- Fundamental data types
- Decisions
- Loops
- Arrays (and brief introduction to ArrayList)
- Strings
- Input and output (`print`, `println`, input from keyboard)
- Random numbers
- [Coding Standard](https://kotlinlang.org/docs/coding-conventions.html)

### 2. Object Oriented Design

> _Packages_: [com.MatteV02.exercises.oop](src/main/kotlin/com/MatteV02/exercises/oop)

* Instance variables and encapsulation
* Specifying the public interface of a class (and its implementation)
* Static variables and methods
* Inheritance hierarchies
* Abstract classes
* Interfaces (and anonymous implementations)
* Object: the cosmic superclass
* Wrapper types
* UML class diagrams

### 3. Data Structures (Kotlin Collections)

> *Packages*: [com.MatteV02.exercises.collections](src/main/kotlin/com/MatteV02/exercises/collections)

* Iterable and Iterator interfaces
* List interface and its implementations (ArrayList, LinkedList)
* Set interface and its implementations (HashSet, LinkedHashSet, TreeSet)
* Deque interface and its implementations (ArrayDeque, LinkedList)
* Map interface and its implementations (HashMap, LinkedHashMap, TreeMap)
* Sorting and searching

### 4. Generic Data Structures (Generics)

> _Packages_: [com.MatteV02.exercises.generics](src/main/kotlin/com/MatteV02/exercises/generics)

* Generic classes and type parameters
* Implementing generic types
* Generic methods
* Constraining type parameters
* Type erasure

### 5. Functional Programming

> _Packages_: [com.MatteV02.exercises.functional](src/main/kotlin/com/MatteV02/exercises/functional)

* Lambda expressions
* Functional interfaces
* Producing, transforming, and collecting functional streams
* null-safety

### 6. Exceptions

> _Packages_: [com.MatteV02.exercises.exceptions](src/main/kotlin/com/MatteV02/exercises/exceptions)

* Throwing exceptions
* Catching exceptions
* Checked and unchecked exceptions
* Closing resources

### 7. IO Framework

> _Packages_: [com.MatteV02.exercises.io](src/main/kotlin/com/MatteV02/exercises/io)

* Manipulating paths
* Manipulating filesystem (copy, move, etc)
* Reading and writing files

### 8. Multi-threading

> _Packages_: [com.MatteV02.exercises.threads](src/main/kotlin/com/MatteV02/exercises/threads)

* Thread states
* Thread interference
* Thread synchronisation (synchronised/wait/notify)
* ExecutorService
* Callable/Future/Task
