package ch5.ch5.class_design.B_Creating_Abstract_Classes;

/*
 * Created by: Cristian Arroyo
 * on 14 May 2018 - 2:30 PM
 */

public class C_Extending_an_Abstract_Class {
    /*
    Let’s expand our discussion of abstract classes by introducing the concept of extending an
abstract class with another abstract. We’ll repeat our previous Walrus example with one
minor variation:
public abstract class Animal {
public abstract String getName();
}
public class Walrus extends Animal { // DOES NOT COMPILE
}
public abstract class Eagle extends Animal {
}

In this example, we again have an abstract class Animal with a concrete subclass Walrus
that doesn’t compile since it doesn’t implement a getName() method. We also have an
abstract class Eagle, which like Walrus extends Animal and doesn’t provide an implementa-
tion for getName(). In this situation, Eagle does compile because it is marked as abstract.
Be sure you understand why Walrus doesn’t compile and Eagle does in this example.
As you saw in this example, abstract classes can extend other abstract classes and are
not required to provide implementations for any of the abstract methods. It follows, then,
that a concrete class that extends an abstract class must implement all inherited abstract
methods. For example, the following concrete class Lion must implement two methods,
getName() and roar():
public abstract class Animal {
public abstract String getName();
}
public abstract class BigCat extends Animal {
public abstract void roar();
}
public class Lion extends BigCat {
public String getName() {
return "Lion";
}
public void roar() {
System.out.println("The Lion lets out a loud ROAR!");
}
}
In this sample code, BigCat extends Animal but is marked as abstract; therefore, it is
not required to provide an implementation for the getName() method. The class Lion is
not marked as abstract, and as the first concrete subclass, it must implement all inherited
abstract methods not defi ned in a parent class.
There is one exception to the rule for abstract methods and concrete classes: a concrete
subclass is not required to provide an implementation for an abstract method if an interme-
diate abstract class provides the implementation. For example, take a look at the following
variation on our previous example:
public abstract class Animal {
public abstract String getName();
}
public abstract class BigCat extends Animal {
public String getName() {

return "BigCat";
}
public abstract void roar();
}
public class Lion extends BigCat {
public void roar() {
System.out.println("The Lion lets out a loud ROAR!");
}
}
In this example, BigCat provides an implementation for the abstract method getName()
defi ned in the abstract Animal class. Therefore, Lion inherits only one abstract method,
roar(), and is not required to provide an implementation for the method getName().
Here’s one way to think about this: if an intermediate class provides an implementation
for an abstract method, that method is inherited by subclasses as a concrete method, not
as an abstract one. In other words, the subclasses do not consider it an inherited abstract
method because it is no longer abstract by the time it reaches the subclasses.
The following are lists of rules for abstract classes and abstract methods that we have
covered in this section. Review and understand these rules before taking the exam.
Abstract Class Definition Rules:
1.
2.
3.
4.
5.
Abstract classes cannot be instantiated directly.
Abstract classes may be defined with any number, including zero, of abstract and non-
abstract methods.
Abstract classes may not be marked as private or final.
An abstract class that extends another abstract class inherits all of its abstract methods
as its own abstract methods.
The first concrete class that extends an abstract class must provide an implementation
for all of the inherited abstract methods.
Abstract Method Definition Rules:
1.
2.
3.
4.
Abstract methods may only be defined in abstract classes.
Abstract methods may not be declared private or final.
Abstract methods must not provide a method body/implementation in the abstract
class for which is it declared.
Implementing an abstract method in a subclass follows the same rules for overriding a
method. For example, the name and signature must be the same, and the visibility of
the method in the subclass must be at least as accessible as the method in the parent
class.


     */
}
