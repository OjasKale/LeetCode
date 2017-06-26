package easy;

import java.util.Vector;

public class BinaryComponentNumber {
	public static void main(String[] args) {
		String st = "pwwkew";
		int len = Solution(st);
		System.out.println(len);
	}
	
	public static int Solution(String st){
		int size = 0;
		char[] arr = st.toCharArray();
		Vector<Character> vc = new Vector<>();
		for(char c: st.toCharArray()){
			if(vc.contains(c)){
				size = vc.size();
				int ind = vc.indexOf(c);
				for(int i=0;i<=ind;i++)
					vc.remove(i);
				
			}
			vc.add(c);
		}
		
		return size; 
	}

}
