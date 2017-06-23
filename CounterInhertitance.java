package com;

class Counter {  
	  
	int i = 0;  
	Counter increment() {  
		i++;  
		return this;  
	}  
	void print() {  
		System.out.println("i = " + i);  
	}  
}  
public class CounterInhertitance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Counter ob=new Counter();
          for(int i=0;i<3;i++)
           ob.increment();
          ob.print();
	}

}
