
/*If Condition
 * 
 * 1. Simple if
 * 
 * if(condition)
 * {
 * 	statement;
 * }
 * 
 * 2. if/else
 * 
 * if(condition)
 * {
 * 	statement;
 * }
 * else
 * {
 * 	statement;
 * }
 * 
 * 3. Nested if
 * 
 * if(condition)
 * {
 * 	if(condition)
 * 	{
 * 		statement;
 * 	}
 * 	else
 * 	{
 * 		statement;
 * 	}
 *}
 *else
 *{
 *	statement
 *}
 *
 *4. Ladder if
 *
 *if(condition)
 *{
 *	statement;
 *}
 *else if(condition)
 *{
 *	statement;
 *}
 *else if(condition)
 *{
 *	statement;
 *}
 *else
 *{
 *	statement;
 *}
 * */

package com.core;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A:");
		a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("A Is Even Number");
		}
		else
		{
			System.out.println("A Is Odd Number");
		}
	}
}
