# State

## Introduction

**State** is a behavioral design pattern that allows an object to change the behavior when its internal state changes.

## Problem

The problem is that we have a lot of if-else or switch-case statements in our code.

## Real World Examples

The buttons and switches in phone are good example of state pattern.

- When the phone is locked, pressing any button leads to unlock screen.
- When the phone is unlocked, pressing any button leads to different actions.

## Structure

**Client**: The client code can change the phone's state by calling its methods.

**Context**: It stores a reference to one of the concrete state objects and delegates to it all state-specific work.

**State**: An interface declares the state-specfic methods.

**Concrete State**: It provides their own implementation for the state-specific work.

## Implementation

- [Client](src/Main.java)
- [Context](src/context/Phone.java)
- [State](src/state/State.java)
- [Concrete State](src/state/OffState.java)
- [Concrete State](src/state/LockedState.java)
- [Concrete State](src/state/ReadyState.java)

## Advantages

- It follows the open/closed principle. You can introduce new states without changing the existing client code.

- It follows the single responsibility principle. You can move the behavior for each state into its own class.

## Disadvantages

- Applying the pattern can be overkill if a state machine has only a few states and rarely changes.

## Relationship with other patterns

**Bridge**, **State**, and **Strategy** patterns look similar because they all use composition (they use other objects to do work). But they solve different problems.

**State** and **Strategy** both let you change how an object behaves by switching out helper objects. The difference is that in **Strategy**, the helpers don’t know about each other, but in **State**, the helpers (states) can change the context and even switch to other states.

## References

- [State Pattern](https://refactoring.guru/design-patterns/state)
- [Geekific](https://youtu.be/abX4xzaAsoc?si=ojwGeRO63YnTZKBr)
