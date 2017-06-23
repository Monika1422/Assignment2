package com;

class Animal {

	public void move() {
		System.out.println("Animals can move");
	}
}

class Dog extends Animal {

	public void move() {
		System.out.println("Dogs can walk and run");
	}
}

public class Overriding {

	public static void main(String args[]) {
               ///{Write your code here 
               Animal ob=new Animal();
               ob.move();
               Animal ob1=new Dog();
               ob1.move();
	
	}
}