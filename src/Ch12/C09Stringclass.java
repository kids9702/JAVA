package Ch12;

public class C09Stringclass {

	public static void main(String[] args) {
		String str1 = new String("Hi Hello?");
		String str2 = new String("My name is Hong Gil Dong");
		String str3 = str1 + str2;
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		System.out.println("CHAR : " + str1.charAt(0));
		System.out.println("CHAR : " + str1.charAt(1));
		System.out.println("CHAR : " + str1.charAt(2));
		System.out.println("CHAR : " + str1.charAt(3));
		System.out.println("CHAR : " + str1.charAt(4));
		System.out.println("길이 : " + str1.length());
		System.out.println("포함문자 : " + str1.contains("Hi"));
		System.out.println("문자교체 : " + str1.replace("Hi", "WoW!"));
		System.out.println("문자열자르기 : " + str1.substring(3,8));
		
		//문제
		String at = new String("aaattt");
		
		System.out.println(at.length());
		System.out.println(at.charAt(2));
		System.out.println(at.charAt(3));
		System.out.println(at.charAt(4));
		System.out.println(at.contains("a"));
		System.out.println(at.replace("t", "T"));
		
	}

}
