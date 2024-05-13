package com.the.ex;

import com.the.dto.*;

public class NoteBookEx {

	public static void main(String[] args) {
		
		NoteBook n1=new NoteBook();
		n1.manufacturer="ASUS";
		n1.cpu="코어i5-11세대";
		n1.screenSize=15.6;
		// 이하생략
		
		NoteBook n2=new NoteBook();
		//n2.... 이하생략
		
		
		//노트북 정부 출력
		System.out.println(n1.manufacturer);

	}

}
