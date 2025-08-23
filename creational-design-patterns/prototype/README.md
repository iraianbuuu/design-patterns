# Prototype

## Table of contents

- [Introduction](#introduction)
- [Problem](#problem)
- [Real World Examples](#real-world-examples)
- [Implementation](#implementation)
- [Advantages](#advantages)
- [Disadvantages](#disadvantages)
- [Relationship with other patterns](#relationship-with-other-patterns)
- [References](#references)

## Introduction

**Prototype** is a creational design pattern that allows cloning objects, without coupling to their specific classes.

## Problem

If we want to create a exact copy of an object, we create a new object of the same class. We go through all the fields of the original object and copy their values to the new object. The issue is some fields in the original object may be private and not visible.

## Real world Examples

1. Cover Letters - No need to create cover letters for each organization from scratch. Instead, one cover letter will be created.

2. Chess -  Using Prototype pattern, the board may be cloned, from the already existing board object.

In Java, any class can be implemented **Cloneable** interface to become cloneable.

## Implementation

- [Client](src/Client.java)
- [PrototypeRegistry](src/PrototypeRegistry.java)
- [Prototype](src/Vehicle.java)
- [ConcretePrototype](src/Car.java)
- [ConcretePrototype](src/Bus.java)

## Advantages

- Clone objects without coupling to their specific classes.

- Alternative to inheritance.

- Produce complex objects more efficiently.

## Disadvantages

- Cloning objects that have circular references is complex.

## Relationship with other patterns

**Abstract Factory** → Can use **Prototype** to compose methods instead of Factory Methods

**Command Pattern** → **Prototype** helps save command copies in history

**Composite/Decorator** → **Prototype** clones complex structures instead of rebuilding

**Factory Method vs Prototype**:

- **Factory Method**: Uses inheritance, no initialization step
- **Prototype**: No inheritance, requires initialization of cloned objects

**Memento Alternative** → **Prototype** can be simpler when objects are straightforward with easy-to-reestablish external links

**Abstract Factories**, **Builders**, and **Prototypes** can all be implemented as **Singletons**

## References

- [Refactoring Guru](https://refactoring.guru/design-patterns/singleton)
- [Geekific](https://youtu.be/DcFhITC9v0E?si=UU1mdq6ACuBrxy8h)