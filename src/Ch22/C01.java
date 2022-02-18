package Ch22;

import java.util.ArrayList;

public class C01 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList();
		list.add("JAVA");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.remove(1);
		
		System.out.println("저장된 객체 수 : "+list.size());
		
		System.out.println("list.get(0) : "+list.get(0));
		System.out.println("list.get(0) : "+list.get(1));
		System.out.println("list.get(0) : "+list.get(2));
		System.out.println("list.get(0) : "+list.get(3));
		
		list.clear();	//전체 삭제
		
	}

}
