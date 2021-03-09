import java.util.Scanner;

public class LinearSearch {
	static int res;
	static void binarySearch(int[] arr,int key){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key)
				res=i;
		}
	}
	
	public static void main(String[] arg){
		System.out.println("Enter the array length");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("Enter the element of the array");
		Scanner st=new Scanner(System.in);
		int arr[]=new int[n];
		for(int j=0;j<n;j++){
			arr[j]=st.nextInt();
		}
		
		System.out.println("Enter the key to find ");
		Scanner sp=new Scanner(System.in);
		int key=sc.nextInt();
		
		binarySearch(arr,key);
		System.out.println(key+" is found at index "+res);
	}
}
