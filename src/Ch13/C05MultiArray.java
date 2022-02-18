package Ch13;

public class C05MultiArray {

	public static void main(String[] args) {

		int [][] arr = new int[2][3];	//[행][열]
		
		arr[0][1] = 100;
		arr[1][2] = 200;
		arr[0][0] = 300;
		System.out.println("배열 길이(행) : " + arr.length);
		System.out.println("배열 길이(열) : " + arr[0].length);
		System.out.println("배열 길이(열) : " + arr[1].length);
		System.out.println();
		
		int [][] arr2 = 
			{
					{10,20},
					{30,40,50},
					{60,70,80,90},
					{100,110,120,130}
									
			};
		System.out.println("배열 길이(행) : " + arr2.length);
		System.out.println("배열 길이(열) : " + arr2[0].length);
		System.out.println("배열 길이(열) : " + arr2[1].length);
		System.out.println("배열 길이(열) : " + arr2[1].length);
		System.out.println("배열 길이(열) : " + arr2[2].length);
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
