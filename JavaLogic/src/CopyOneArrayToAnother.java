public class CopyOneArrayToAnother {
	public static void main(String[] arg){
		int []arr1={10,20,30,40,50};
		int []arr2=new int[arr1.length];
		for(int i=0;i<arr1.length;i++){
			arr2[i]=arr1[i];
		}
		
		System.out.println("Elements of array1");
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]+"");
		}
		
		System.out.println("Elements of array2");
		for(int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]+"");
		}
	}
}
