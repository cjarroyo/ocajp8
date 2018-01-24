package ocajp.cap2;

import org.junit.Test;

public class BWorkingWithBinaryArithmetic {
	/*
	  	binary operators, can be used to perform mathematical operations on variables,
		create logical expressions.
		Binary operators, are commonly combined in complex expressions with more than two variables; 
	 */
	@Test
	public void arithmeticOperators(){
		/*addition (+), subtraction (-), multiplication (*), division (/), and modulus (%), unary operators, ++ and --*/
		
		/*the multiplicative operators (*, /, %) have a higher order of precedence
		than the additive operators (+, -).*/
		int x = 2 * 5 + 3 * 4 - 8;
		System.out.println(x);
		/*
		 * x = 10 + 12 - 8
		 * x = 14
		 * */
		//con parentesis, las cosas cambian
		int y = 2 * ((5 + 3) * 4 - 8);
		System.out.println(y);
		/*
		  y = 2 * (8 * 4 � 8);
		  y = 2 * (32 � 8);
		  y = 2 * 24;
		  y = 48
		 */
		
		/*the modulus operator: % */
		System.out.print(9 / 3); // Outputs 3
		System.out.print(9 % 3); // Outputs 0
		System.out.print(10 / 3); // Outputs 3
		System.out.print(10 % 3); // Outputs 1
		System.out.print(11 / 3); // Outputs 3
		System.out.print(11 % 3); // Outputs 2
		System.out.print(12 / 3); // Outputs 4
		System.out.print(12 % 3); // Outputs 0
	}
	
	@Test
	public void numericPromotion(){
		/*you should know that a long takes up more space than an int, which in turn takes up more space than a short, and so on*/
		/*RULES*/
		/*
		 1. If two values have different data types, Java will automatically promote one of the values to the larger of the two data types.
		 2. If one of the values is integral and the other is floating-point, Java will automatically promote the integral value to the floating-point value�s data type.
		 3. Smaller data types, namely byte, short, and char, are first promoted to int any time they�re used with a Java binary arithmetic operator, even if neither of the operands is int.
		 (unary operators are excluded from this rule.) For example, applying ++ to a short value results in a short value.
		 4. After all promotion has occurred and the operands have the same data type, the resulting value will have the same data type as its promoted operands.*/
		
		int a = 1;
		long b = 33;
		System.out.println("First Rule, promoted to a long : --> " + a * b); 
		//long is larger than int, then the int value is promoted to a long

		double c = 39.21;
		float d = 2.1f;
		System.out.println("First Rule too, promoted to a double : --> " + c + d);
		//with both operands being promoted to a double, and the result would be a double value

		short e = 10;
		short f = 3;
		System.out.println("Third Rule: " + e / f);
		//that x and y will both be promoted to int

		short g = 14;
		float h = 13;
		double i = 30;
		System.out.println("All Rules: " + g * h / i);
		//g will automatically be promoted to int
		//g value will then be automatically promoted to a float
		//g * y will then be automatically promoted to a double,
	}

}
