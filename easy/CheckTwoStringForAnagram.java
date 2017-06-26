package easy;

import java.util.Arrays;
//import java.util.HashSet;
import java.util.Scanner;

public class CheckTwoStringForAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(CheckIt(s1, s2));
		sc.close();
	}
	
	public static boolean CheckIt(String s1, String s2){
//		HashSet<Character> set = new HashSet<>();
//		String s = s1+s2;
//		for(char c: s.toCharArray()){
//			if(set.contains(c)){
//				set.remove(c);
//			}else{
//			set.add(c);
//			}
//		}
//		if(set.isEmpty()) return true;
//		return false;
		char[] a1 = s1.toCharArray();
		Arrays.sort(a1);
		char[] a2 = s2.toCharArray();
		Arrays.sort(a2);
		if(a1.length != a2.length)
			return false;
		for(int i=0;i<a1.length;i++){
			if(a1[i] != a2[i])
				return false;
		}
		
		
		return true;
	}

}
