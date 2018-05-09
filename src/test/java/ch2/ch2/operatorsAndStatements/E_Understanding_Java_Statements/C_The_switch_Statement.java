package ch2.ch2.operatorsAndStatements.E_Understanding_Java_Statements;

/*
 * Created by: Cristian Arroyo
 * on 09 May 2018 - 12:12 PM
 */

import org.junit.Test;

public class C_The_switch_Statement {

    @Test
    public void theSwitchStatement(){

        /**************Supported Data Types******************/
        /*supports any of the primitive numeric wrapper classes, Strin, Enums*/
		/*supports
		   int and Integer
			byte and Byte
			short and Short
			char and Character
			int and Integer
			String
			enum values*/
        /*NO SUPPORT: boolean and long*/

        /**************Compile-time Constant Values******************/
        /*that the data type for case statements must all match the data type of the switch variable*/
		/*int dayOfWeek = 5;
		switch (dayOfWeek) {
		default:
			System.out.println("Weekday");
			break;
		case 0:
			System.out.println("Sunday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}*/
        //output: Weekday

//		int dayOfWeek2 = 5;
//		switch (dayOfWeek2) {
//		case 0:
//			System.out.println("Sunday");
//		default:
//			System.out.println("Weekday");
//		case 6:
//			System.out.println("Saturday");
//			break;
//		}
        //Weekday
        //Saturday

        //The order of the case and default statements is now important
//		int dayOfWeek3 = 6;
//		switch (dayOfWeek3) {
//		case 0:
//			System.out.println("Sunday");
//		default:
//			System.out.println("Weekday");
//		case 6:
//			System.out.println("Saturday");
//			break;
//		}

        //Saturday

        int dayOfWeek4 = 0;
        switch (dayOfWeek4) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }


        //Sunday
        //Weekday
        //Saturday

		/*the case statement value must also be a literal, enum constant, or final constant
		variable.*/
        //getSortOrder("firstName", "lastName");
    }

	/*private int getSortOrder(String firstName, final String lastName) {
		String middleName = "Patricia";
		final String suffix = "JR";
		int id = 0;
		switch (firstName) {
		case "Test":
			return 52;
		case middleName: // DOES NOT COMPILE, tiene que ser un final variable
			id = 5;
			break;
		case suffix:
			id = 0;
			break;
		case lastName: // DOES NOT COMPILE, no es constante, ya que se pasa a la función;
			id = 8;
			break;
		case 5: // DOES NOT COMPILE, match con string
			id = 7;
			break;
		case 'J': // DOES NOT COMPILE, match con string
			id = 10;
			break;
		case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE, , match con string
			id = 15;
			break;
		}
		return id;
	}*/
}
