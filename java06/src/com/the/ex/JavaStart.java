package com.the.ex;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class JavaStart {

	public static void main(String[] args) {
//		System.out.println(Math.random());
//		//Math.random()은 0=< Math.random()<1 사이의 랜덤한 실수를 생성해 준다.
//		//0=< Math.random()<1
//		//0*6=< Math.random()*6<1*6
//		//0=< Math.random()*6<6
//		System.out.println(Math.random()*6);//0~5.xx
//		System.out.println((int)(Math.random()*6));//0,1,2,3,4,5
//		System.out.println((int)(Math.random()*6)+1);//1,2,3,4,5,6
//		
//		System.out.println((int)Math.random()*6+1);//1,2,3,4,5,6
//		
//		double random=Math.random();//0=< M < 1  실수
//		System.out.println(random);//0.xxxx   실수
//		//원하는 숫자 범위가 10개 //0*10=< M*10 < 1*10  실수
//		//원하는 숫자 범위가 10개 //0=< M*10 < 10  실수 0.xxx~9.xxx
//		System.out.println(random*10); 
//		System.out.println((int)(random*10)); //정수 0~9  0, 1, 2, 3, 4 ....
//		System.out.println((int)(random*10)+1);		//1,2,3,4,5,...,10
//		
//		//5개의 연속된 숫로 3부터 시작해서 랜덤하게 뽑아보자. 3,4,5,6,7 중에 하나를 생성하는 방법
//		System.out.println((int)(Math.random()*5)+3);
//		
//		
		double m=Math.random();//해당 코드가 실행되면 랜덤한 실수를 만들어 준다. 0=< M <1 사이 실수
		System.out.println(m);//m은 0 ~1 사이 실수  3개 가위바위보, 6개 주사위, 5개 윷놀이
		//0 <= M  < 1  원하는 범위에 실수를 모든 항에 곱하면 얻을수 있다.
		//0*6 <= M*6  < 1*6      0 <= M*6 < 6   0.xxx~5.xxx
		System.out.println(m*6);
		System.out.println((int)(m*6));//정수 0=< M*6  < 6 사이의 정수 0,1,2,3,4,5
		//0,1,2,3,4,5 최종 결과에 더하기 1
		//1,2,3,4,5,6
		System.out.println((int)(m*6)+1);
	}

}







