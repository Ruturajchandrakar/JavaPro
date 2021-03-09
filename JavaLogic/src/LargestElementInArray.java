public class LargestElementInArray {
	public static void main(String[] arg){
		int []arr={1,2,3,4,5};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		for(int j=0;j<arr.length;j++){
			if(arr[j]<min){
				min=arr[j];
			}
		}
		System.out.println("Largest element present in the given array is : "+max);
		System.out.println("Smallest element present in the given array is : "+min);
	}
}
