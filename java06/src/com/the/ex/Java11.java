package com.the.ex;

public class Java11 {
	public static void main(String[] args) {
		//카드 만들기
		int deck[]=new int[52];
		for(int i=0;i<52;i++) {
			deck[i]=i;
		}
		for(int i=0;i<52;i++) {
			System.out.println(deck[i]);
		}
		
		//카드 정보 배열
		String cardNum[]={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String cardSape[]= {"하트","스페이드","다이아","클로버"};
		//34의 카드 정보  모양  34/13   넘버  34%13
		System.out.println("34는 "+cardSape[34/13]+cardNum[34%13]);
		
		//가지고 있는 모든 카드에 번호와모양 출력
		for(int i=0;i<deck.length;i++) {
			System.out.println("카드위치:"+i+" 카드번호"+deck[i]+":"
		+cardSape[deck[i]/13]+cardNum[deck[i]%13]);
		}
		//카드 교환
//		int cardIndex=51;
//		int tempCard=deck[0];
//		deck[0]=deck[cardIndex];
//		deck[cardIndex]=tempCard;
//		
//		for(int i=0;i<deck.length;i++) {
//			System.out.println("카드위치:"+i+" 카드번호"+deck[i]+":"
//		+cardSape[deck[i]/13]+cardNum[deck[i]%13]);
//		}
//		
		//카드 를 래덤하게 여러번 썩기
		for(int i=0;i<10000;i++) {
			int cardIndex=(int)(Math.random()*52);
			int tempCard=deck[0];
			deck[0]=deck[cardIndex];
			deck[cardIndex]=tempCard;
		}
		
		for(int i=0;i<deck.length;i++) {
			System.out.println("카드위치:"+i+" 카드번호"+deck[i]+":"
		+cardSape[deck[i]/13]+cardNum[deck[i]%13]);
		}
		
//		//deck에서 카드 한장을 플레이어1에게 주기
//		//deckIndex를 이용해서 사용한카드, 다음 사용할 카드, 사용안한카드 를 구분하자.
		int deckIndex=0;//deck[deckIndex] 다음 사용할 카드
//		
//		//p1,p2가 카드받을 준비
		int []p1Deck=new int [11];
		int p1DeckIndex=0;//p1이 가지고 있는 카드수
		int []p2Deck=new int [11];
		int p2DeckIndex=0;//p1이 가지고 있는 카드수
//		
//		//p1에게 카드 한장주기
//		p1Deck[p1DeckIndex]=deck[deckIndex];
//		deckIndex++;
//		p1DeckIndex++;
//		
//		//p2에게 카드 한장 주기
//		p2Deck[p2DeckIndex]=deck[deckIndex];
//		deckIndex++;
//		p2DeckIndex++;
//		
//		//한장씩 더받기
//		p1Deck[p1DeckIndex++]=deck[deckIndex++];
//		p2Deck[p2DeckIndex++]=deck[deckIndex++];
//		//5/20 7/31
//		//9:30
//		//
//		//p1이 가지고 있는 카드를 출력하시오.
//		//p2가 가지고 있는 카드를 출력하시오.
//		// 사용한 카드 , 다음 사용할 카드, 
//		//앞으로 사용할 카드를 구분해서 출력해 보자.
//		//p1이 가지고 있는 카드를 출력하시오.
//		System.out.println("p1이 가지고 있는 카드");
//		for(int i=0;i<p1DeckIndex;i++) {
//			System.out.println("카드"+i+":"+cardSape[p1Deck[i]/13]+cardNum[p1Deck[i]%13]);			
//		}
//				//p2가 가지고 있는 카드를 출력하시오.
//		System.out.println("p2이 가지고 있는 카드");
//		for(int i=0;i<p2DeckIndex;i++) {
//			System.out.println("카드"+i+":"+cardSape[p2Deck[i]/13]+cardNum[p2Deck[i]%13]);			
//		}
//				// 사용한 카드 , 다음 사용할 카드, 
//				//앞으로 사용할 카드를 구분해서 출력해 보자.
//		for(int i=0;i<deckIndex;i++) {
//			System.out.println("카드"+i+":"+cardSape[p2Deck[i]/13]+cardNum[p2Deck[i]%13]);
//		}
//		
//		System.out.println("카드"+deckIndex+":"+cardSape[p2Deck[deckIndex]/13]
//				+cardNum[p2Deck[deckIndex]%13]);
//		
//		for(int i=deckIndex+1;i<deck.length;i++) {
//			System.out.println("카드"+i+":"+cardSape[p2Deck[i]/13]+cardNum[p2Deck[i]%13]);
//		}
		//사용자에게 카드 한장씩 준 다음 사용자가 받은 카드를 출력하는 프로그램
		//본인원하는 만큼 번갈아서 1장씩 받는다.
		//둘다 그만 받으면 프로그램을 종료하고 받은 카드를 출력해 준다.
		
		boolean isP1PlayFlag=true;
		boolean isP2PlayFlag=true;
		int p1Sum=0;
		int p2Sum=0;
		
		while(isP1PlayFlag||isP2PlayFlag) {
		
			if(isP1PlayFlag) {
				//p1 카드 받기
				System.out.println("p1님 카드를 받으시겠습니까? 1.yes 2.no");
				String input=new java.util.Scanner(System.in).nextLine();
				if(input.equals("1")) {
					p1Deck[p1DeckIndex++]=deck[deckIndex++];
				}else {
					isP1PlayFlag=false;
				}				
			}
			
			if(isP2PlayFlag) {
				//p2 카그 받기
				//p2Deck[p2DeckIndex++]=deck[deckIndex++];
				System.out.println("p2님 카드를 받으시겠습니까? 1.yes 2.no");
				String input=new java.util.Scanner(System.in).nextLine();
				if(input.equals("1")) {
					p2Deck[p2DeckIndex++]=deck[deckIndex++];
				}else {
					isP2PlayFlag=false;
				}
			}
			//받은 카드를 출력할때 카드의 총합을 구해보자.
			// J,Q,K는 10으로 계산한다.
			//2~10 까지은  해당 수를 sum에 더한다.
			//A = 1 or 11   ?  처리방법 일단은 11로 계산하고 만약에 
			//sum이 21이 넘으면  받은 카드에 A가 있으면 -10를 해준다.
			//A확인 중간에 21보다 작아지면 확인 작업을 중단하고
			//더이상 A가 없으면 최종 결과값 sum이된다.
			//p1p2 sum계산
			p1Sum=0;
			for(int i=0;i<p1DeckIndex;i++) {
				if(p1Deck[i]%13<1) {//p1Deck[i] 카드가 A이면 11를 더한다.
					p1Sum=p1Sum+11;
				}else if(p1Deck[i]%13<10) {//p1Deck[i] 2~10이면  2~10를 더한다.  
					p1Sum=p1Sum+p1Deck[i]%13+1;
				}else {//j q k
					p1Sum=p1Sum+10;
				}
			}
			//A찾기 작업
			for(int i=0;i<p1DeckIndex;i++) {
				// p1Sum<=21 만족하면 A 찾는 작업 종료
				if(p1Sum<=21) {
					break;
				}
				if(p1Deck[i]%13==0) {
					//p1Deck[i]%13==0  A가 있으면 10을 빼준다.
					p1Sum=p1Sum-10;
				}
			}

			p2Sum=0;
			for(int i=0;i<p2DeckIndex;i++) {
				if(p2Deck[i]%13<1) {//p2Deck[i] 카드가 A이면 11를 더한다.
					p2Sum=p2Sum+11;
				}else if(p2Deck[i]%13<10) {//p2Deck[i] 2~10이면  2~10를 더한다.  
					p2Sum=p2Sum+p2Deck[i]%13+1;
				}else {//j q k
					p2Sum=p2Sum+10;
				}
			}
			//A찾기 작업
			for(int i=0;i<p2DeckIndex;i++) {
				// p2Sum<=21 만족하면 A 찾는 작업 종료
				if(p2Sum<=21) {
					break;
				}
				if(p2Deck[i]%13==0) {
					//p2Deck[i]%13==0  A가 있으면 10을 빼준다.
					p2Sum=p2Sum-10;
				}
			}

			
			//p1이 가지고 있는 카드를 출력하시오.
			System.out.println("p1이 가지고 있는 카드");
			for(int i=0;i<p1DeckIndex;i++) {
				System.out.println("카드"+i+":"+cardSape[p1Deck[i]/13]+cardNum[p1Deck[i]%13]);			
			}
			System.out.println("p1총점:"+p1Sum);
			
			//p2가 가지고 있는 카드를 출력하시오.
			System.out.println("p2이 가지고 있는 카드");
			for(int i=0;i<p2DeckIndex;i++) {
				System.out.println("카드"+i+":"+cardSape[p2Deck[i]/13]+cardNum[p2Deck[i]%13]);			
			}
			System.out.println("p2총점:"+p2Sum);
			
			if(p1Sum>21||p2Sum>21) {
				break;
			}					
			
		}//while
		
		//승패 출력
		String winner="";
		if(p1Sum>21) {
			winner="p2 승리";
		}else if(p2Sum>21) {
			winner="p1 승리";
		}else if(p1Sum>p2Sum) {
			winner="p1 승리";
		}else if(p1Sum==p2Sum) {
			winner="무승부";
		}else {
			winner="p2 승리";
		}		
		
		System.out.println("최종결과:"+winner);
		System.out.println("개임종료");
		

	}
}














