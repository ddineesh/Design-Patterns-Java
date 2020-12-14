Three types in core of design patterns:

- Creational   => Dealing with Complexity of objects creation 

	- prototype
	- builder
	- Singleton
	- Factory

 
-Structural    => Structural Dealing with how the classes can be structured
	- Decorator  - Add responsibility to the object dynamically
	- Facade  - A single class represents the entire subsystem	
	-Proxy  => Proxy is 
	-Adapter  => Matches interfaces of two different classes
	-Flyweight => Fine grained instace for the efficient usage  => Data base Connection pools
	
- Behavioural  => Behavioural is dealing with how the object behave in a particular situation

	- Chain of responsibility  => way of passing the request between a chain of objects  => Exception handling in Javas
	- Iterator  => sequentially accessing the elements of collections  => Next/previous button in the remote
	- state  => Alter an object behaviour when the state changes
	- Strategy => Go with one strategy and add another strategy later => Collection.comparator#compare
	- Observer  => way of notify the changes in class to no of classes => online biding , notify the bid changes to all the observers
	- Visitor  => Defines a new operation to a class without changing it
	- Template Method  => Defer the extact steps  of an alogrithum  to a subclass  => House plan
	- Command => Encapsulate a command request as an object => All implementation of javan.lang.Runnable
	- Mememto => Capture and restore an object's internal state => Serialization of Java object
	- Mediator => Defines simlified communication between classes =>  ESB => is the example for Mediator
