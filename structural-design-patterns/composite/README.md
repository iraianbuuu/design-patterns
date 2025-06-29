# Composite

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

**Composite** is a structural design pattern that allows you to compose objects into tree structures and then work with these structures as if they were individual objects.

## Problem

For example, we have two types of objects : `Product` and `Box`. `Box` can contain multiple `Product`s and `Box`es. To find out the total price of the products in the box, we need to loop through the all the boxes.

## Real life examples

1. File system
2. Menu system
3. Organization chart
4. HTML document

## Structure

**Component** : It is an interface that declares the common operations for both leaf and composite objects.

**Leaf** : It is an object that doesn't have any children. It implements the component interface.

**Composite** : It is an object that can have children. It implements the component interface.

**Client** : It is the class that uses the component interface.

## Implementation

- [Component](src/FileSystem.java)
- [Leaf](src/File.java)
- [Composite](src/Directory.java)
- [Client](src/Main.java)

## Advantages

- Easy to work with complex tree structures
- Follows the Open/Closed Principle.

## Disadvantages

- It might be difficult to provide a common interface for classes whose functionality differs too much.

## Relationship with other patterns

**Builder**: Use Builder to create complex Composite trees with recursive construction steps.

**Chain of Responsibility**: Often used with Composite. When a leaf gets a request, it passes through parent components to the root.

**Iterator**: Use Iterators to traverse Composite trees.

**Visitor**: Use Visitor to execute operations over entire Composite trees.

**Flyweight**: Implement shared leaf nodes as Flyweights to save memory.

**Decorator**: Similar structure to Composite but with only one child. Decorator adds responsibilities, while Composite combines children's results. Can be used together to extend behavior of specific objects in the tree.

**Prototype**: Useful when using Composite and Decorator heavily. Clone complex structures instead of rebuilding them.

## References

- [Refactoring Guru](https://refactoring.guru/design-patterns/composite)
