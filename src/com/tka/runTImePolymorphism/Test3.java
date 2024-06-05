package com.tka.runTImePolymorphism;

public class Test3 {

	public static void main(String[] args) {
		A a = new A();
		B b= new B();
		
		A a1 = new B();
		
		a.m1();
		b.m1();
		b.m2();
		
		a1.m1();
		//a1.m2(); // error

	}

}
