class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean>ans=new ArrayList<>();

        int max=Integer.MIN_VALUE;

        for(int i=0;i<candies.length;i++){

            if(candies[i]>max){
                max=candies[i];
            }
        }

        for(int j=0;j<candies.length;j++){
            int sum=candies[j]+extraCandies;

            if(sum>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}