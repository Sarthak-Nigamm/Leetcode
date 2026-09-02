class Solution {

    public boolean uniformArray(int[] nums1) {

        boolean op = false;

        boolean ae = false;

        for(int i =0; i<nums1.length; i++){

            if(nums1[i]%2!=0){

                op = true;

                return op;

            }

        }



  return op == false;  }

}