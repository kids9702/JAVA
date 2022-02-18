package Ch19;

public class C05WrapperClass {

	public static void main(String[] args) {

		//Boxing(기본자료형 -> Wrapper)
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		System.out.println(obj1+obj2);
		Integer obj3 = Integer.valueOf("300");
		System.out.println(obj2+obj3);
		
		//UnBoxing(Wrapper -> 기본자료형)
		int val1 = obj1.intValue();
		int val2 = obj2.intValue();
		int val3 = obj3.intValue();
		
		

	}

}
