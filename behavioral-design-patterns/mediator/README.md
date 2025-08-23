# Mediator

## Introduction

Mediator is a behavioral design pattern that reduces coupling between components of a program by making them communicate indirectly, through a special mediator object.

## Problem

The problem is that the components of a program try to communicate directly with each other, triggering a chain of cascading updates. This makes the program hard to change because any single change may break the entire system.

## Real World Examples

Some of the real world examples are :

- Chat rooms
- Online auctions
- Air traffic control

It is used in Java Core libraries like :

- `java.util.concurrent.ExecutorService`
- `java.util.Timer`

## Structure

**Mediator** : An interface that declares a method for communicating with components.

**ConcreteMediator** : Implements the communication protocol of the mediator.

**Component** : A component that communicates with the mediator. Each component has a reference to the mediator object and can send messages to it.

**ConcreteComponent** : Implements the communication protocol of the component.

## Implementation

-[Client](src/Main.java)
-[Mediator](src/ChatMediator.java)
-[ConcreteMediator](src/ChatMediatorImpl.java)
-[Component](src/User.java)
-[ConcreteComponent](src/UserImpl.java)

## Advantages

- Decoupling and centralized control
- Follows the Single Responsibility Principle. Each component has its own logic.
- Follows the Open/Closed Principle. We can introduce new mediators without changing the existing code.

## Disadvantages

- The mediator can become a God object

## Relationship with other patterns

- **Chain of Responsibility**: Passes a request along a chain until someone handles it.
- **Command**: Sends a request from one object to another.
- **Mediator**: Makes objects communicate through a central mediator instead of directly.
- **Observer**: Lets objects subscribe to updates from another object.

**Facade** and **Mediator** both help organize communication:

- Facade gives a simple interface to a group of classes, but the classes still talk to each other directly.
- Mediator makes all communication go through one central object.

**Mediator vs Observer**:

- Mediator removes direct links between objects and puts a mediator in the middle.
- Observer lets objects listen for changes in other objects.

Sometimes, Mediator can use Observer inside it, so they can look similar. The main difference is that Mediator centralizes communication, while Observer is about subscribing to updates.

In short: use Mediator to centralize communication, and Observer to let objects react to changes in others.

## References

-[Refactoring Guru](https://refactoring.guru/design-patterns/mediator)
