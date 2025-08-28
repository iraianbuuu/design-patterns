# Template Method

## Introduction

**Visitor** is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.

## Structure

**Element**: It declares interface declares a method for “accepting” visitors.

**Visitor**: It declares a set of visiting methods that can take concrete elements of an object structure as arguments.

**ConcreteElement**: Each Concrete Element must implement the acceptance method. The purpose of this method is to redirect the call to the proper visitor’s method corresponding to the current element class.

**ConcreteVisitor**: Each Concrete Visitor implements several versions of the same behaviors for different concrete elements.

## Implementation

- [Client](src/Main.java)
- [Visitor](src/visitor/Visitor.java)
- [ConcreteVisitor](src/visitor/InsuranceMessagingVisitor.java)
- [Element](src/models/Client.java)
- [ConcreteElement](src/models/Bank.java)
- [ConcreteElement](src/models/Restaurant.java)

## Advantages

- It follows the **Open/Closed Principle**. You can introduce new behaviors to the program without changing its existing code.

- It follows the **Single Responsibility Principle**. You can move multiple behaviors into common classes.

## Disadvantages

- We need to update all visitors each time a class gets added to or removed from the element hierarchy.

## Relationship with other patterns

**Visitor** is like a more flexible **Command** pattern. It lets you run different actions on different types of objects.

**Visitor** can be used to execute an operation over an entire **Composite** tree.

You can also use **Visitor** with **Iterator** to go through a complex structure and perform actions on each element, even if they are different types.

## References

- [Refactoring Guru](https://refactoring.guru/design-patterns/visitor)
