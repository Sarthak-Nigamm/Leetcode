import java.util.*;
class Solution {
    public int missingNumber(int[] arr) {
           int sum1 = 0, sum2 = 0;
           for(int i =1; i<=arr.length; i++){
            sum1 +=i;
            sum2+=arr[i-1];
           }
           return sum1-sum2;}
}