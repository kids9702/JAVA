package Ch10;

public class Customer {
	//속성
	int mymoney;		//필드, 멤버변수
	int applecnt;
	
	//생성자
	Customer(int money, int cnt){		//(생성자의 파라미터(매개변수))
		mymoney=money; applecnt=cnt;	//{지역변수}
		
	}
	
	//멤버 메서드
	void payment(Seller seller, int money){		//(메서드의 파라미터(매개변수))
	// 		내보유금액에서 전달한 금액만큼 차감
		mymoney-=money;	//mymoney=money-mymoney;
	//		특정판매자에게 돈을 전달하고 사과개수를 받는다
		int cnt = seller.receive(money);
		
	//		사과개수를 내 applecnt에 저장
		applecnt+=cnt;	//applecnt = cnt+applecnt;
	}
	
	void ShowInfo() {
		System.out.println("보유금액 : " + mymoney);
		System.out.println("보유사과 : " + applecnt + "개");
		
	}
	

}
