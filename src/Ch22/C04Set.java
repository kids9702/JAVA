package Ch22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C04Set {

	public static void main(String[] args) {

		Set <String> set = new HashSet();
		
		set.add("JAVA");
		set.add("JDBC");
		set.add("Servlet");
		set.add("JAVA");	//중복된 경우 나중에 저장된 것을 적용

		set.remove("JDBC");
		System.out.println("개수 : "+set.size());
		Iterator<String> iter1=set.iterator();
		while(iter1.hasNext()) {
			String node= iter1.next();
			System.out.println(node);
		}
		
	}

}
