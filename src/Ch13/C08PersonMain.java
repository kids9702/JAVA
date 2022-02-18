package Ch13;


class C08Person{
	String name;
	int age;
	String addr;
	
	
	
	
}




public class C08PersonMain {

	public static void main(String[] args) {
			C08Person[] list = new C08Person[3];
			
			list[0] = new C08Person();
			list[1] = new C08Person();
			list[2] = new C08Person();
			
			
			list[0].name="홍길동";
			list[0].age=50;
			list[0].addr="대구";
		System.out.println(list[0].name);
		System.out.println(list[0].age);
		System.out.println(list[0].addr);
		

	}

}
