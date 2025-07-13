# Flyweight

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

**Flyweight** is a structural design pattern that allows you to fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.

## Problem

Imagine you're building a game where players can create characters with different attributes. Each character has a name, a class, and a set of skills. Instead of creating a new object for each character, you can use a flyweight pattern to share the common attributes between characters.

## Real life examples

It is used in core Java libraries :

`java.lang.Integer.valueOf(int)` (also `Boolean` , `Byte` , `Character` , `Short` , `Long` and `BigDecimal`)

## Structure

**Client** : The client application that contains contexts.

**Context** : Any object(s) within your application that will use the Flyweight Factory.

**Flyweight** : The actual flyweight object that stores the intrinsic attributes and is instantiated when needed by the factory.

**FlyweightFactory** : A factory that creates and manages flyweight objects, ensuring that only one instance of each unique intrinsic state is created.

## Implementation

- [Client](src/Main.java)
- [FlyweightInterface](src/Letter.java)
- [Flyweight](src/DocumentCharacter.java)
- [FlyweightFactory](src/LetterFactory.java)

## Advantages

- Reduces memory usage by sharing common state between multiple objects.

## Disadvantages

- Increases complexity of the code.

## Relationship with other patterns

You can use **Flyweight** to share objects in a **Composite** tree and save memory.

**Flyweight** helps you create many small shared objects. **Facade** is for making one object that hides a whole system.

**Flyweight** and **Singleton** are different:

- **Singleton** has only one instance. **Flyweight** can have many shared objects.
- **Singleton** can change. **Flyweight** objects should not change.

## References

- [Refactoring Guru](https://refactoring.guru/design-patterns/flyweight)
