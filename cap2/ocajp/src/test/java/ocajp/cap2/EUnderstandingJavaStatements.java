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
		/*int dayOfWeek2 = 5;
		switch (dayOfWeek2) {
		case 0:
			System.out.println("Sunday");
		default:
			System.out.println("Weekday");
		case 6:
			System.out.println("Saturday");
			break;
		}*/
		//Weekday
		//Saturday
		//The order of the case and default statements is now important
		/*int dayOfWeek3 = 6;
		switch (dayOfWeek3) {
		case 0:
			System.out.println("Sunday");
		default:
			System.out.println("Weekday");
		case 6:
			System.out.println("Saturday");
			break;
		}*/
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
		getSortOrder("firstName", "lastName");
	}
	
	private int getSortOrder(String firstName, final String lastName) {
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
		case lastName: // DOES NOT COMPILE, tiene que ser final variable
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
	}
	
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
		//Java will execute the statement block fi rst, and then check the loop condition.
		//puedes combinar los 2
	}
	
	@Test
	public void theForStatement(){
		
	}

	
}
