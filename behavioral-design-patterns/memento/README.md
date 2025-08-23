# Memento

## Introduction

**Memento** is a behavioral design pattern that allows making snapshots of an object’s state and restoring it in future.

## Problem

Imagine that you’re building a text editor application. You’ve decided to implement a versioning feature that would allow users to revert the document to a previous state. The fields of the object are private, so you can’t access them directly.

## Real World Example

All `java.io.Serializable` implementations are based on this pattern.

## Structure

**Originator**: The class can produce snapshots of its own state, as well as restore its state.

**Memento**: A object that acts as a snapshow of the originator's state.

**CareTaker** : The class keep track of the originator's history by storing a list of mementos.

## Implementation

- [Originator](src/TextArea.java)
- [Memento](src/TextArea.java)
- [CareTaker](src/Editor.java)

## Advantages

- Able to produce snapshots of the object's state without violating its encapsulation.

## Disadvantages

- Consume lots of RAM if client create mementos too often.

## Relationship with other patterns

You can use **Command** and **Memento** together to make an "undo" feature. **Command** does the action, and **Memento** saves the state before the action.

**Memento** can also work with **Iterator** to save and restore the current position in a collection.

If your object is simple, you might just use **Prototype** to copy it instead of using **Memento**.

## References

- [Refactoring Guru](https://refactoring.guru/design-patterns/memento)
