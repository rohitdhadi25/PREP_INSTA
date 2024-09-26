package org.example.ALL_PROBLEMS;
	 
public class LeapYear {
	private static boolean isLeap(int year) {
		boolean leap;
		if(year%400==0) leap=true;
		
		else if(year%4==0 && year%100!=0) leap=true;
		
		else leap=false;
		
		if(leap) return true;
		return false;
	}
	public static void main(String[] args) {
		System.out.println( isLeap(100));

	}

}
