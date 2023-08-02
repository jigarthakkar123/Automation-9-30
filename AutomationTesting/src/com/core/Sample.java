
/*Data Type
 * 
 * 1. byte - 1
 * 2. short - 2
 * 3. int - 4
 * 4. long - 8
 * 5. float - 4
 * 6. double - 8
 * 7. char - 1(Single character at a time)
 * 8. boolean - true/false
 * 
 * Variable : It is a data name & is used to store the data value.
 * 
 * 1. Must start with an alphabet.
 * 2. Upper case & lower case are significant.
 * ASCII : American Standard Code For Information Interchange
 * A-Z : 65 to 90
 * a-z : 97 to 122
 * 3. Keyword is not allowed as a variable name
 * 4. Space is not allowed between variable name.
 * 
 * */


package com.core;

public class Sample {

	public static void main(String[] args) {
		double a,b,c;
		a=10.90;
		b=20.67;
		c=a+b;
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		System.out.println("Addition : "+c);
	}
}
