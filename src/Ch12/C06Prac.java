package Ch12;


class C06TeokbokkiRecp {
	private void Step1() {
		System.out.println("떡을 넣고 물로 끓인다");
	}
	private void Step2() {
		System.out.println("설탕대충,간장대충~~");
	}
	private void Step3() {
		System.out.println("잘풀어준다~");
	}
	private void Step4() {
		System.out.println("파를넣고 졸인다!");
	}
	public void TCook() {
		Step1();Step2();Step3();Step4();
	}
}

class C06Cooking{
	C06TeokbokkiRecp teokkokkie = new C06TeokbokkiRecp();
	
	
}



public class C06Prac {

	public static void main(String[] args) {
		C06Cooking Jung = new C06Cooking();
		Jung.teokkokkie.TCook();
		

	}

}
