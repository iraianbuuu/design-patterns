# Proxy Pattern

## Table of contents

- [Introduction](#introduction)
- [Problem](#problem)
- [Real life examples](#real-life-examples)
- [Structure](#structure)
- [Implementation](#implementation)
- [Advantages](#advantages)
- [Disadvantages](#disadvantages)
- [Relationship with other patterns](#relationship-with-other-patterns)
- [References](#references)

## Introduction

**Proxy** is a structural design pattern that allows you to provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request reaches the original object.

Types of Proxies :

- **Remote Proxy** : A proxy that controls access to a remote object.

- **Virtual Proxy** : A proxy that controls access to a resource that is expensive to create.

- **Protection Proxy** : A proxy that controls access to a resource based on the user's permissions.

- **Smart Reference** : A proxy that dismiss a heavyweight object once there are no clients that use it.

- **Caching Proxy** : A proxy that controls access to a resource by caching it.

- **Logging Proxy** : A proxy that controls access to a resource by logging the requests.

## Problem

You have a complex object that contains sensitive business logic. You want to reduce access to it, so only specific clients can access it.

## Real life examples

1. ATM Machines
2. Proxy Servers
3. Database Connection

It is also used in Java Core Libraries like `java.lang.reflect.Proxy` and `java.rmi.*`.

## Structure

**Client** : It is a class that uses the Service to get some work done.

**Service** : It is class that provides some useful business logic.

**Service Interface** : It declares the interface of the Service. The Proxy must follow this interface to be able to disguise itself as a Service.

**Proxy**: It has a reference to the service object. After receiving a request from the client, the proxy creates a real service and delegates the request to it.

## Implementation

- [Client](src/Main.java)
- [Service](src/BankAccount.java)
- [Service Interface](src/Account.java)
- [Proxy](src/ATM.java)

## Advantages

- You can control the service object without client knowing.
- It follows Open/Closed Principle

## Disadvantages

- The response from the service may be delayed.
- The code may become more complicated.

## Relationship with other patterns

- **Adapter** changes the interface of an object. **Proxy** keeps the same interface but adds control over access. **Decorator** adds new features to an object, also keeping the same interface.
- **Facade** and **Proxy** both hide complexity, but Facade gives a new interface, while Proxy keeps the original interface.

- **Decorator** and **Proxy** look similar, but Proxy controls access, while Decorator adds extra behavior.

## References

- [Refactoring Guru](https://refactoring.guru/design-patterns/proxy)
