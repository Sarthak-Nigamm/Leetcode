class Solution {
    public void sortColors(int[] nums) {
    int c[] = new int[3];
    for(int i =0; i<nums.length; i++){
        c[nums[i]]++;
    }
    int k =0;
    for(int i = 0; i<=2; i++){
        while(c[i]>0){
            nums[k++] = i;
            c[i]--;
        }
    }
    }
}