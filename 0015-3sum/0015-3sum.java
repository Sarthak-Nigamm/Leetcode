import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Array ko sort karein
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Duplicate 'i' elements ko skip karein
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Duplicate 'left' aur 'right' elements ko skip karein
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Sum chota hai, pointer aage badhayein
                } else {
                    right--; // Sum bada hai, pointer piche layein
                }
            }
        }
        
        return result;
    }
}