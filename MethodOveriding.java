package com.Opps.polymarphism;

public class MethodOveriding {

	// MethodOveriding --> same method name and same arg.
	void m1() {
			System.out.println("Class MethodOveriding , m1 method");
		}
}

class Sub extends MethodOveriding{
		@Override
		void m1() {
			System.out.println("Class sub , m1 method");
		}
		void m2() {
			System.out.println("class sub , m2 method");
		}
		
public static void main(String[] args) {
		Sub sub = new Sub();
		sub.m1();
		sub.m2();
			
		}
}

	

