class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int k = n / 3;
        
        Arrays.sort(nums);
        
        int count = 1;
        for (int i = 0; i < n; i++) {
            // Consecutive duplicate element count update
            if (i > 0 && nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            
            // Condition check: Count strictly > k aur duplicate list check
            if (count > k) {
                if (list.isEmpty() || list.get(list.size() - 1) != nums[i]) {
                    list.add(nums[i]);
                }
            }
        }
        
        return list;
    }
}