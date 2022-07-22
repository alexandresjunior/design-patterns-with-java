# Design Patterns with Java

## Concept
* Design patterns are generic solutions to recurring problems in object-oriented software development.
* All design patterns defined by the [Gang of Four (GoF)](https://www.amazon.com.br/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612) have a motivation: to solve a recurring problem.

## Categories
There are three main categories of design patterns:
* Behavioral (which will be seen in this course)
* Structural
* Creational

## Strategy
* The **Strategy** pattern aims to solve the problem of having several algorithms for an action, resulting in the possibility of several `if`s (such as [calculating tax](./01-strategy/), for example).
* By using it, we separate each of the possible algorithms into separate classes that implement an interface or a method of an abstract class (**polymorphism**).

## Chain of Responsibility

* On many occasions, having multiple `if`s can be a problem, and having a class that "can grow forever" as new business rules are added is also a problem.
* Whenever a new feature is implemented, it is best to create new code and edit as little existing code as possible. This is one of the main points of SOLID's **Open-Closed Principle**. When editing existing code, we can end up breaking functionality already implemented and working.
* Although it may seem that for the [Discount Calculation example](./02-chain-of-responsibility/) we can apply the **Strategy** pattern, we don't know which discount rule or algorithm to apply in each case.
* For this, the concept of **inheritance** is used to apply a discount within a chain of possible discounts.

## Template Method

* The main advantage of using this pattern is the reuse of common codes between classes, thus avoiding code duplications.
* In [this example](./03-template-method/), an algorithm "template", which was being replicated in more than one class, was created and the concept of **inheritance** was used to reuse this code.
* Thus, the **Template Method** pattern was applied by creating a concrete method in the “parent” class, which in turn calls the abstract methods in the “child” classes.
* It can also be seen that it is possible to apply more than one pattern in the same code, considering that the **Chain of Responsibility** pattern was used in this same example.

## State
* The **State** pattern solves a problem very similar to a problem solved by another pattern, the **Strategy**.
* For the case where it is possible for an object to behave in different ways, depending on its state and the transition rules of this state, this pattern can be applied.
* It is shown in [an example](./04-state/) that an abstract class can be implemented so that it represents the initial state of an object and then its child classes will represent the behavior for each type of state.

## Additional Links
* [Refactoring Guru](https://refactoring.guru/pt-br/design-patterns/java)