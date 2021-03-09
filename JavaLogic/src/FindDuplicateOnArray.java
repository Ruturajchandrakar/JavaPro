public class FindDuplicateOnArray {
	public static void main(String[] arg){
		int arr[]={10,30,40,50,10};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] == arr[j]){
					System.out.println(arr[j]+"");
				}
			}
		}
	}
}
