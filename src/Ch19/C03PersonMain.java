package Ch19;

class C03Person{
	String name;	//이름
	String id;		//주민등록번호
	int age;		//나이
	String addr;
	C03Person(String name, String id, int age, String addr){
		this.name=name;this.id=id;this.age=age;this.addr=addr;
	}
		
	//equals() 재정의하기-> 이름과 id가 같다면 true/아니면 false 리턴
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C03Person) {
			C03Person down = (C03Person)obj;
			return this.name.equals(down.name)&& this.id.equals(down.id);
		}
		return false;
	}
	//toString() 재정의하기-> 이름/id/나이/주소 순으로 출력
	@Override
	public String toString() {
		return "이름 : "+this.name+"\n"
				+"ID : "+this.id+"\n"
				+"나이 : "+this.age+"\n"
				+"주소 : "+this.addr+"\n";
	}
	

	
	
}

public class C03PersonMain {

	public static void main(String[] args) {

		C03Person Hong = new C03Person("홍길동","111111-2222222",30,"대구");
		C03Person Seo = new C03Person("서길동","333333-4444444",40,"대구");
		C03Person Hong2 = new C03Person("홍길동","111111-2222222",30,"대구");
		
		System.out.println(Hong.toString());

	}

}
