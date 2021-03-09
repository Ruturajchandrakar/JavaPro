/*Date-22/10/20
 * Write a function: class Solution { public int solution(int[] A); } that, 
given an array A of N integers, returns the smallest positive integer (greater than 
that does not occur in A. For example, given A = [1, 3, 6, 4, 1, 2], 
the function should return 5. Given A = [1, 2, 3], the function should return 4. 
Given A = [-1, -3],the function should return 1 in java.*/

package SharpLogic;

import java.util.Arrays;
class SmallestPositiveNumber {
	public static void solution(int []A){
		Arrays.sort(A);
		int length=A.length;
		int min=1;
		for(int i=0;i<length;i++){
			if(A[i] == min){
				min++;
			}
		}
		System.out.println(min);
	}
	
	public static void main(String[] arg){
		int []A={-1,-2};
		solution(A);
	}
}