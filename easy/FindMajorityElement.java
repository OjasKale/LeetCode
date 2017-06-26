package easy;

import java.util.HashMap;
import java.util.Scanner;

public class FindMajorityElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] nums = new int[size];
		for(int i=0;i<size;i++){
			nums[i] = sc.nextInt();
		}
		System.out.print(calculateMajorEle(nums));
		sc.close();
	}
	
	public static int calculateMajorEle(int[] nums){
		HashMap<Integer, Integer> map = new HashMap<>();
        
		if(nums.length == 1)
			return nums[0];
        for(int i: nums){
            if(map.containsKey(i)){
                int count = map.get(i);
                count++;
                if(count > (nums.length/2))
                    return i;
                map.put(i, count);
            }else{
                map.put(i, 1);
            }
        }
        return 0;
	}
}
