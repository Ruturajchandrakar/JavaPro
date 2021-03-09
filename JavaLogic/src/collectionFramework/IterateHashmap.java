package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateHashmap {
	public static void main(String[] arg){
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(2,"Raja");
		map.put(5, "mohan");
		map.put(4, "Rakesh");
		System.out.println("Iterate using while loop");
		Set s=map.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()){
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println("key is : "+m1.getKey()+" value is : "+ m1.getValue());
		}
		
		System.out.println("Iterate using advanced for loop");
		for(Map.Entry m2 : map.entrySet()){
			System.out.println("key is : "+m2.getKey()+" value is : "+m2.getValue());
		}
	}
}
