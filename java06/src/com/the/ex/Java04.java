package com.the.ex;

public class Java04 {

	public static void main(String[] args) {
//		//1.if문  2.if else문  3.else if
//		//1
//		if(true) {//if(false){
//			System.out.println("true");//true면 실행 false실행되지 않음
//		}
//		
//		//2. if else
//		if(true) {//if(false) {
//			System.out.println("true");//true일때 실행
//		}else {
//			System.out.println("false");//false일때 실행
//		}
//		
//		//3. else if문 
//		if(4>5) {
//			
//		}else if(7>5) {
//			System.out.println("여러 조건중 1개만 실행");
//		}else if(10>5) {
//			
//		}else {
//			System.out.println("조건에 맞는 부분이 없으면 실행");
//		}
//		
//		//switch문
//		int s=3;
//		switch(s) {
//		case 5:
//			//s가 5일때실행
//			break;
//		case 4:
//		case 3:
//			//s가 4하고 3일때 실행
//			break;
//		default:
//			//case문에 원하는 값이 없을 경우 실행
//		}
		//4~20까지 모두 더한 합 구하는 프로그램
		//1.while
//		int sum=0;
//		int count = 4;
//		while(count<=20) {//count>21
//			System.out.println((sum+count)+"="+sum+"+"+count);
//			sum=sum+count;//기존 sum에 새로운 count를 더한다.
//			count++; 			
//		}
//		System.out.println(sum);
		
		//2.for
//		int sum=0;
//		for(int count=4;count<=20;count++) {
//			System.out.println((sum+count)+"="+sum+"+"+count);
//			sum=sum+count;//기존 sum에 새로운 count를 더한다.
//		}
//		System.out.println(sum);
		
		//3.do ~ while
//		int sum=0;
//		int count=4;
//		do {
//			System.out.println((sum+count)+"="+sum+"+"+count);
//			sum=sum+count;//기존 sum에 새로운 count를 더한다.
//			count++;
//		}while(count<=20);
		
		//10~30사이의 홀수의 합 for문으로 구하기
		int sum=0;
		for(int i=10;i<=30;i++) {
			if(i%2==1) {
				System.out.println((sum+i)+"="+sum+"+"+i);				
				sum=sum+i;
			}else {				
			}
		}
		System.out.println("총합은"+sum);
		//if,switch for while do~while
	}
}













