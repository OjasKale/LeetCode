package easy;

import java.util.Arrays;

public class SingleNumber {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int ans = SingleNum(a);
		System.out.println(ans);
	}

	private static int SingleNum(int[] nums) {
		Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(((i+1) < nums.length-1) && nums[i] == nums[i+1]){
                i++;
            }else{
                return nums[i];
            }
        }
        return 0;
		
	}
}
