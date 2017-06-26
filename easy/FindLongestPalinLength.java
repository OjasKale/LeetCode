package easy;

import java.util.HashMap;
import java.util.Scanner;

public class FindLongestPalinLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(calculatePalin(s));
		sc.close();
	}
	
	public static int calculatePalin(String s){
		HashMap<Character, Integer> map = new HashMap<>();
		int longestPalinLength = 0;
		for(char c: s.toCharArray()){
			
			if(map.containsKey(c)){
				int count = map.get(c);
				count++;
				map.put(c, count);
			}else{
				map.put(c, 1);
			}
		}
		int maxodd = 0;
		for(int i: map.values()){
			if(i%2 == 0){
				longestPalinLength += i ;
			}else{
				if(i > maxodd)
					maxodd = i;
			}
			
		}
		return longestPalinLength + maxodd;
	}
}


/*
 * public int longestPalindrome(String s) {
        if(s==null || s.length()==0) return 0;
        HashSet<Character> hs = new HashSet<Character>();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                count++;
            }else{
                hs.add(s.charAt(i));
            }
        }
        if(!hs.isEmpty()) return count*2+1;
        return count*2;
}
 */
