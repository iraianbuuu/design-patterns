# Command

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

**Command** is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method arguments, delay or queue a request’s execution, and support undoable operations.

## Problem

Suppose working on button to save the data. You can save the data by clicking the button or pressing the enter key or pressing the `cmd + s` key. But we will end up with a lot of classes to handle all the different ways to save the data.

## Real World Examples

It is used in Java Core Libraries like `java.lang.Runnable` and `javax.swing.Action`.

## Structure

**Client** : It creates and configures the concrete command objects.
**Command** : An interface declares just a single method for executing the command.
**ConcreteCommand** : A concrete command that implements the command interface and contains the logic to execute the command.
**Invoker** : An object that is responsible for executing the command.
**Receiver** : An object that is responsible for performing the actual work.

## Implementation

[Client](src/Main.java)
[Command](src/Command.java)
[ConcreteCommand](src/SaveCommand.java)
[ConcreteCommand](src/OpenCommand.java)
[Invoker](src/TextFileOperationExecutor.java)
[Receiver](src/TextFile.java)

## Advantages

- It follows the Single Responsibility Principle.
- It follows the Open/Closed Principle.
- We can able to implement undo/redo.

## Disadvantages

- The code may become more complex.

## Relationship with other patterns

- Use **Command** and **Memento** together to add "undo" features. Command does the action, Memento saves the state before the action.
- **Command** and **Strategy** both let you pass actions as objects, but Command is for requests (like saving, undo, etc.), while Strategy is for choosing different ways to do the same thing.
- **Prototype** helps if you want to copy Command objects (for example, to keep a history).
- **Visitor** is like a more powerful Command. It can run actions on many different types of objects.

## References

- [Refactoring Guru](https://refactoring.guru/design-patterns/factory-method)
- [Head First Design Patterns](https://www.oreilly.com/library/view/head-first-design/0596007124/)
