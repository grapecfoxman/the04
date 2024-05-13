package com.the.ex;

import java.util.Scanner;

public class Java07 {

	public static void main(String[] args) {
		//4~8까지의 합 
		//11. 사용자에게 계속해서 숫자를 입력받아 1~10사이의
		//숫자를 3번 입력 할 때 까지 반복한다.
		//입력이 끝나면 잘못 입력한 회수와 제대로 입력한 회수를 출력하고 사용자가 제대로
		//입력한 총합을 출력하는  프로그램을 만들어 보자.
		int wrongCount=0;//잘못 입력한 회수
		int count=0;//1~10사이의 숫자를 입력 받을때마다 1씩 증가
		int sum=0;//총합
		
		Scanner sc=new Scanner(System.in);
		int userInput=0;//사용자가 입력 할 변수
		
		while(count<3) {//1~10사이의 숫자를 3번 입력받으면 종료
			//사용자 입력을 받아서 범위에 맞으면 count를 1증가 틀리면 wrongCount증가
			//sum 총합에 사용자가 입력한 수를 합산한다.
			
			System.out.println("사용자 입력>>");
			userInput=Integer.parseInt(sc.nextLine());//사용자 입력받기
			
			if(userInput>=1&&userInput<=10) {//올바른 입력범위 설정
				//올바른 입력
				count++;
				sum=sum+userInput;
			}else {
				//잘못된 입력
				wrongCount++;
			}
		}
		System.out.println("잘못된입력회수:"+wrongCount);
		System.out.println("3개의 입력 총합:"+sum);
		
		 //0부터 시작하는 4의 배수 10개를 출력하시오.
		
		//0,4,8,12,.....
		//0부터 4씩 10번 더하면 된다.
//		int sum=0;
//		for(int i=0;i<10;i++) {
//			System.out.println(sum);
//			sum=sum+4;
//		}
		
		//0*4,1*4,2*4,3*4
		int num=4;
		for(int i=0;i<10;i++) {
			System.out.println(num*i);
		}
		
		//2에 배수 와 3에 배수 출력
		for(int x=1;x<20;x++) {
			if(x%2==0) {
				System.out.print("2의 배수:"+x+" ");
			}
			if(x%3==0) {
				System.out.print("3의 배수:"+x);
			}	
			System.out.println("");
		}
		//2와 3의 최소공배수 구하기
		for(int x=1;;x++) {
			if(x%2==0&&x%3==0) {
				System.out.print("2와 3의 최소 공배수:"+x+" ");
				break;
			}				
			System.out.println("");
		}
		//사용자 입력 처리
		int num1=2;
		int num2=3;
		for(int x=1;;x++) {
			if(x%num1==0&&x%num2==0) {
				System.out.print(num1+"와 "+num2+ "의 최소 공배수:"+x+" ");
				break;
			}				
//			System.out.println("");
		}
	}

}


