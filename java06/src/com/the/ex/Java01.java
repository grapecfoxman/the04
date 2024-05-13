package com.the.ex;

import java.util.Arrays;
import java.util.Scanner;

public class Java01 {

	public static void main(String[] args) {
		//15. 1~45까지의 수를 랜덤하게 만들어 3개의 수를 뽑은 다음 
		//본인이 입력한 3개의 수와 몇개 같은지 확인하는 프로그램을 배열로 만들어 보자.

		int num[] =new int[3];
		int count=0;
		int inputNum=0;
		num[0]=(int)(Math.random()*45+1);
		num[1]=(int)(Math.random()*45+1);
		num[2]=(int)(Math.random()*45+1);
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("숫자 입력>>");
		inputNum= scanner.nextInt();
		if(num[0]==inputNum) {
			count++;
		}
		if(num[1]==inputNum) {
			count++;
		}
		if(num[2]==inputNum) {
			count++;
		}
	
		System.out.println("숫자 입력>>");
		inputNum= scanner.nextInt();
		if(num[0]==inputNum) {
			count++;
		}
		if(num[1]==inputNum) {
			count++;
		}
		if(num[2]==inputNum) {
			count++;
		}
		
		System.out.println("숫자 입력>>");
		inputNum= scanner.nextInt();
		if(num[0]==inputNum) {
			count++;
		}
		if(num[1]==inputNum) {
			count++;
		}
		if(num[2]==inputNum) {
			count++;
		}
		
		System.out.println("배열내용:" + Arrays.toString(num));
		System.out.println("총 "+count+"개수 만큼 같은 값을 가진다.");

	}
}






