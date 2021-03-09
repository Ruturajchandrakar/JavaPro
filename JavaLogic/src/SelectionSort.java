public class SelectionSort {
	public static void main(String[] arg){
		int[] arr={8,9,7,2,5,4,2,4};
		int temp=0;
		int arr_length=arr.length;
		for(int i=0;i<arr_length;i++){
			for(int j=i+1;j<arr_length;j++){
				if(arr[i]>arr[j]){                  //swapping
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("After Sorting:");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
	}
}
