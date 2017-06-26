/*
 * 	Given nums = [2, 7, 11, 15], target = 9,

 *	Because nums[0] + nums[1] = 2 + 7 = 9,
 *	return [0, 1].
*/		
package easy;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {

	
		public static void main(String[] args) {
			int [] numList1 = {1,2,3,6};
			int[] numList2 = {1,3,4,4};
			int sum = 8;
			int r[] = new int[2];
			r = hasPairWithSum(numList1, sum);
			System.out.println(r[0] + " " + r[1]);
		}
	
		public static int[] hasPairWithSum(int[] NumSum,int sum){
			HashMap<Integer, Integer> map = new HashMap<>();
			
			
			int result[] = new int[2];
			
			for(int i=0;i<NumSum.length;i++){
				System.out.println("Checking for element" + i + ": "+ NumSum[i]);
				if(map.containsKey(NumSum[i])){
					System.out.println(NumSum[i]);
					
					result[0] = map.get(NumSum[i]);
					result[1] = i;
					return result;
				}
				map.put((sum - NumSum[i]), i);
				System.out.println("Stored in Map: " + i + " "+ (sum-NumSum[i]));
			}
			return result;
		}
	
}
