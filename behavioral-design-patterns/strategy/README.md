# Strategy

## Introduction

**Strategy** is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.

## Real World Examples

Imagine that you have to get to the airport. You can catch a bus, order a cab, or get on your bicycle. These are your transportation strategies.

## Structure

**Context**: It maintains a reference to a concrete strategy object.

**Strategy**: It declares an interface common to all concrete strategies.

**Concrete Strategy**: It implements the algorithm using the Strategy interface.

**Client**: It uses the strategy object to execute the algorithm.

## Implementation

- [Context](src/PaymentService.java)
- [Strategy](src/strategy/PaymentStrategy.java)
- [Concrete Strategy](src/strategy/PaymentByCreditCard.java)

## Advantages

- We can swap algorithms during runtime.
- It follows the Open/Closed Principle. We can introduce new strategies without changing the context and strategies.

## Disadvantages

- Clients must know the differences between strategies to choose the right one.

## Relationship with other patterns

**State** and **Strategy** both let you change how an object behaves by switching out helper objects. The difference is that in **Strategy**, the helpers don’t know about each other, but in **State**, the helpers (states) can change the context and even switch to other states.

**Template Method** is based on inheritance, while **Strategy** is based on composition.

## References

- [Refactoring Guru](https://refactoring.guru/design-patterns/strategy)
