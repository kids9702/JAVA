package Ch15;

class Animal{
	
	
	public void Sound() {
		System.out.println("소리를 냅니다.");
	}
}
class Dog extends Animal{
	public void Sound() {
		System.out.println("멍멍 소리를 냅니다.");
	}
}
class Cat extends Animal{

	@Override
	public void Sound() {
		System.out.println("야옹 소리를 냅니다.");
	}
	
}


public class C04Overriding {

	public static void main(String[] args) {

		Dog poppi = new Dog();
		Cat yummi = new Cat();
		poppi.Sound();
		yummi.Sound();

	}

}
