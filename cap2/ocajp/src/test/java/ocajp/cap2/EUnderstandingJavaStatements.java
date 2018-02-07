package ocajp.cap2;

import org.junit.Test;

public class EUnderstandingJavaStatements {
	//executed under certain conditions

	@Test
	public void theIf_thenStatement(){
		//we only want to execute a block of code under certain circumstances
		//Accomplishes this by allowing our application to execute a particular block of code if and only if a boolean expression evaluates to true at runtime.
		
		int morningGreetingCount = 0;
		int hourOfDay = 8;
		
		if(hourOfDay < 11)
			System.out.println("Good Morning");
		
		//usando llaves, multiples statements
		if(hourOfDay < 11) {
			System.out.println("Good Morning");
			morningGreetingCount++;
		}	
	}
	
	@Test	
	public void theIf_then_elseStatement(){
		
		int hourOfDay = 8;
		if (hourOfDay < 11) {
			System.out.println("Good Morning");
		}
		if (hourOfDay >= 11) {
			System.out.println("Good Afternoon");
		}
		
		//mejor usa esto:Now our code is truly branching between one of the two possible options,
		if (hourOfDay < 11) {
			System.out.println("Good Morning");
		} else {
			System.out.println("Good Afternoon");
		}
		
		// tambien
		if (hourOfDay < 11) {
			System.out.println("Good Morning");
		} else if (hourOfDay < 15) {
			System.out.println("Good Afternoon");
		} else {
			System.out.println("Good Evening");
		}
		//if-then-else statements is that order is important
		if (hourOfDay < 15) {
			System.out.println("Good Afternoon");
		} else if (hourOfDay < 11) {
			System.out.println("Good Morning"); // UNREACHABLE CODE
		} else {
			System.out.println("Good Evening");
		}
		
		//OJO
		/*
		int x = 1;
		if(x) { // DOES NOT COMPILE
		...
		}
		*/
		
		/*
		int x = 1;
		if(x = 5) { // DOES NOT COMPILE
			...
		}
		*/
		
		/**************Ternary Operator******************/
		//The conditional operator, ? :
		//booleanExpression ? expression1 : expression2
		//second and third can be any expression that returns a value.
		//The ternary operation is really a condensed form of an ifthen-else statement that returns a value
		int y1 = 10;
		final int x1;
		if (y1 > 5) {
			x1 = 2 * y1;
		} else {
			x1 = 3 * y1;
		} 
		//es equivalente
		int y = 10;
		int x = (y > 5) ? (2 * y) : (3 * y);
		
		/*
		 System.out.println((y > 5) ? 21 : "Zebra"); is ok xqel syso solo imprime
		int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE, xq lo almacena en un int y Horse no es int
		 */
	}
	
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
	
	@Test
	public void thewhileStatement(){
		/*During execution, the boolean expression is evaluated before each iteration of the loop and exits if the evaluation returns false.*/
		/*int roomInBelly = 5;
		public void eatCheese(int bitesOfCheese) {
			while (bitesOfCheese > 0 && roomInBelly > 0) {
				bitesOfCheese--;
				roomInBelly--;
			}
			System.out.println(bitesOfCheese + " pieces of cheese left");*/
			/*you ensure that the while loop can end for either of the conditions*/
		//}
		//tener cuidado con los loops infinitos
	}
	
	
	
	@Test
	public void theDo_whileStatement(){
		//a do-while loop guarantees that the statement or block will be executed at least once.
		int x = 0;
		do {
			x++;
		} while (false);
		System.out.println(x); // Outputs 1
		//Java will execute the statement block first, and then check the loop condition.
		//puedes combinar los 2
	}
	
	@Test
	public void theForStatement() {
        /*loops to a more complex repetition control structure*/

        /*********************The Basic for Statement***********************/

		/*
		for(initialization; booleanExpression; updateStatement) {
		    // Body
        }
		 */
        /*The initialization and update sections may contain multiple statements, separated by commas.*/
        /*
        1.-Variables declared in the initialization block of a for loop have limited scope and are only accessible within the for loop
        */
        //basic example
        /*for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }*/
        //Output: 0 1 2 3 4 5 6 7 8 9
        /*The local variable i is initialized fi rst to 0. The variable i is only in scope for the duration of the loop and is not available outside the loop once the loop has completed*/
        /*there are a number of variations and edge cases you could see on the exam.*/

        /*1. Creating an Infinite Loop*/
        /*for( ; ; ) {
            System.out.println("Hello World");
        }*/
        /* for( ) will not compile.  */

        /*2. Adding Multiple Terms to the for Statement */
//        int x = 0;
//        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
//            System.out.print(y + " ");
//        }
//        System.out.print(x);
        /*you can declare a variable, such as x in this example, before the loop begins and use it after it completes*/
        /*your initialization block, boolean expression, and update statements can include extra variables that may not reference each other. For example, z is defined in the initialization block and is never used*/
        /*the update statement can modify multiple variables.*/
        /*Output: 0 1 2 3 4*/

        /*3. Redeclaring a Variable in the Initialization Block*/
//        int x = 0;
//        for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {// DOES NOT COMPILE, porque x es int, luego lo redeclaran a long
//            System.out.print(x + " ");
//        }

        int x = 0;
        long y = 10;
        for(y = 0, x = 4; x < 5 && y < 10; x++, y++) {//ok
            System.out.print(x + " ");
        }

        /* 4. Using Incompatible Data Types in the Initialization Block */
        //The variables in the initialization block must all be of the same type.
        /*for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) {// DOES NOT COMPILE
            System.out.print(x + " ");
        }*/

        /*5. Using Loop Variables Outside the Loop*/
        /*for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x); // DOES NOT COMPILE
        */
        /* Since x was only scoped for the loop, using it outside the loop will throw a compiler error. */


        /***************************The for-each Statement****************************/
        /*designed for iterating over arrays and Collection objects*/
        /*
        for(datatype instance : collection) {
            // Body
        }
        */
        // composed of an initialization section and an object to be iterated over.
        // The right-hand side must be a built-in Java array or an object whose class implements java.lang.Iterable, which includes most of the Java Collections framework.

        /*final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";
        for(String name : names) {
            System.out.print(name + ", ");
        }
        //output: Lisa, Kevin, Roger,

        java.util.List<String> values = new java.util.ArrayList<String>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        for(String value : values) {
            System.out.print(value + ", ");
        }*/
        //output: Lisa, Kevin, Roger,

        /*String names2 = "Lisa";
        for(String name : names2) { // DOES NOT COMPILE, xq the String names2 is not an array, nor does it implement java.lang. Iterable,
            System.out.print(name + " ");
        }*/

        /*String[] names3 = new String[3];
        for(int name : names3) { // DOES NOT COMPILE, statement does not define an instance of String
            System.out.print(name + " ");
        }*/
    }

	
}
