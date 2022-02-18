package Ch10;

public class Main {
	
	public static void main(String[] args) {
		//사과장수 객체생성
		Seller aSeller = new Seller(10000,100,1000);	//보유금액,사과개수,하나당가격
		
		//고객 객체 생성
		Customer Hong = new Customer(5000,0);
		Customer Kang = new Customer(7000,0);
		
		//고객이 사과를 구매하기
		Hong.payment(aSeller, 3000);
		Kang.payment(aSeller, 5000);
		
		//확인
		System.out.println("======판매자======");
		aSeller.ShowInfo();
		System.out.println("======Hong======");
		Hong.ShowInfo();
		System.out.println("======Kang======");
		Kang.ShowInfo();
		
		
		
		
	}
		
}
//필드 생성자 메서드
//