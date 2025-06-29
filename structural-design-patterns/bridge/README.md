# Bridge

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

**Bridge** is a structural design pattern that divides
business logic or huge class into separate class hierarchies that can be developed independently. The implementation follows the composition over inheritance principle.

## Problem

Let's say when we have a `Shape` class with a pair of subclasses `Circle` and `Square`. We want to incorporate colors, so we plan to create a `Color` class with a pair of subclasses `Red` and `Blue`.

If we use inheritance, we need to create four classes: `RedCircle`, `RedSquare`, `BlueCircle`, and `BlueSquare`.

## Real life examples

The `Bridge` pattern is useful in cross-platform apps, mulitple types of databases servers or working with
several API providers.

## Structure

**Abstraction** : It is a high-level control layer. It delegates the work to the implementation layer.

**Implementation** : It declares the interface that's common for all concrete implementations. An abstraction can only communicate with an implementation object via methods.

**Refined Abstraction** : It provides variants of control
logic. They work with different implementations via implementation interface.

**Concrete Implementation** : It implements the implementation interface and defines its concrete implementation.

**Client** : The class that uses the abstraction.

## Implementation

- [Abstraction](src/Video.java)
- [Implementation](src/VideoProcessor.java)
- [Refined Abstraction](src/YoutubeVideo.java)
- [Refined Abstraction](src/NetflixVideo.java)
- [Concrete Implementation](src/HDProcessor.java)
- [Concrete Implementation](src/UHDProcessor.java)
- [Client](src/Main.java)

## Advantages

- It follows the Open/Closed Principle.
- It follows Single Responsibility Principle.

## Disadvantages

-

## Relationship with other patterns

**Bridge vs Adapter**: Bridge is planned early for independent development, while Adapter fixes compatibility issues in existing code.

Bridge, State, and Strategy patterns look similar because they all use composition to delegate work to other objects. However, each solves a different problem:

- **Bridge**: Separates abstraction from implementation
- **State**: Changes object behavior based on its state
- **Strategy**: Allows switching between different algorithms

**Bridge + Abstract Factory**: Use when specific abstractions only work with certain implementations. The factory hides this complexity from client code.

**Bridge + Builder**: The director becomes the abstraction, while different builders act as implementations.

## References

- [Refactoring Guru](https://refactoring.guru/design-patterns/bridge)
