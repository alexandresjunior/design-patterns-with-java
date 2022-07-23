# Design Patterns with Java

## Concept
* Design patterns are generic solutions to recurring problems in object-oriented software development.
* All design patterns defined by the [Gang of Four (GoF)](./Design_Patterns_Elements_of_Reusable_Object_Oriented_Software.pdf) have a motivation: to solve a recurring problem.

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

## Command
* In many projects, it is common to receive data and execute all tasks in the same class, as is the case presented in [order creation](./05-command/store/), for example.
* However, if we needed, in addition to executing the order generation through the `CLI`, also executing it through a web form, an API and/or messages from a queue, we would need to duplicate all this code in several places.
* The **Command** design pattern is probably one of the most confusing, especially in the web development world in general, since some more specific concepts for the web world have emerged and are different from those existing in desktop applications.
* It is also very interesting to study some software architecture patterns, such as **Domain Driven Design** and **Clean Architecture**, because it is commom to come across the **Command Handlers** pattern (which was applied very simple [in this example](./05-command/store_command/)).

## Observer
* A **Command Handler** is normally responsible for just orchestrating the tasks to be performed, that is, calling the necessary classes that perform the desired tasks. In [this example](./06-observer/store/), the Command Handler had all the code for the stream in its body.
* If at some point one of the tasks stops working, it is known that there is a specific class for this purpose and so one can start debugging through it.
* Also, in case the tool used to send emails changes after a few years, for example, the Command Handler will not need to know this specific detail. Therefore, it is interesting that each class is responsible for only one small task (**encapsulation**).
* The **Observer** pattern, in turn, is commonly used by several libraries that work with **events**. Many Java technologies, such as Spring and CDI, have components that help work with events.
* In short, leaving the implementation of all tasks of an application use case in the same class can cause problems, such as: maintenance difficulties, very large and unreadable classes, and problems when one need to change the implementation of one of the tasks. Therefore, it is more interesting to separate each action in a separate class and link an event that occurred with its actions, through the **Observer** pattern, as exemplified [here](./06-observer/store_observer/).

## Additional Links
* [Refactoring Guru](https://refactoring.guru/pt-br/design-patterns/java)
* Book [Design Patterns](./Design_Patterns_com_Java_Projeto_Orientado_a_Objetos_Guiado_por_Padroes.pdf) in Portuguese (Casa do Código)
* Link to Object-Oriented Programming repo (TBD).