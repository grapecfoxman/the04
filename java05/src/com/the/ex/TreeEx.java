package com.the.ex;

import com.the.dto.Tree;

public class TreeEx {
	public static void main(String[] args) {

		Tree t1=new Tree();
		
		t1.name="은행나무";
		t1.price=50;
		
		t1.owner.name="홍길동";
		t1.owner.address="은행동";
		
		System.out.println(t1.name);
		System.out.println(t1.price);
		System.out.println(t1.owner.name);
		System.out.println(t1.owner.address);
		
		//Tree t2=new Tree();  새로운 나무데이터 추가

	}

}
