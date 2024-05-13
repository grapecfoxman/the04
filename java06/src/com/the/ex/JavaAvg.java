package com.the.ex;

public class JavaAvg {
	public static final int cutLine=60;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java,html,db과목의 점수를 입력받아. 
		//평균이 60점 이상이면 합격, 평균이 60점 미만이면 불합격, 40점 이하인 과목이 
		//하나라도 있으면 과락이 출력되도록 프로그램을 구현해 보자.
		//최종 결과 화면은 다음과 같다. 
		//java 35 과락, html 10과락,db 20과락 또는 
		//평균 40로 60점미만 불합격 또는 과락 없이 평균 60이상 합격이 출력된다.
		
		int java=95;
		int html=80;
		int db=61;
		int avg=(java+html+db)/3;
		
		if(JavaAvg.cutLine<=java&&JavaAvg.cutLine<=html
				&&JavaAvg.cutLine<=db&& JavaAvg.cutLine<=avg) {//
			System.out.println("과락 없이 평균 "+JavaAvg.cutLine+"이상 합격 :"+avg);
		}else {
//			if(java<JavaAvg.cutLine) {//java 35 과락, html 10과락,db 20과락 또는
//				System.out.println("java :"+java+" 과락");
//			}else if(html <JavaAvg.cutLine) {
//				System.out.println("html :"+html+" 과락");
//			}else if(db <JavaAvg.cutLine) {
//				System.out.println("db :"+db+" 과락");
//			}else {
//				System.out.println(avg+"로 "+JavaAvg.cutLine+"점미만");
//			}
			
			if(java<JavaAvg.cutLine) {//java 35 과락, html 10과락,db 20과락 또는
				System.out.println("java :"+java+" 과락");
			}
			if(html <JavaAvg.cutLine) {
				System.out.println("html :"+html+" 과락");
			}
			if(db <JavaAvg.cutLine) {
				System.out.println("db :"+db+" 과락");
			}
			if(avg<JavaAvg.cutLine){
				System.out.println(avg+"로 "+JavaAvg.cutLine+"점미만");
			}
			
			
			System.out.println("불합격");
		}
		
		
		
		
		
		
		
		
		
	}

}




