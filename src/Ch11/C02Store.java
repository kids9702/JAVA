package Ch11;

public class C02Store {

	int mymoney;
	int colacnt;
	int cidarcnt;
	int colaprice;
	int cidarprice;
	
	C02Store(int money,int c1 , int c2 , int c1price , int c2price)
	{
		mymoney=money;colacnt=c1;cidarcnt=c2;colaprice=c1price;
		cidarprice=c2price;
	}
	
	int receive(int type,int money) {
		//money를 내money에 더함
		mymoney+=money;
		//type 이 0,1인지 가림(if)
		if(type==0)//콜라
		{
			//전달할 제품의 개수를 구함
			int cnt=money/colaprice;
			//현재 재고량에서 개수를 차감
			colacnt-=cnt;
			//개수를 리턴
			return cnt;
		}
		else //사이다
		{
			//전달할 제품의 개수를 구함
			int cnt=money/cidarprice;
			//현재 재고량에서 개수를 차감
			cidarcnt-=cnt;
			//개수를 리턴
			return cnt;
		}
		
		
	}
	
	void ShowInfo() {
		System.out.println("MYMONEY : " + mymoney);
		System.out.println("보유COLA : " + colacnt);
		System.out.println("보유CIDAR : " + cidarcnt);
	}
	
	
}
