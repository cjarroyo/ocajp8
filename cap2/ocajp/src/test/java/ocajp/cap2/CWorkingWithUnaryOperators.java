package ocajp.cap2;

import org.junit.Test;

public class CWorkingWithUnaryOperators {
	/*unary operator is one that requires exactly one operand, or variable, to function*/
	/*
	 TABLE 2. 2 Java unary operators
	______________________________________
	Unary operator 			Description
	______________________________________
		+ 					Indicates a number is positive, although numbers are assumed to be positive in Java unless accompanied by a negative unary operator
		- 					Indicates a literal number is negative or negates an expression
		++ 					Increments a value by 1
		-- 					Decrements a value by 1
		! 					Inverts a Booleans logical value
	____________________________________
	 */
	
	@Test
	public void logicalComplementAndNegationOperators(){
		//The logical complement operator --> !
		boolean b = false;
		System.out.println(b); // false
		b = !b;
		System.out.println(b); // true
		
		//the negation operator --> -
		double a = 1.21;
		System.out.println(a); // 1.21
		a = -a;
		System.out.println(a); // -1.21
		a = -a;
		System.out.println(a); // 1.21

		
		//you cannot apply a negation operator, -, to a boolean expression
		//nor can you apply a logical complement operator, !, to a numeric expression
		//example
		//int x = !5; // DOES NOT COMPILE
		//boolean y = -true; // DOES NOT COMPILE
		//boolean z = !0; // DOES NOT COMPILE
		
	}
	
	@Test
	public void incrementAndDecrementOperators(){
		//Increment and decrement operators, ++ and --,
		//They have the higher order or precedence
		//pre-increment operator and the pre-decrement operator
		//post-increment operator and the post-decrement operator,
		int counter = 0;
		System.out.println(counter); // Outputs 0
		System.out.println(++counter); // Outputs 1
		System.out.println(counter); // Outputs 1
		System.out.println(counter--); // Outputs 1
		System.out.println(counter); // Outputs 0

		//Problemita
		int x = 3;
		int y = ++x * 5 / x-- + --x;
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		/*
		
		y = 4 * 5 / x-- + --x; // x assigned value of 4
		y = 4 * 5 / 4 + --x; // x assigned value of 3
		y = 4 * 5 / 4 + 2; // x assigned value of 2
		y = 20 / 4 + 2
		y = 5 + 2
		Respuesta:
		x is 2
		y is 7
		*/
		
		
		
	}
		
	
}
