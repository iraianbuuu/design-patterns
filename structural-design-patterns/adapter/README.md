# Adapter

## Table of contents

- [Introduction](#introduction)
- [Problem](#problem)
- [Real life examples](#real-life-examples)
- [Structure](#structure)
- [Implementation](#implementation)
- [Advantages](#advantages)
- [Disadvantages](#disadvantages)
- [Relationship with other patterns](#relationship-with-other-patterns)
- [References](#references)

## Introduction

**Adapter** is a structural design pattern that allows objects with incompatible interfaces to collaborate. It is also known as **Wrapper**.

It can be achieved in two ways:

- **Class Level**: Class level mean to adapt something you are extending and doing inheritance of that class.
- **Object Level**: Object level mean you keep has-a relationship with class rather doing tight coupling in system.

## Problem

Imagine you have a legacy codebase that uses an old API, but you need to use a new API. You can't change the old code, so you create an adapter that adapts the old API to the new one.

## Real life examples

It is widely used in Java core libraries like `java.util.Arrays#asList()` method returns an `Arrays` list backed by an array.

## Structure

- Client: The class that wants to use the third-party library or the external system
- Adaptee: A class in the third-party library or the external system that we want to use
- Target interface: The desired interface that the client will use
- Adapter: This class sits between the client and the adaptee and implements the target interface

## Implementation

- [Client](src/ZomatoInventory.java)
- [Target interface](src/Product.java)
- [Adapter](src/GroceryItemAdapter.java)
- [Adaptee](src/GroceryItem.java)

## Advantages

- It follows the Open/Closed Principle. You can introduce new types of adapters without changing the client code (the client code remains unchanged).

- It follows the Single Responsibility Principle. You can separate the interface or data conversion code from the primary business logic of the program.

## Disadvantages

- The overall complexity of the code increases because you need to introduce a lot of new classes.

## Relationship with other patterns

**Bridge vs Adapter**: Bridge is planned from the start to develop parts independently. Adapter is used with existing code to make incompatible classes work together.

**Adapter vs Decorator**: Adapter changes the interface completely. Decorator keeps or extends the same interface and supports recursive composition.

**Adapter vs Proxy**: Adapter uses a different interface. Proxy keeps the same interface.

**Adapter vs Facade**: Facade creates a new interface for multiple objects. Adapter makes existing interfaces work and usually wraps just one object.

**Bridge, State, Strategy, and Adapter** all use composition but solve different problems. Patterns communicate the problem they solve, not just code structure.

## References

- [Refactoring Guru](https://refactoring.guru/design-patterns/adapter)
