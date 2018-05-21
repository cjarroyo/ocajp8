package ch4.ch4.emthodsAndEncapsulation.I_excercises.my.school;

/*
 * Created by: Cristian Arroyo
 * on 19 May 2018 - 11:19 PM
 */

public class Classroom {
    private int roomNumber;
    protected String teacherName;
    static int globalKey = 54321;
    public int floor = 3;

    Classroom(int r, String t) {
        roomNumber = r;
        teacherName = t;
    }
}
