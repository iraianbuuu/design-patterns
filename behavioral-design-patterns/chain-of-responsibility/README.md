# Chain Of Responsibility

## Table of contents

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

**Chain of Responsibility** is a behavioral design pattern that allows an object to pass a request along a chain of potential handlers until one of them handles the request.

## Problem

Imagine working in validating a form. You have a list of validators that you can use to validate the form. If the first validator is not able to validate the form, it will return leaving the rest of the validators to be executed.

## Real World Examples

1. Logging System
2. ATM Withdrawal
3. Middleware in web applications

## Structure

**Client** : The client is the object that initiates the request.
**Handler** : The handler is the object that handles the request.
**ConcreteHandler** : The concrete handler is the object that implements the handler interface.

## Implementation

- [Client](src/Main.java)
- [Handler](src/PaymentHandler.java)
- [ConcreteHandler](src/BankPaymentHandler.java)
- [ConcreteHandler](src/CreditCardPaymentHandler.java)

## Advantages

- It follows the Single Responsibility Principle.
- It follows the Open/Closed Principle.
- We can able to control the order of request handling.

## Disadvantages

- Some of the handlers may not be able to handle the request.

## Relationship with other patterns

Chain of Responsibility, Command, Mediator, and Observer are patterns that help connect senders and receivers of requests in different ways:

- **Chain of Responsibility**: Passes a request along a chain of handlers. Each handler decides if it will process the request or pass it to the next handler.
- **Command**: Turns a request into an object, allowing you to pass requests as parameters and queue or log them.
- **Mediator**: Makes objects communicate through a central mediator instead of directly with each other.
- **Observer**: Lets objects subscribe to receive updates when something changes.

**Chain of Responsibility** is sometimes used with the **Composite** pattern. For example, if a small part (leaf) of a structure gets a request, it can pass it up through its parent objects.

Handlers in **Chain of Responsibility** can also be used like **Commands**, where each handler performs a different action on the same request. Or, the request itself can be a Command object, passed through a chain of handlers.

**Chain of Responsibility** and **Decorator** patterns look similar because both use a chain of objects. The difference is that in **Chain of Responsibility**, each handler can choose to handle the request or stop passing it along. In **Decorator**, each decorator always passes the request along and only adds extra behavior.

## References

- [Refactoring Guru](https://refactoring.guru/design-patterns/chain-of-responsibility)
- [Head First Design Patterns](https://www.oreilly.com/library/view/head-first-design/0596007124/)
