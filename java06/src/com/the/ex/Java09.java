package com.the.ex;

import java.util.Arrays;

public class Java09 {
	public static void main(String[] args) {
//		18. 사용자에게 열의 데이터 개수을 입력받아 열에 맞춰서 
//		1부터 100까지 순서대로 출력하는 프로그램을 구현해 보자. 
//		ex) 3을 입력하면 한줄에 3개씩 출력 하면 된다.
//		int a[]=new int[a1];
//		int userLine=3;
//		for(int i=1;i<=100;i++) {
//			System.out.print(i+"    \t");
//			if(i%userLine==0) {
//				System.out.println();
//			}
//		}		
//		int a[]= {1,2,5,7,3};
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}		
//		//for-each
//		for(int item: a) {
//			System.out.println(item);
//		}
		//문제 2) 배열 a[10]에 3의 배수를 넣은 다음에 
		//배열의 내용을 출력하는 순서도와 의사코드를 만들어 보자.
		
		int a[] = new int[10];
		
//		a[0]=3*0;
//		a[1]=3*1;
//		a[2]=3*2;
//		a[3]=3*3;
//		...
		
		for(int i=0;i<10;i++) {
			a[i]=3*i;
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(a[i]);
		}
		
		int sum=0;
		for(int i=0;i<10;i++) {
			sum = sum+ a[i];
			
		}
		System.out.println(sum);
		
		
		//배열안에 데이터가 짝수이면 5로 변경
//		for(int i=0;i<10;i++) {
//			if(a[i]%2==0) {//들어 있는 값이 짝수이면
//				a[i]=5;//5로 변경
//			}
//		}
		
		//배열에 인덱스가 3의 배수이면  0으로 변경
//		for(int i=0;i<10;i++) {
//			if(i%3==0) {//인덱스가 3의 배수이면
//				a[i]=0;				
//			}
//		}
		
		//배열에 5개의 숫자를 입력받아 넣은 다음 숫자 하나를 입력받아
		//해당 숫자가 몇번째 인덱스에 들어 있는지 
		//출력하는 프로그램을 만들어 보자.
		
//		int arr[]=new int[5];
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("숫자 입력>>");
//			arr[i]=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		}
//		
//		System.out.println("찾을 수 입력 >>");
//		int userInput=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		
//		//배열에 사용자가 입력한 수가 있는지 확인
//		boolean isFlag=true;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] == userInput) {
//				System.out.println(i+"번째에서 찾았습니다.");
//				isFlag=false;
//			}
//		}
//		if(isFlag) {
//			System.out.println("찾는 단어는 배열안에 없습니다.");
//		}
//		10.배열에 들어있는 내용을 정순과 역순으로 저장하는 새로운 배열을 만들어 출력해 보자.
//		ex)배열에 1,2,3이 들어 있으면 1,2,3,3,2,1 이 들어 있는 배열
//		ex)배열에 7,9,21,15,23 이 들어 있으면
		//23,15,21,9,7,7,9,21,15,23 이 들어 있는 배열

		int arr1[] = {1,2,3,5};
		int arr2[] = new int[arr1.length*2];
		
//		arr2[0]=arr1[0];
//		arr2[1]=arr1[1];
//		arr2[2]=arr1[2];
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		
//		arr2[3]=arr1[2];
//		arr2[4]=arr1[1];
//		arr2[5]=arr1[0];
		for(int i=0;i<arr1.length;i++) {
			arr2[arr1.length+i]=arr1[arr1.length-1-i];
		}
		
		System.out.println(Arrays.toString(arr2));
		
	}
}





