package easy;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;


public class SimpleTryouts {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int[] greedFactor = {1,2,3,3,5};
		System.out.println(tryit(greedFactor));
		//sc.close();
	}
	
	public static List<Integer> tryit(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
        
        for(int i=0;i<=nums.length;i++){
            result.add(i);
        }
        
        for(int i: nums){
            if(result.contains(i)){
            	result.remove(result.indexOf(i));
            }
            	
                
        }
        return result;
    }
		
	
}
