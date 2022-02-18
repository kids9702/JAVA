package Ch13;

public class C03Array {

	public static void main(String[] args) {

		int [] arr1 = new int [3];
		boolean [] arr2 = new boolean[3];
		char [] arr3 = new char[3];
		String [] arr4 = new String[3];
		
		for(int i=0;i<3;i++) {
			System.out.printf("arr1[%d]=%d\n",i,arr1[i]);
			System.out.printf("arr2[%d]=%b\n",i,arr2[i]);
			System.out.printf("arr3[%d]=%c\n",i,arr3[i]);
			System.out.printf("arr4[%d]=%s\n",i,arr4[i]);
			System.out.println();
		}
		
		int [] arr5 = {10,20,30};
		System.out.println("길이 : " + arr5.length);
		
		
		
		
		
		
		
		
	}

}
