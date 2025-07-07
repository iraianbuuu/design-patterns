# Decorator Pattern

## Table of contents

- [Introduction](#introduction)
- [Problem](#problem)
- [Real life examples](#real-life-examples)
- [Structure](#structure)
- [Implementation](#implementation)
- [Advantages](#advantages)
- [Disadvantages](#disadvantages)
- [References](#references)

## Introduction

**Decorator Pattern** is a structural design pattern that allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class. It is used to extend the functionality of a class by wrapping it in another class.

## Problem

For example, we have a `Coffee` class and we want to add some toppings to it. We can create a new class for each topping and then add it to the `Coffee` class. But this approach is not scalable and not flexible. We will end up with a lot of classes and it will be hard to maintain.

## Real life examples

It's used in Java core libraries:

- `java.io.InputStream`
- `java.io.OutputStream`
- `java.io.Reader`
- `java.io.Writer`

## Structure

**Component** is an interface or abstract class that defines the basic functionality of the object.

**ConcreteComponent** is a class that implements the `Component` interface.

**BaseDecorator** is an abstract class that implements the `Component` interface and has a reference to the `Component` object.

**ConcreteDecorator** is a class that implements the `BaseDecorator` class and adds additional functionality to the `Component` object.

## Implementation

- [Component](./src/Character.java)
- [ConcreteComponent](./src/DefaultCharacter.java)
- [BaseDecorator](./src/Upgrade.java)
- [ConcreteDecorator](./src/AttackUpgrade.java)
- [ConcreteDecorator](./src/SpeedUpdgrade.java)

## Advantages

1. It allows to extend an object's behavior without making a new subclass.
2. It allows to add or remove responsibilities to an object dynamically.
3. It allows to combine several behaviors by wrapping an object into multiple decorators.
4. It follows Single Responsibility Principle.

## Disadvantages

1. It is hard to remove a specific wrapper from the wrappers stack.
2. It is hard to implement a decorator in such a way that its behavior doesn't depend on the order in which decorators are stacked.
3. The number of classes in the system increases dramatically when all possible combinations of wrappers are supported.

## References

-[Refactoring.Guru](https://refactoring.guru/design-patterns/decorator)
