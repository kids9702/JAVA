package Ch09;

class C11Simple{
	
	int sum(int x, int y) {return x+y;}
	double sum(double x, double y) {return x+y;}
	int sum(int x, int y, int z) {return x+y+z;}
	String sum(String x, String y) {return x+y;}
	
	
}


public class C11FunctionOverloading {

	public static void main(String[] args) {
		C11Simple obj = new C11Simple();
		System.out.println("sum(int,int) : " +obj.sum(10, 20));
		System.out.println("sum(double,double) : " +obj.sum(10.5, 20.5));
		System.out.println("sum(int,int,int) : " +obj.sum(10, 20, 30));
		System.out.println("sum(String,String) : " +obj.sum("hi", "hello"));
		

	}

}
