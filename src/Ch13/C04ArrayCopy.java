package Ch13;

public class C04ArrayCopy {

	public static void main(String[] args) {

		int [] arr1 = new int[3];
		int [] arr2 = {100,200,300};
		
		arr1=arr2; //얕은복사(위치,주소복사)
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr1[i]);
		}
		arr1[0]=123;
		arr1[1]=456;
		arr1[2]=789;
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		int[] arr3 =new int[3];
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=arr2[i]; //깊은 복사(값자체 복사)
		}
		
		//깊은 복사 함수
		//System.arraycopy(원본위치,원본복사시작idx,대상위치,대상복사시작idx,복사요소개수)
	}

}
