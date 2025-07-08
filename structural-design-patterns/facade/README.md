# Facade

## Table of Contents

- [Introduction](#introduction)
- [Problem](#problem)
- [Real world example](#real-world-example)
- [Structure](#structure)
- [Implementation](#implementation)
- [Advantages](#advantages)
- [Disadvantages](#disadvantages)
- [References](#references)

## Introduction

**Facade Pattern** is a structural design pattern that provides a simplified interface to a complex system. It hides the complexities of the system and provides a simple interface for the client to interact with the system.

## Problem

If we are working on a webpage which communicates with multiple services. We will make each call to each service. This will make the code complex and hard to maintain.

## Real world example

1. Home Theatre System
2. Hotel Concierge
3. SDKs
4. Booting up a computer

## Structure

**Client** : The client is the one who wants to use the system.

**Facade** : The facade is the one who provides a simplified interface to the client.

**Subsystem** : The subsystem is the one who provides the actual implementation of the system.

## Implementation

[Client](src/Main.java)
[Facade](src/BookingFacade.java)
[Subsystem](src/TicketSystem.java)
[Subsystem](src/PaymentSystem.java)
[Subsystem](src/NotificationSystem.java)

## Advantages

1. Simplifies the interface to the complex system.
2. Reduces the coupling between the client and the subsystems.
3. Centralizes the control of the system.

## Disadvantages

1. The facade pattern can make the code more complex and harder to maintain.

## References

[Facade Pattern](https://refactoring.guru/design-patterns/facade)
