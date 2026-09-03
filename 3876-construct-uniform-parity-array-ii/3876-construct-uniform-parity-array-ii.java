import java.util.*;

class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean hasOdd = false;
        int minVal = Integer.MAX_VALUE;

        for (int num : nums1) {
            if (num % 2 != 0) {
                hasOdd = true;
            }
            if (num < minVal) {
                minVal = num;
            }
        }

        // Agar koi odd number nahi hai, toh pehle se sab even hain -> true
        if (!hasOdd) {
            return true;
        }

        // Agar odd number hai, toh sabko odd banane ke liye min element odd hona chahiye
        return minVal % 2 != 0;
    }
}