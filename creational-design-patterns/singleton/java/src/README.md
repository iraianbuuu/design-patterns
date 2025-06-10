## Table of Contents

- [Introduction](#introduction)
- [Problem](#problem)
- [Real World Examples](#real-world-examples)
- [Structure](#structure)
- [Implementation in Java](#implementation-in-java)
    - [Eager Initialization](#eager-initialization)
    - [Static Block Initialization](#static-block-initialization)
    - [Lazy Initialization](#lazy-initialization)
    - [Thread Safe Singleton](#thread-safe-singleton)
    - [Bill Pugh Singleton](#bill-pugh-singleton)
    - [Enum Singleton](#enum-singleton)
- [Breaking Singleton](#breaking-singleton)
    - [Serialization](#serialization)
    - [Cloning](#cloning)
    - [Reflection](#reflection)
    - [Multithreading](#multithreading)
- [Advantages](#advantages)
- [Disadvantages](#disadvantages)
- [Relationship with other patterns](#relationship-with-other-patterns)
- [References](#references)

## Introduction

Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

## Problem

The Singleton pattern solves two problems at the same time, violating the Single Responsibility Principle:

1. Ensure that a class has only one instance. (Database connection, Logger, File system)
2. Provide a global access point to that instance. (Global state)

## Real World Examples

1. Passport 
2. Government
3. Logger
4. Database connection pool
5. Caching Mechanism

- It is also used in other design patterns like 
**Abstract Factory, Builder, Prototype, Facade**, etc.

- It is used in core Java classes like **`java.lang.Runtime`** and **`java.awt.Desktop`**

## Structure
<div align="center">
  <img src="/static/images/design-patterns/singleton/structure.png" alt="Singleton Pattern" width="50%" height="50%" />
Source: [Refactoring Guru](https://refactoring.guru/images/patterns/diagrams/singleton/structure-en-indexed-2x.png)
</div>
## Implementation in Java

### Eager Initialization
[Eager Singleton](EagerSingleton.java)

### Static Block Initialization
[Static Block Singleton](StaticBlockSingleton.java)

### Lazy Initialization
[Lazy Singleton](LazySingleton.java)

### Thread Safe Singleton
[Thread Safe Singleton](ThreadSafeSingleton.java)

### Bill Pugh Singleton
[Bill Pugh Singleton](BillPughSingleton.java)

### Enum Singleton
[Enum Singleton](EnumSingleton.java)

## Breaking Singleton

### Serialization
[Serialization](violation/Serialization.java)

### Cloning
[Cloning](violation/Cloning.java)

### Reflection
[Reflection](violation/Reflection.java)

### Multithreading
[Multithreading](violation/MultiThread.java)

## Advantages

- Be sure that a class has only a single instance.
- Control the global access to the instance.
- The singleton object is created only when it is needed.

## Disadvantages

- Violates the Single Responsibility Principle.
- Requires special handling in multithreaded environments.

## Relationship with other patterns

1. **Singleton** can be used to implement other patterns like **Abstract Factory**, **Builder**, and **Prototype**.
2. A **Facade** pattern can often be implemented as a **Singleton** when only one access point is needed.
3. **Singleton** vs **Flyweight**:
   - **Singleton**: Only one instance exists for the entire application
   - **Flyweight**: Multiple instances exist, each with different internal states
   - **Singleton** objects can be changed (mutable), while **Flyweight** objects cannot be changed (immutable)

## References

- [Refactoring Guru](https://refactoring.guru/design-patterns/singleton)
- [Digital Ocean](https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples)