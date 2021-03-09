package collectionFramework;

import java.util.HashMap;

public class CountNoOfWordUsingHashmap {
	public static void main(String[] arg){
		String str="my name is raja my raja";
		String []arr=str.split(" ");
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				int count=map.get(arr[i]);
				map.put(arr[i], count+1);
			}
			else{
				map.put(arr[i],1);
			}
		}
		System.out.println(map);
	}
}
