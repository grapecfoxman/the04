package com.the.ex;

import java.util.Arrays;

public class JavaArrayEx {

	public static void main(String[] args) {
		// 배열 : 하나의 변수에 여러개의 데이터 저장
		// 배열 : 하나의 배열변수를 통해서 여러개의 같은데이터를 
		//      인덱스를 이용해서 관리한다.
		
		//배열 선언 방법
		//자료형 변수명[] = new 자료형[원하는데이터생성개수];
		//int를 10개 arr1 배열 변수에 생성하고 싶다.
		
		int arr1[]=new int[10];
		
		//Arrays.toString 배열의 내용을 문자열로 만든다.
		System.out.println(Arrays.toString(arr1));
		
		//배열에 5번 인덱스에 50를 넣고 배열의 내용을 출력해보자.
		arr1[5]=50;
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1[0]);
		System.out.println(arr1[5]);
		
//		int a1; int a2; //..
//		int a10;
//		a2=50;
		
		int[]arr2=new int[5];
		int[]arr3;
		arr3=new int[6];
		
		int[]arr4= {1,2,3,4};
		int[]arr5= {0,3,6,9,12};
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		System.out.println(arr4[3]);
		//arr5= {1,2,3}; //코드 진행중에 추가 할 수 없다.
		
		//arr4[3] 일반 int 변수처럼 사용하면된다.
		
		int a=0;
		
		a =arr4[3];
		a = arr4[0]+arr4[2];
		a = a+ arr4[1];
		arr4[0]=a;
		arr4[0]= arr4[1]+arr4[2];
		
		System.out.println(arr4.length);
		
//		a1 에는 1,2,3,5
//		b1 에는 6,7,8
//		이 들어 있는 2개의 배열을 만들고
//		3의 배수는 0으로 변경하고 b1의 배열
//		의 내용은 하나씩 증가 시켜보자.
		
		int a1[] = {1,2,3,5};
		int b1[] = new int[3];
		b1[0]=6;
		b1[1]=7;
		b1[2]=8;
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(b1));
		
		a1[2]=0;
		b1[0]=0;
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(b1));
		
		b1[0]=b1[0]+1;
		b1[1]++;
		b1[2]=b1[2]+1;
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(b1));
		
		
		
	}

}










