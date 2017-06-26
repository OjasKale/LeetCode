package easy;

import java.util.HashSet;
import java.util.stream.Stream;

public class Try {

	public static void main(String[] args) {
		String[] cd = {"Hello", "Alaska", "Dad", "Peace"};
		System.out.println(distributeCandies(cd));
	}
	
	 public static String[] distributeCandies(String[] words) {
		 
//		 HashSet<Character> set1 = new HashSet<>();
//		 HashSet<Character> set2 = new HashSet<>();
//		 HashSet<Character> set3 = new HashSet<>();
//		 String st1 = "qwertyuiop";
//		 String st2 = "asdfghjkl";
//		 String st3 = "zxcvbnm";
//		 String[] res = new String[words.length];
//		 for(char c: st1.toCharArray())
//			 set1.add(c);
//		 
//		 for(char c: st2.toCharArray())
//			 set2.add(c);
//		 
//		 for(char c: st3.toCharArray())
//			 set3.add(c);
//	     
//		 for(String firstWord : words){
//			 char c = firstWord.charAt(0);
//			 if(set1.contains(c)){
//				 for(char ch: firstWord.toCharArray()){
//					 if(!set1.contains(ch))
//						 continue;
//				 }
//			 }
//		 }
//		 return res;
		 
		 
		 return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
	    }
}
