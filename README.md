# Creation Principle:)
Creation Principle
Creation Principle is a Grasp Principle that helps developers assign Responsibilities to the classes with the most information available. 
For example, we have created two classes and both of them are connected to each other via composition, or Aggregation. Now, the class A is our parent class and class b is child.
Creation principle states that class A is responsible for creating objects of class b.  This helps us maintain the code and promotes low coupling (dependency of two modules on one another). 
It also helps us reduce the amount of code because only parent class is responsible for the creation of the objects of child classes. I hope I have explained it well! Thanks!
I want to give an example to make it a little clearer so let us imagine a library where there is a book section and new books are added every month. So, it’s library’s responsibility to add or remove books. Similarly, A parent class is responsible to add new objects/instances of child class. As the library is dependent on book section. 
Similarly, parent class in case of my code is car factory and child is cars. The car factory is responsible for making new car objects and manage them.

