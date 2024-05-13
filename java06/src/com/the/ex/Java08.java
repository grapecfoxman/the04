package com.the.ex;
public class Java08 {
	public static void main(String[] args) {
		//컴퓨터가 던진 주사위 수를 맞추는 프로그램을 구현해 보자.
		//10회 맞추어 맞춘 회수와 틀린 회수를 기록해서 보여 주자.
		int rCount=0;//맞은회수
		int wCount=0;//틀린회수
		
		for(int i=0;i<10;i++) {
			int comNumber=(int)(Math.random()*6 +1);//1~6
			System.out.println("컴퓨터의 예상 주사의 숫자를 입력하세요?");
			int userNumber=Integer.parseInt(
					new java.util.Scanner(System.in).nextLine());
			
			if(comNumber==userNumber) {
				rCount++;
				System.out.println("맞췄습니다.");
			}else {
				wCount++;
				System.out.println("틀렸습니다.");
			}
		}
		System.out.println("rCount:"+rCount);
		System.out.println("wCount:"+wCount);
	}
}


