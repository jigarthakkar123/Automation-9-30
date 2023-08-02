package com.core;

interface ifs1
{
	static void meth1()
	{
		System.out.println("Meth1 Defined In ifs1");
	}
	void meth2();
}
interface ifs2 extends ifs1
{
	void meth3();
	void meth4();
}
class ImplInterface implements ifs2
{

	public void meth2() {
		System.out.println("Meth2");
	}
	public void meth3() {
		System.out.println("Meth3");
	}
	public void meth4() {
		System.out.println("Meth4");
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		ImplInterface i=new ImplInterface();
		ifs1.meth1();
		i.meth2();
		i.meth3();
		i.meth4();
	}
}
