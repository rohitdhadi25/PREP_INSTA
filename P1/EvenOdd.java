package org.example.ALL_PROBLEMS;

public class EvenOdd {
	public static boolean evenOdd(int n) {
		return (n & 1)==0?false:true;
	}
	public static void main(String[] args) {
		
		if(evenOdd(6)==true) {System.out.println("Odd");}
		else  {System.out.println("Even");}

	}

}
