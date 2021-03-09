public class PrintElementOfArray {
	public static void main(String[] arg){
		int []arr={1,2,3,4,5};
		System.out.println("The element of array is ");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println("The element of array in reverse order is ");
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]+" ");
		}
	}
}
