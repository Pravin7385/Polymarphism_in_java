package com.Opps.polymarphism;

// Polymorphism - it is a single entity behaves differently in diff task case is call as the Polymorphism 
 // 1 type Polymorphism is Method overloading

public class MethodOverloading {

	//MethodOverloading - same method name and diff arg.
	void add(int a,int b) {
		System.out.println(a+b);
	}
	
	void add(int a,float b) {
		System.out.println(a+b);
	}
	
	void add(double a,int b) {
		System.out.println(a+b);
	}
	void add(int a,int b,double c) {
		System.out.println(a+b-c);
	}
	
	public static void main(String[] args) {
		MethodOverloading methodoverloading = new MethodOverloading();
		methodoverloading.add(5, 5);
		methodoverloading.add(2, 0.2f);;
		methodoverloading.add(0.23, 8);
		methodoverloading.add(5, 9, 0.35);
	}
}
