package Ch19;

public class C04StringBuffer {

	public static void main(String[] args) {

		String str1 = "Hello World ";
		String str2 = "JAVA는 재미있다?";
		String str3 = str1.concat(str2);
		
		StringBuffer buff = new StringBuffer("Hello World");
		
		System.out.println(buff.hashCode());
		

	}

}
