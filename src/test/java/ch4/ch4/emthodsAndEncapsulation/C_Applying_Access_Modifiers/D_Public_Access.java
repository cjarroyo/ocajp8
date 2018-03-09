package ch4.ch4.emthodsAndEncapsulation.C_Applying_Access_Modifiers;

/*
 * Created by: Cristian Arroyo
 * on 27 February 2018 - 7:55 PM
 */

public class D_Public_Access {
    // Anyone can access the member from anywhere
}

class DuckTeacher {
    public String name = "helpful"; // public access

    public void swim() { // public access
        System.out.println("swim");
    }
}

//DuckTeacher allows access to any class that wants it.

class LostDuckling {
    public void swim() {
        DuckTeacher teacher = new DuckTeacher();
        teacher.swim();
        System.out.println("Thanks" + teacher.name);
    }
}

//LostDuckling is able to refer to swim() and name on DuckTeacher because they are public.

/*
The story has a happy ending.
LostDuckling has learned to swim and can find its parents—all because DuckTeacher made them public.

To review access modifiers, make sure you know why everything in Table 4.2 is true.
Remember that a member is a method or field.
 */

    /*
    TABLE 4.2 Access modifiers
    ==========================

    Can access          If that member is private?      If that member has default (package private) access?         If that member is protected?       If that member is public?
    ___________________________________________________________________________________________________________________________________________________________________________

    Member in the same class    Yes                                 Yes                                                 Yes                                     Yes

    Member in another
    class in same package       No                                  Yes                                                 Yes                                     Yes

    Member in a
    superclass in a
    different package           No                                  No                                                  Yes                                     Yes

    Method/field in a non-
    superclass class in a
    different package           No                                  No                                                  No                                      Yes
    ___________________________________________________________________________________________________________________________________________________________________________
    */