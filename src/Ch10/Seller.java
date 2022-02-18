package Ch10;

public class Seller {
	//속성
		int mymoney;
		int applecnt;
		int price; //사과 하나당 가격
		
		//생성자
		Seller(int money, int cnt,int price){
			mymoney=money; applecnt=cnt; this.price = price;
			
		}
		
		//멤버 메서드
		int receive(int money){
		// 		내보유금액에서 받은 돈을 추가 
			mymoney+=money;	//mymoney=mymoney+money;
		//		받은돈의 액수만큼 사과개수를 차감
			int cnt = money/price;
			applecnt-=cnt; // applecnt = cnt-applecnt;
		//		사과개수를 전달(리턴)
			return cnt;
		}
		
		void ShowInfo() {
			System.out.println("보유금액 : " + mymoney);
			System.out.println("보유사과 : " + applecnt + "개");
			
		}
	
}
