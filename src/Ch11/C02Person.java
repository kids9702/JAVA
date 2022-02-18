package Ch11;

public class C02Person {
	//속성
		int mymoney;
		int colacnt;
		int cidarcnt;
		
		//생성자
		C02Person(int money)
		{
			mymoney = money; colacnt=0; cidarcnt=0;
		}
		
		//기능
		void payment(C02Store store,int type,int money)
		{
			//money를 내 mymoney 에서 차감
			mymoney-=money;
			//store객체의 receive 에 type과 money 전달
			int cnt=store.receive(type, money);
			//store에서 받은 값을 cnt에 저장
			if(type==0) {
				colacnt+=cnt;
			}else {
				cidarcnt+=cnt;
			}
		}
		//확인
		void ShowInfo() {
			System.out.println("MYMONEY : " + mymoney);
			System.out.println("보유COLA : " + colacnt);
			System.out.println("보유CIDAR : " + cidarcnt);
	}
	
	
}
