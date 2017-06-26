package easy;

import java.util.HashMap;
import java.util.Stack;

public class FindTheGreaterElementInArray {
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		int[] b = {3,4,5};
		
		int[] res = GiveLargeArray(b, a);;
		
		if(res.length != 0){
			for(int i: res)
				System.out.print(" " + i);
		}else{
			System.out.println("returned null result.");
		}
	}

	private static int[] GiveLargeArray(int[] findNum, int[] nums) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		Stack<Integer> st = new Stack<>();
		for(int num: nums){
			while(!st.isEmpty() && st.peek() < num)
				map.put(st.pop(), num);
			st.push(num);
		}
		for(int i=0;i<findNum.length; i++)
			findNum[i] = map.getOrDefault(findNum[i], -1);
		return findNum;
	}
	
	
}
