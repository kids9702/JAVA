package Ch09;

public class C04Person {
	//속성(==필드,멤버변수)
	String name;
	int age;
	float height;
	double weight;
	//기능(==메서드,멤버함수,멤버메서드)
	public void speak() {
		System.out.println(name+" 님이 말합니다");
	}
	public void Info() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
	}
	
}
