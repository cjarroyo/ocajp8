package ch1.ch1.java_buildings_blocks.K_Destroying_Objects;

/*
 * Created by: Cristian Arroyo
 * on 07 May 2018 - 6:17 PM
 */

/*
Now that we’ve played with our objects, it is time to put them away. Luckily, Java auto-
matically takes care of that for you. Java provides a garbage collector to automatically look
for objects that aren’t needed anymore.
All Java objects are stored in your program memory’s heap. The heap, which is also
referred to as the free store, represents a large pool of unused memory allocated to your
Java application. The heap may be quite large, depending on your environment, but there is
always a limit to its size. If your program keeps instantiating objects and leaving them on
the heap, eventually it will run out of memory.
In the following sections, we’ll look at garbage collection and the finalize() method.

 */
public class A_GarbageCollection {
    /*
    Garbage collection refers to the process of automatically freeing memory on the heap by
deleting objects that are no longer reachable in your program. There are many different
algorithms for garbage collection, but you don’t need to know any of them for the exam.
You do need to know that System.gc() is not guaranteed to run, and you should be able to
recognize when objects become eligible for garbage collection.
Let’s start with the first one. Java provides a method called System.gc(). Now you
might think from the name that this tells Java to run garbage collection. Nope! It meekly
suggests that now might be a good time for Java to kick off a garbage collection run. Java is
free to ignore the request.
The more interesting part of garbage collection is when the memory belonging to an
object can be reclaimed. Java waits patiently until the code no longer needs that memory.
An object will remain on the heap until it is no longer reachable. An object is no longer
reachable when one of two situations occurs:
■
■
The object no longer has any references pointing to it.
All references to the object have gone out of scope.

Objects vs. References
====================


Realizing the difference between a reference and an object goes a long way toward
understanding garbage collection, the new operator, and many other facets of the Java
language. Look at this code and see if you can figure out when each object fi rst becomes
eligible for garbage collection:
1: public class Scope {
2: public static void main(String[] args) {
3:
 String one, two;
4:
 one = new String("a");
5:
 two = new String("b");
6:
 one = two;
7:
 String three = one;
8:
 one = null;
9: } }
When you get asked a question about garbage collection on the exam, we recommend
you draw what’s going on. There’s a lot to keep track of in your head and it’s easy to make
a silly mistake trying to keep it all in your memory. Let’s try it together now. Really. Get a
pencil and paper. We’ll wait.
Got that paper? Okay, let’s get started. On line 3, we write one and two. Just the words.
No need for boxes or arrows yet since no objects have gone on the heap yet. On line 4,
we have our fi rst object. Draw a box with the string "a" in it and draw an arrow from the
word one to that box. Line 5 is similar. Draw another box with the string "b" in it this time
and an arrow from the word two. At this point, your work should look like Figure 1.2




fugure


Finally, cross out the line between one and "b" since line 8 sets this variable to null.
Now, we were trying to fi nd out when the objects were fi rst eligible for garbage collection.
On line 6, we got rid of the only arrow pointing to "a", making that object eligible for
garbage collection. "b" has arrows pointing to it until it goes out of scope. This means "b"
doesn’t go out of scope until the end of the method on line 9.


     */
}
