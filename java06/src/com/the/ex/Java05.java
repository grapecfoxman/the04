package com.the.ex;

import java.util.Scanner;

public class Java05 {

	public static void main(String[] args) {
		// break; 반복문을 빠져나간다.
		//continue; 반복중인 코드블럭을 빠져나가 증감식으로 이동하여 
		//반복문을 이어나간다.
		
		//1. 사용자가 1004를 입력할 동안 반복하는 코드를 만들어보자.
//		String str="";
//		Scanner sc=new Scanner(System.in);
//		while(true) {
//		//while(!str.equals("1004")) {//String일 경우
//		//while(str==1004)) { int일경우
//			System.out.println("비밀 번호 입력>>");
//			str=sc.nextLine();
////			if(str.equals("1004")) {
////				
////			}else {
////				System.out.println("잘못 입력 했습니다.");
////			}			
//			if(str.equals("1004")) {
//				break;
//			}
//			System.out.println("잘못 입력 했습니다.");
//		}
//		System.out.println("맞췄습니다.");
		//Scanner sc=new Scanner(System.in);
//		for(;;) {
//			System.out.println(">>");
//			int a= Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//			if(a==1004) {
//				break;
//			}else {
//				System.out.println("잘못된입력");
//			}
//		}
//		
//		boolean isFlag=true;
//		while(isFlag) {			
//			if(5>3) {
//				isFlag=false;
//			}
//		}
//		
//		// 0~10 사이의 3의 배수를 제외하고 출력하기
//		for(int i=0;i<=10;i++) {
//			if(i%3==0) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		
		
		//1부터 차례대로 더한 총합이 최초 100을 넘기 직전까지
		//누적한 결과값을 순서대로 출력하시오. 
		//1:1 2:3 3:6 4:10 5:15 6:21 …  100이전의 총합들을 다음과 같이 출력되면 된다.
		
//		int count=1;
//		int sum=0;
//		while(sum +count  <=100) {
//			sum = sum+count;
////			if(sum<=100) {
////				break;
////			}
//			System.out.println(count+":"+sum);
//			count++;
//		}
		
//		for(int count=1,sum=0;;)
		
//		int sum=0;
//		for(int count=1;sum +count <=100;count++) {
//			sum = sum+count;
//			System.out.println(count+":"+sum);
//		}
		//3. 입력 받은 두수 사이의 숫자들의 합을 구하는 프로그램을 만들어 보자.
		
//		int a= new java.util.Scanner(System.in).nextInt();
//		int b= new java.util.Scanner(System.in).nextInt();
//		int sum=0;
//		
//		//b가 작으면 a랑 교환
////		if(a>b) {
////			int t=a;
////			a=b;
////			b=t;
////		}
//		//b가 더 큰것을 가정
//		if(a>b) {
//			for(int i=a;i>=b;i--) {
//				sum=sum+i;
//			}
//		}else {
//			for(int i=a;i<=b;i++) {
//				sum=sum+i;
//			}
//		}
//		System.out.println(sum);
//		for(int count=1,c=3;;) {
//			
//		}
		
		//첫 번째 숫자부터 시작해서,
		//두 번째 숫자만큼 숫자를 세면서 화면에 출력해줘요.
		//간단히 말해서, 첫 번째 숫자가 5이고 두 번째 숫자가 6이면,
		//5부터 시작해서 6개의 숫자를 출력해줘요. 
		//출력되는 숫자들은 이렇게 될 거에요: 5 6 7 8 9 10
	
		int a=5;
		int b=3;
		
		for(int i=a;i<a+b;i++) {
			System.out.println(i);
		}
//		for(int i=5;i<11;i++) {
//			System.out.println(i);
//		}
	}
}

//4~8까지의 합 
//11. 사용자에게 계속해서 숫자를 입력받아 1~10사이의
//숫자를 3번 입력 할 때 까지 반복한다.
//입력이 끝나면 잘못 입력한 회수와 제대로 입력한 회수를 출력하고 사용자가 제대로
//입력한 총합을 출력하는  프로그램을 만들어 보자.





























