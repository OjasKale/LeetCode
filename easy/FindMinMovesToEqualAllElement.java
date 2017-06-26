/*
 * Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.

Example:

Input:
[1,2,3]

Output:
3

Explanation:
Only three moves are needed (remember each move increments two elements):

[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]

Logic: 
sum(Array) - n * min(array);
 */
package easy;


public class FindMinMovesToEqualAllElement {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		System.out.println(minMoves(a));
	}
	
	 public static int minMoves(int[] nums) {
		
		 int sum=0,min = nums[0];
		 for(int i: nums){
			 sum += i;
			 min = Math.min(min, i);
		 }
		 return (sum - (nums.length * min));
	 }
}
