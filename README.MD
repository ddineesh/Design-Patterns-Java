
|  S.N.|Pattern & Description   |
|---|---|
| 1 | Creational Patterns
These design patterns provide a way to create objects while hiding the creation logic, rather than instantiating objects directly using new operator. This gives program more flexibility in deciding which objects need to be created for a given use case.  |
| 2 | Structural Patterns
These design patterns concern class and object composition. Concept of inheritance is used to compose interfaces and define ways to compose objects to obtain new functionalities.  |
| 3 | Behavioral Patterns
These design patterns are specifically concerned with communication between objects.  |
| 4 | J2EE Patterns
These design patterns are specifically concerned with the presentation tier. These patterns are identified by Sun Java Center.  |



Three types in core of design patterns Gang of Four- GOF:

- Creational   => Dealing with Complexity of objects creation 

	- prototype  => Fully initialized instance to be copied or cloned
	- builder  => Separates the object construction from its representation
	- Singleton => Single instance will be created, whoever request for the object the same instance will be sent => Connection instance
	- Factory = > Create Family of objects. 

 
-Structural    => Structural Dealing with how the classes can be structured

	- Decorator => Add responsibility to the object dynamically
	- Facade  => A single class represents the entire subsystem	
	- Proxy  => Proxy is hiding the complexity of the original implementation by providing the proxy of that => EJB Remote
	- Adapter  => Matches interfaces of two different classes
	- Flyweight => Fine grained instance for the efficient usage  => Data base Connection pools
	
- Behavioral  => behavioral is dealing with how the object behave in a particular situation

	- Chain of responsibility  => way of passing the request between a chain of objects  => Exception handling in Javas
	- Iterator  => sequentially accessing the elements of collections  => Next/previous button in the remote
	- state  => Alter an object behavior when the state changes
	- Strategy => Go with one strategy and add another strategy later => Collection.comparator#compare
	- Observer  => way of notify the changes in class to no of classes => online biding , notify the bid changes to all the observers
	- Visitor  => Defines a new operation to a class without changing it
	- Template Method  => Defer the exact steps  of an algorithm  to a subclass  => House plan
	- Command => Encapsulate a command request as an object => All implementation of javan.lang.Runnable
	- Mememto => Capture and restore an object's internal state => Serialization of Java object
	- Mediator => Defines simplified communication between classes =>  ESB => is the example for Mediator

