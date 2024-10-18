### List of important patterns

Here’s a prioritized list of design patterns, tailored for interviews, focusing on those that are most commonly asked
and are crucial for software design discussions:

#### Singleton Pattern

    • Category: Creational
    • Importance: High
    • Reason: Widely used to restrict object creation to a single instance, especially in managing shared resources like configuration settings, logging, and database connections.

#### Factory Pattern (Factory Method and Abstract Factory)

    • Category: Creational
    • Importance: High
    • Reason: Helps decouple object creation from the client. Frequently asked in interviews to test understanding of
    object creation patterns, interface design, and dependency injection.

#### Observer Pattern

    • Category: Behavioral
    • Importance: High
    • Reason: Commonly used in event-driven systems (like GUIs, real-time systems). It’s important for understanding how
    to establish one-to-many relationships and manage event-driven architectures.

#### Strategy Pattern

    • Category: Behavioral
    • Importance: High
    • Reason: Used to define a family of algorithms and make them interchangeable. Demonstrates understanding of applying
    encapsulation to variations in behavior, making it a frequent interview topic.

#### Decorator Pattern

    • Category: Structural
    • Importance: High
    • Reason: Used to add behavior dynamically to individual objects. It’s a common topic to evaluate knowledge of object
    composition, flexibility, and Open-Closed Principle (OCP).

#### Builder Pattern

    • Category: Creational
    • Importance: High
    • Reason: Helps construct complex objects step by step. Demonstrates handling of complex constructors and immutable
    objects in interviews, especially when working with frameworks like Spring Boot or Lombok.

#### Adapter Pattern

    • Category: Structural
    • Importance: High
    • Reason: Converts the interface of a class into another expected by clients. Frequently used in legacy codebases or
    to integrate with external systems and libraries.

#### Command Pattern

    • Category: Behavioral
    • Importance: Medium
    • Reason: Encapsulates requests as objects. Important for undo/redo operations and queue-based systems, testing the
    candidate’s understanding of request processing and separation of concerns.

#### Prototype Pattern

    • Category: Creational
    • Importance: Medium
    • Reason: Important when dealing with object cloning and performance optimizations. Often asked to test understanding
    of object creation and cloning in Java.

#### Chain of Responsibility Pattern

    • Category: Behavioral
    • Importance: Medium
    • Reason: Important for decoupling senders and receivers of requests and creating flexible, loosely coupled systems.
    Often used in systems like exception handling, middleware, or processing pipelines.

#### Mediator Pattern

    • Category: Behavioral
    • Importance: Medium
    • Reason: Used to reduce complexity by centralizing communication between objects. Often used in UI design, chat
    applications, or systems with multiple interactions.

#### Template Method Pattern

    • Category: Behavioral
    • Importance: Medium
    • Reason: Demonstrates the use of inheritance to define a skeleton of an algorithm. Important in interviews to
    assess abstract class and inheritance usage.

#### Proxy Pattern

    • Category: Structural
    • Importance: Medium
    • Reason: Used to control access to objects, typically in situations requiring lazy loading, security, or logging.
    Important in testing understanding of remote method invocation and lazy initialization.

#### Facade Pattern

    • Category: Structural
    • Importance: Medium
    • Reason: Simplifies interactions with complex systems by providing a unified interface. Important for understanding
    system architecture simplification and code modularity.

#### State Pattern

    • Category: Behavioral
    • Importance: Medium
    • Reason: Used to allow an object to change behavior when its state changes. Useful for interview scenarios
    involving state machines, workflows, or systems where behavior depends on states.

#### Composite Pattern

    • Category: Structural
    • Importance: Medium
    • Reason: Allows clients to treat individual objects and compositions of objects uniformly. Relevant in scenarios
    involving hierarchical structures like file systems or organizational charts.

#### Iterator Pattern

    • Category: Behavioral
    • Importance: Medium
    • Reason: Provides a way to access elements of a collection sequentially without exposing its underlying
    representation. Important for understanding collection traversal and encapsulation.

#### Memento Pattern

    • Category: Behavioral
    • Importance: Medium-Low
    • Reason: Used to capture and restore an object’s internal state. Relevant for systems needing undo mechanisms but
    less commonly asked in interviews.

#### Visitor Pattern

    • Category: Behavioral
    • Importance: Low
    • Reason: Useful for performing operations on elements of an object structure. Complex and less frequently used in
    modern systems but demonstrates understanding of double dispatch.

#### Flyweight Pattern

    • Category: Structural
    • Importance: Low
    • Reason: Reduces memory usage by sharing as much data as possible with similar objects. Important for optimization
    problems, but not a very common interview topic.

### Top Patterns to Focus On for Interviews:

	1.	Singleton
	2.	Factory
	3.	Strategy
	4.	Observer
	5.	Decorator
	6.	Builder
	7.	Adapter

These patterns appear most frequently in interview questions and practical design discussions. Understanding them
deeply, including real-world use cases, trade-offs, and when not to use them, is key for acing design-related
interviews.