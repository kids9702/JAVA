package Ch22;

import java.util.ArrayList;
import java.util.List;

class Person{
	String name;
	int age;
	String addr;
	
	Person(String name,int age,String addr){
		this.name=name; this.age=age; this.addr=addr;
	}

	@Override
	public String toString() {
		
		return "이름 : "+name
				+" 나이 : "+age
				+" 주소 : "+addr;
	}
	
	
}

public class C02ArrayList {

	public static void main(String[] args) {
		List<Person> list = new ArrayList();
		list.add(new Person("홍길동",30,"대구"));
		list.add(new Person("남길동",40,"서울"));
		list.add(new Person("이지성",29,"울산"));
		
		System.out.println("SIZE : "+list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
			
			
		}
		list.remove(1);
		System.out.println("------------------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
		
		

	}

}
