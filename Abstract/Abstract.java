import java.io.*;
import java.util.*;

abstract class A{
	public abstract void input();  // abstract method
	public abstract void output();// abstract method only declaration
	public void get(String s){
//concrete method both declaration and definition
		System.out.println(s);
	}


}

class B extends A{
	int a,b;
	Scanner sc=new Scanner(System.in);
	@Override
	public void input(){ // method overriding
		System.out.println("Abstract input of B");
		System.out.println("Enter:");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	@Override
	public void output(){
		System.out.println("Abstract input of B");
		System.out.print(a+b);
	}

}


class C extends A{
	String a,b;
	Scanner sc=new Scanner(System.in);
	@Override
	public void input(){
		System.out.println("Abstract input of C");
		System.out.println("Enter:");
		a=sc.next();
		b=sc.next();
	}
	@Override
	public void output(){
		System.out.println("Abstract output of C");
		System.out.println(a+b);
		super.get(a+b);
	}

}

class Abstract{
	public static void main(String args[]){
		
		B obj1=new B();
		C obj2=new C();

		obj1.input();
		obj1.output();
		
		obj2.input();
		obj2.output();
	}

}