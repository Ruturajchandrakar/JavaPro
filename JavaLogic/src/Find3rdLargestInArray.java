import java.util.Arrays;

public class Find3rdLargestInArray {
	public static void main(String []arg){
		int []arr={1,3,4,5,2};
		int length=arr.length;
		Arrays.sort(arr);
		int no=arr[2];
		int no2=arr[1];
		System.out.println("The 3rd largest element is :"+no);
		System.out.println("The second smallest element is : "+no2);
	}
}
