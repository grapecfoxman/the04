package com.the.ex;

public class Java03 {

	public static void main(String[] args) {
		// 1.초기식을 이용해서 원하는 숫자부터 실행 할 수 있다.
		for(int i=5;i<10;i++) {//초기식 변수에 5를 넣으면 5부터 시작한다.
			System.out.println(i);			
		}
		// 2.증감식을 이용해서 원하는 만큼 증가 시킬수 있다.
		for(int i=0;i<10;i=i+2) {//초기식 변수를 2씩 증가 시킬수 있다.
			System.out.println(i);			
		}
		// 3.반복문을 이용해서 합산 할 경우 합산할 변수는 반복문 밖에 선언해야 한다.
		int sum1=0;
		for(int i=1;i<11;i++) {
			sum1=sum1+i;
			System.out.println(sum1);
		}
		System.out.println("최종:"+sum1);
		
		
		for(int i=1;i<11;i++) {
			int sum2=0;
			sum2=sum2+i;
			System.out.println(sum2);
		}
		//System.out.println(sum2);

	}

}






