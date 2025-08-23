# Iterator

## Introduction

**Iterator** is a behavioral design pattern that allows sequential access to the elements of a collection without exposing its underlying representation.

## Problem

For simple data-structures like arrays and linked lists, the client can access the elements sequentially using a loop. However, for more complex data-structures like trees and graphs, the client needs to implement a custom iterator to traverse the elements.

## Real World Examples

It is used in core Java libraries like `java.util.Iterator` and `java.util.Enumeration`.

## Structure

**Client** : It uses the iterator to traverse the collection.

**Iterator** : An interface that declares the methods for traversing the collection.

**ConcreteIterator** : A concrete iterator that implements the iterator interface and implements the logic for traversing the collection.

**Aggregate** : An interface that declares the method for creating an iterator.

**ConcreteAggregate** : A concrete aggregate that implements the aggregate interface and returns a concrete iterator.

## Implementation

- [Client](src/Main.java)
- [Iterator](src/walker/Walker.java)
- [ConcreteIterator](src/walker/SimpleOrderWalker.java)
- [Aggregate](src/song/Songs.java)
- [ConcreteAggregate](src/song/SimpleOrderSongs.java)

## Advantages

- It follows the Single Responsibility Principle. Each algorithm has its own traversal logic.
- It follows the Open/Closed Principle. We can easily add new types of traversals without changing the existing code.

## Disadvantages

- Not good if our app works with simple collections.

## Relationship with other patterns

- **Iterator** can help you go through **Composite** structures.
- **Factory Method** can be used with **Iterator** to create different kinds of iterators for collections.
- **Memento** can save the current position of an **Iterator** and restore it later.
- **Visitor** can be used with **Iterator** to perform actions on each element in a complex structure.

## References

- [Refactoring Guru](https://refactoring.guru/design-patterns/iterator)
