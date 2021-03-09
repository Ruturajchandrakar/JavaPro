public class BubbleShot {
	public static void main(String[] arg) {
		int []arr= {1,5,3,2,4};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[j-1] > arr[j]) {              //main logic
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("After Sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
