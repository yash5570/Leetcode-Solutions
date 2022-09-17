import java.util.*;

class TwoSum {
    public static void main(String[] args) {
        
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            if(hm.containsKey(target - nums[i])) {
                int[] arr = new int[2];
                arr[0] = hm.get(target - nums[i]);
                arr[1] = i;
                
                return arr;
            } else {
                hm.put(nums[i], i);
            }
        }
        
        return new int[2];
    }
}