package Ch09;

public class C04Main {

	public static void main(String[] args) {
		C04Person hong = new C04Person(); // 디폴트생성자에 의해 객체 필요공간생성+초기값 저장
		hong.name="홍길동";
		hong.age=33;
		hong.weight=70.5;
		hong.height=177.5F;
		
		hong.speak();
		hong.Info();
	}

}
