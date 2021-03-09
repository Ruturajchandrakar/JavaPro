/*Write a program to sum the smallest two numbers from given N positive numbers. 
 * If the smallest no is is apperead more than once,then sum them too.
 * Dont sort the order of the data*/

package SharpLogic;

import java.util.ArrayList;

public class SumOfSmallestTwoNo {
	public static void main(String[] arg){
		int arr[]={2,2,3};
		int count=0,count2=0;
		int sum=0,sum2=0;
		int min=Integer.MAX_VALUE;
		int secondmin=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				secondmin=min;
				min=arr[i];
				if(min==arr[i]){
					count++;
					if(count==2){
						sum=min+arr[i];
					}
				}
				
			}
			if((arr[i]<secondmin) && (arr[i]!=min)){
				secondmin=arr[i];
				if(secondmin==arr[i]){
					count2++;
					if(count==2){
						sum2=secondmin+arr[i];
					}
				}
			}
		}
		System.out.println("The sum of the smallest element in this array is: "+(min+secondmin));
		System.out.println(sum);
		System.out.println(sum2);
	}
}