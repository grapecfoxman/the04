package com.the.ex;

public class MyMain {

	public static void main(String[] args) {
//		// a,b,c 변수에 들어있는 값을 작은순으로 정렬 하여 출력 하자.
//		// 1. 가장 작은 값을 찾아 a와 교환한다.
//		
//		int a=5;
//		int b=14;
//		int c=3;
//		
//		if(a>b) {//b가 작음
//			if(b>c) {//c가 가장 작음   if(4>6)
//				//a와 c 교환
//				int t=0;//temp
//				t=a;	a=c;	c=t;
//				//교환하고 나면 a가 가장 작음값이 된다.
//			}else {// b가 가장 작음
//				//a와 b 교환
//				int t=0;
//				t=a;	a=b;	b=t;
//			}			
//		}else {//a가 작음
//			if(a>c) {//c가 가장 작음
//				//a와 c를 교환
//				int t=0;
//				t=a;	a=c;	c=t;
//			}else {//a가 가장 작음
//				//교환작업을 하지 않음
//			}			
//		}
//		// a,b,c 변수에 들어있는 값을 작은순으로 정렬 하여 출력 하자.
//		// 1. 가장 작은 값을 찾아 a와 교환한다.
//		System.out.println("a:"+a+" b:"+b+" c:"+c);
//		
//		// 2. b와 c를 비교해서 더 작은 값을 b로 옮긴다.
//		if(b>c) { //c가 작음
//			int t=0;
//			t=b;	b=c;	c=t;
//		}else {//b가 작음
//			//교환작업을 하지 않는다.
//		}
//		System.out.println("a:"+a+" b:"+b+" c:"+c);
		int age=10;
		if(age<=13) {
			System.out.println("초등학생");
		}else if(age<=16) {
			System.out.println("중학생");
		}else if(age<=19) {
			System.out.println("고등학생");
		}else {
			System.out.println("성인");
		}
		
		switch(age) {
		case 13:
		case 12:
		case 11:
		case 10:
		case 9:
		case 8:
			System.out.println("초등학생");
			break;
		case 16:
		case 15:
		case 14:
			System.out.println("중학생");
			break;
		case 17:
		case 18:
		case 19:
			System.out.println("대학생");
			break;
		default:
			System.out.println("미성년자 또는 성인");
		}
	}
}





