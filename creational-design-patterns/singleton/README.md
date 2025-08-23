# Singleton

## Table of Contents

- [Introduction](#introduction)
- [Problem](#problem)
- [Real World Examples](#real-world-examples)
- [Implementation](#implementation)
- [Breaking Singleton](#breaking-singleton)
- [Best Singleton Approach Based on Use Case](#best-singleton-approach-based-on-use-case)
- [Singleton Pattern Comparison Table](#singleton-pattern-comparison-table)
- [Advantages](#advantages)
- [Disadvantages](#disadvantages)
- [Relationship with other patterns](#relationship-with-other-patterns)
- [References](#references)

## Introduction

**Singleton** is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

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

## Implementation

- [Eager Singleton](src/EagerSingleton.java)

- [Static Block Singleton](src/StaticBlockSingleton.java)

- [Lazy Singleton](src/LazySingleton.java)

- [Thread Safe Singleton](src/MultiThreadSingleton.java)

- [Bill Pugh Singleton](src/BillPughSingleton.java)

- [Enum Singleton](src/EnumSingleton.java)

## Breaking Singleton

- [Serialization](violation/Serialization.java)

- [Cloning](violation/Cloning.java)

- [Reflection](violation/Reflection.java)

- [Multithreading](violation/MultiThread.java)

## Best Singleton Approach Based on Use Case

| **Use Case**                                    | **Recommended Approach**            | **Reason**                                      |
| ----------------------------------------------- | ----------------------------------- | ----------------------------------------------- |
| Lightweight Singleton (Logger, ConfigManager)   | `enum Singleton`                    | Simple, thread-safe, and secure                 |
| Heavyweight object (Database Connection, Cache) | Double-Checked Locking (`volatile`) | Lazy loading with good performance              |
| Lazy + clean implementation                     | Bill Pugh Singleton                 | JVM-based lazy loading, no sync/volatile needed |
| Requires parameters or dynamic config           | Classic Singleton with custom init  | `enum` doesn't allow passing arguments          |
| Needs inheritance                               | Class-based Singleton (not `enum`)  | `enum` can't extend other classes               |
| High security (avoid reflection/serialization)  | `enum Singleton`                    | Fully immune to reflection and deserialization  |

---

## Singleton Pattern Comparison Table

| Feature                    | `enum` Singleton | Double-Checked Locking        | Bill Pugh Singleton           | Simple `synchronized` |
| -------------------------- | ---------------- | ----------------------------- | ----------------------------- | --------------------- |
| Thread-safe                | ✅ Yes           | ✅ Yes                        | ✅ Yes                        | ✅ Yes                |
| Lazy Initialization        | ❌ No            | ✅ Yes                        | ✅ Yes                        | ✅ Yes                |
| Prevents Reflection Attack | ✅ Yes           | ❌ No                         | ❌ No (needs guard)           | ❌ No                 |
| Serialization Safe         | ✅ Yes           | ❌ No (needs `readResolve()`) | ❌ No (needs `readResolve()`) | ❌ No                 |
| Uses `volatile`            | ❌ No            | ✅ Yes                        | ❌ No                         | ❌ No                 |
| Uses `synchronized`        | ❌ No            | ✅ Yes (conditionally)        | ❌ No                         | ✅ Yes                |
| Easy to Implement          | ✅ Easiest       | ❌ Medium                     | ✅ Clean & Simple             | ✅ Simple             |
| Good for Heavy Objects     | ❌ Not Ideal     | ✅ Yes                        | ✅ Yes                        | ❌ Less efficient     |
| Constructor Arguments      | ❌ Not possible  | ✅ Yes                        | ✅ Yes                        | ✅ Yes                |

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
- [Daily Code Buffer](https://youtu.be/ASI0TfcY_7U?si=UEDTjKJdGbjb2HKE)
