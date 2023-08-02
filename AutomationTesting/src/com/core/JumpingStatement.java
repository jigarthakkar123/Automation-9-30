package com.core;

public class JumpingStatement {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		int i;
		for(i=2;i<10;i++)
		{
			if(i==5 || i==8)
			{
				System.out.println("Tops Technologies");
				continue;
			}
			else
			{
				System.out.println("I : "+i);
			}
		}
	}
}
