class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int totalSum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int startCount = i + 1;
            int endCount = n - i;
            int totalSubarrays = startCount * endCount;
            int oddSubarrays = (totalSubarrays + 1) / 2;

            totalSum += arr[i] * oddSubarrays;
        }

        return totalSum;
    }
}