# Factory Method Design Pattern
Factory method pattern enables us to create object without exposing the creation logic to the client and refer to newly created object using a common interface. It is one of the most widely used creational pattern.

This pattern is also known as Virtual Constructor.

This design pattern define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

Factory Method is for creating objects. A superclass specifies all standard and generic behavior, and then delegates the creation details to subclasses that are supplied by the client.

Factory Method makes a design more customizable and only a little more complicated. Other design patterns require new classes, whereas Factory Method only requires a new operation.
