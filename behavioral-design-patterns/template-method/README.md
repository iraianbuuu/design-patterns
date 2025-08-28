# Template Method

## Introduction

**Template Method** is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

## Real World Examples

Template Method can be used when building houses. There is a general plan for building a house, but some steps can be changed to fit the owner's needs. For example, you can change how the foundation is laid or what kind of walls are built, but the main steps stay the same.

## Structure

**AbstractClass**: It declares an interface for an algorithm. It also implements a template method defining the skeleton of an algorithm.

**ConcreteClass**: It implements the primitive operations to carry out specific steps of the algorithm.

**Client**: It calls the template method to execute the algorithm.

## Implementation

- [AbstractClass](src/Game.java)
- [ConcreteClass](src/Football.java)
- [ConcreteClass](src/Tennis.java)
- [Client](src/Client.java)

## Advantages

- It lets clients override only certain parts of a large algorithm, making them less affected by changes that happen to other parts of the algorithm.

- It pulls the duplicate code into a superclass.

## Disadvantages

- It might violate the **Liskov Substitution Principle** by suppressing a default step implementation via a subclass.

## Relationship with other patterns

**Factory Method** is a type of **Template Method**. Sometimes, a Template Method can use a Factory Method as one of its steps.

**Template Method** uses inheritance: you change parts of an algorithm by making a subclass. **Strategy** uses composition: you change behavior by giving the object a different strategy. **Template Method** is fixed at the class level, while **Strategy** lets you change behavior at runtime.

## References

- [Refactoring Guru](https://refactoring.guru/design-patterns/template-method)
