public class SumOfArray {
	public static void main(String[] arg){
		int sum=0;
		int []arr={1,2,3,4,5};
		for(int i=0;i<arr.length;i++){
			sum=sum+=arr[i];
		}
		System.out.println("Sum is : "+sum);
	}
}
