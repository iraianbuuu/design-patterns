# Builder Pattern

## Table of Contents

- [Introduction](#introduction)
- [Problem](#problem)
- [Real World Examples](#real-world-examples)
- [Structure](#structure)
- [Implementation](#implementation)
- [Advantages](#advantages)
- [Disadvantages](#disadvantages)
- [Relationship with other patterns](#relationship-with-other-patterns)
- [References](#references)

## Introduction

**Builder** is a creational design pattern that allows you to construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

## Problem

Imagine you are building a house. You need to build a foundation, walls, and a roof. If you want to build a bigger house with different styles, you need to create different subclasses for each part of the house.

There is an another approach to build a house. You create a giant constructor with all the parameters and you pass all the parameters to the constructor.While this approach indeed eliminates the need for subclasses, it creates another problem.

In most cases, the constructor parameters are used rarely, and when you have a lot of parameters, it is hard to understand what each parameter does.

## Real World Examples

It is widely used in Java core libraries, such as `StringBuilder`, `StringBuffer`, and `java.nio.ByteBuffer`.

## Structure

- **Builder** : The interface that the ConcreteBuilder implements.

- **ConcreteBuilder** : The class that implements the Builder Interface.

- **Director** : The class that uses the builder to build the product.

- **Product** : The complex object to be built.

## Implementation

[Builder](src/URLBuilder.java)

[Product](src/URL.java)

[Director/Client](src/Main.java)

## Advantages

- It allows you to construct complex objects step by step.
- It allows you to reuse the same construction code for different types of objects.
- Follows the Single Responsibility Principle (Isolates complex object construction code from its business logic).

## Disadvantages

- The code may become more complicated if there are many configuration steps.

## Relationship with other patterns

- **Factory Method** is often the starting point before moving to more complex patterns like Builder.

- **Builder** creates objects step by step, while **Abstract Factory** creates families of related objects all at once.

- **Builder** works well for creating complex hierarchical structures(**Composite**).

- **Builder** can work with **Bridge** pattern where the director is the abstraction and builders are implementations.

- **Builder** can be implemented as a **Singleton**.

## References

- [Refactoring Guru](https://refactoring.guru/design-patterns/abstract-factory)
- [Head First Design Patterns](https://www.oreilly.com/library/view/head-first-design/0596007124/)