package org.example.p1;

public class Program {
	public static String isPosiNegi(int n) {
		if(n==0) return "Non Negative";
		return n >= 0 ? "Positive":"Negative";
	}
	public static void main(String[] args) {
		System.out.println(isPosiNegi(6));

	}

}
