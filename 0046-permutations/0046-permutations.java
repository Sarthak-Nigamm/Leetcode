import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void pp(int[] nums, int arr[], int idx, List<List<Integer>> list) {
        // Base Condition
        if (nums.length == 0) {
            // int[] array ko List<Integer> mein convert karke list mein add kar diya
            List<Integer> temp = new ArrayList<>();
            for (int x : arr) {
                temp.add(x);
            }
            list.add(temp);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            arr[idx] = nums[i];

            // 1. Syntax Fix: Array declaration mein [] miss ho gaya tha
            int[] newnums = new int[nums.length - 1];

            // Pehle ke elements copy kiye
            for (int j = 0; j < i; j++) {
                newnums[j] = nums[j];
            }

            // 2. Index Fix: i ke baad wale elements ko newnums ke (j-1) index pe shift kiya
            for (int j = i + 1; j < nums.length; j++) {
                newnums[j - 1] = nums[j];
            }

            // 3. Parameter Fix: 'list' ko recursion call mein pass kiya
            pp(newnums, arr, idx + 1, list);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int arr[] = new int[nums.length];
        pp(nums, arr, 0, list);
        
        // 4. Return Fix: Final answer return karna reh gaya tha
        return list; 
    }
}