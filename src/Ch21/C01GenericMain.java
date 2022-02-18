package Ch21;


class C01Simple<T>{
	private T member;

	public T getMember() {
		return member;
	}

	public void setMember(T member) {
		this.member = member;
	}

	
	
}

public class C01GenericMain {

	public static void main(String[] args) {

		C01Simple<String> obj1 = new C01Simple<String>();
		obj1.setMember("문자열");
		System.out.println(obj1.getMember());
		
		C01Simple<Integer> obj2 = new C01Simple();
		obj2.setMember(100);
		System.out.println(obj2.getMember()+200);

	}

}
