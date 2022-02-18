package Ch16;

abstract class Animal{
	public String kind;
	abstract public void sound();
}
class Dog extends Animal{
	
	Dog(){
		kind="개";
	}
	@Override
	public void sound() {
		System.out.println("멍멍");
		
	}
	
}
class Cat extends Animal{
	Cat(){
		kind="고양이";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
		
	}
	
}





public class C03Animal {

	public static void main(String[] args) {
		
		//Animal ani = new Animal();	//X
		Animal ani=null;
		ani=new Dog();
		ani.sound();
		ani=new Cat();
		ani.sound();
		
	}

}
