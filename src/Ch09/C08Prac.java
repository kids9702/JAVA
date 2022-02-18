package Ch09;

class C09Cal{
	void func1(int x , int y , int z) {
		//큰수->작은수 대로 출력
		if(x>=y && x>=z){
			System.out.print(x+" ");
			if(y>=z)
			{
				System.out.print(y+" "+z);	
			}
			else
			{
				System.out.print(z+" "+y);	
			}
			
		}else if(y>=x&& y>=z) {
			System.out.print(y+" ");
			if(x>=z)
			{
				System.out.print(x+" "+z);	
			}
			else
			{
				System.out.print(z+" "+x);	
			}
		}else {
			System.out.print(z+" ");
			if(x>=y)
			{
				System.out.print(x+" "+y);	
			}
			else
			{
				System.out.print(y+" "+x);	
			}
		}
	}
	void func2(int x , int y , int z) {
		//작은수->큰수 대로 출력
	}
	
	void func3() {
		
	}
	void func4() {
		
	}
	
}
public class C08Prac {
	public static void main(String[] args) {
		C09Cal cal = new C09Cal();
		cal.func1(1, 3, 22);
		cal.func2(10, 21, 5);
	}

}
