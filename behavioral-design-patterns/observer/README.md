# Observer

## Introduction

**Observer** is a behavioral design pattern that notifies multiple objects or subscribers, about any events that happen to the object they're observing, or publisher. It provides a way to subscribe and unsubscribe from these events.

## Problem

When the user subscribes to a newsletter, the newsletter publisher needs to notify the user about the new newsletter. Instead of the user polling the newsletter publisher for new newsletters.

## Real World Examples

1. Subscription of Newspaper and Magazine.
2. All implementations of `java.util.EventListener` are based on this pattern.

## Structure

**Client**: The client creates publisher and subscriber objects and then registers subscribers for publisher updates.

**Publisher**: The publisher issues events that are observed by subscribers. It allows subscribers to subscribe to its events and unsubscribe from them.

**Subscriber**: The subscriber declares an interface for receiving updates from the publisher.

**ConcreteSubscriber**: The concrete subscriber implements the update method to react to the event.

## Implementation

- [Client](src/Store.java)
- [Publisher](src/NotificationService.java)
- [Subscriber](src/listener/Listener.java)
- [ConcreteSubscriber](src/listener/EmailMsgListener.java)
- [ConcreteSubscriber](src/listener/MobileAppListener.java)

## Advantages

- It follows the **Open/Closed Principle**. You can introduce new subscriber classes without modifying the publisher and other subscribers.

## Disadvantages

- Subscribers are notified in random order.

## References

- [Observer Pattern](https://refactoring.guru/design-patterns/observer)
