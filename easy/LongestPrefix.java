/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class LongestPrefix {
	public static void main(String[] args) {
	
		String[] arr = {"abc","abd","abe"};
		
		String result = longestCommonPrefix(arr);
		System.out.println(result);
	}
	
	public static String longestCommonPrefix(String[] strs) {
		
		HashMap<String, Integer> map = new HashMap<>();
		int higest = 0;
		for(String singleString : strs){
			//System.out.println("For String: " + singleString);
			int i= 1;
			while (i <= singleString.length()) {
				if(map.containsKey(singleString.substring(0, i))){
					int count = map.get(singleString.substring(0, i));
					count++;
					map.put(singleString.substring(0, i), count);
					//System.out.println("Increasing the count for "+ singleString.substring(0, i));
					if(count > higest)
						higest = count;
				}else{
					//System.out.println("putting " + singleString.substring(0, i) + " in the map");
					map.put(singleString.substring(0, i), 1);
				}
				//map.put((singleString.substring(0, i)),);
				i++;
			}
		}
		
		Set<String> keys = map.keySet();
		//String[] keys = (String[]) keys.toArray();
		int len = 0;
		//System.out.println("Substring found "+ map.keySet() + " " + map.get("ab") + " Nigga "+higest);
		System.out.println(keys);
//		for(String s: ){
//			
//			if(map.get(s) == higest){
//				//keys[i] = s;
//				//i++
//			}
//		}
		
        return null;
    }
}
