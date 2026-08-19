class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        if (k == 0) return;

        // Step 1: Entire array reverse
        reverse(arr, 0, n - 1);
        // Step 2: First k elements reverse
        reverse(arr, 0, k - 1);
        // Step 3: Remaining elements reverse
        reverse(arr, k, n - 1);
    }

    private void reverse(int[] arr, int si, int ei) {
        while (si < ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
}