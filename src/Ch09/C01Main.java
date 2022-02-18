package Ch09;

public class C01Main {

	public static void main(String[] args) {
		
		C01Person hong = new C01Person(); // 디폴트생성자에 의해 객체 필요공간생성+초기값 저장
		hong.name="홍길동";
		hong.age=33;
		hong.weight=70.5;
		hong.height=177.5F;
		
		System.out.println("이름 : " + hong.name);
		System.out.println("나이 : " + hong.age);
		System.out.println("키 : " + hong.height);
		System.out.println("몸무게 : " + hong.weight);
		

	}

}
