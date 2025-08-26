# Interpreter

## Introduction

**Interpreter** is a behavioral design pattern that defines a grammar for a language and provides an interpreter to evaluate sentences in the language. So the Interpreter is kind of a translator or a compiler.

## Problem

Theproblem of interpreting and evaluating expressions within a specific language or grammar, especially when recurring problems can be defined as simple sentences.

## Real World Examples

It is used in Domain Specific Languages (DSL) like SQL, Regex, etc. It is also used in compilers to parse and evaluate the code.

## Structure

**AbstractExpression** is the interface for all the expressions. This is the interface that all the expressions will implement.

**TerminalExpression** is the concrete implementation of the AbstractExpression. It is the leaf node of the expression tree.

**NonTerminalExpression** is the concrete implementation of the AbstractExpression. It is the non-leaf node of the expression tree.

**Context** is the context in which the expression is evaluated.

## Implementation

- [Client](src/Main.java)
- [AbstractExpression](src/AbstractExpression.java)
- [TerminalExpression](src/NumberTerminalExpression.java)
- [NonTerminalExpression](src/ArithmeticNonTerminalExpression.java)
- [Context](src/Context.java)

## Advantages

- It breaks complex grammars into modular components.
- It is easy to implement new expressions.

## Disadvantages

- Limited applicability.

## Relationship with other patterns

The tree structure of the Interpreter design pattern is somewhat similar to that defined by the composite design pattern with terminal expressions being leaf objects and non-terminal expressions being composites.

## References

- [Interpreter Design Pattern](https://www.geeksforgeeks.org/interpreter-design-pattern/)
