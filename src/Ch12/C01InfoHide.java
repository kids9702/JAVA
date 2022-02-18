package Ch12;

//접근한정자
//public : 모든 클래스에서 접근가능
//protected : 동일 패키지에 속한 클래스 or 상속관계에서 하위클래스에서만 접근가능
//default : 동일 패키지에 속한 클래스에서만 사용가능(기본)
//private : 현재 클래스에서만 접근가능

class C01Person{
	public String name;
	private int age;
	private float weight;
	private double height;
	C01Person(String name){
		this.name = name;
	}
	//Setter 함수
	public void setAge(int age) {
		this.age = age;
	}
	//Getter 함수
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
}


public class C01InfoHide {

	public static void main(String[] args) {

		C01Person Kim = new C01Person("김상중");
		//Kim.age=30;	//직접접근 불가능
		Kim.setAge(30);
		Kim.setHeight(155.6);
		Kim.setWeight(50.5F);
		System.out.println(Kim.getAge());
	}

}
