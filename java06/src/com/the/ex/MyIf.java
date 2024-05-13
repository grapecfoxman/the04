package com.the.ex;

public class MyIf {

	public static void main(String[] args) {
		// a b c수중 가장큰수는
		int a=149;
		int b=225;
		int c=100;
		
		if(a>b) {//a가 큼
			if(a>c) {//a가 큼
				System.out.println("A:"+a);				
			}else {//c가 큼
				System.out.println("C:"+c);
			}			
		}else { //b가 큼
			if(b>c) {//b가 큼
				System.out.println("B:"+b);				
			}else {//c가큼
				System.out.println("C:"+c);
			}			
		}
		
		
		
			
			
			
	}
}
