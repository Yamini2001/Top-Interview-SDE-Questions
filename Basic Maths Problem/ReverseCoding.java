class Solution {
    static int sumOfNaturals(int n) {
        // code here
        long mod = 1000000007; // Modulo value
        long sum = ((long)n * (n + 1)) / 2 % mod; // Calculate the sum and apply modulo
        return (int)sum; // Convert the sum to int before returning
    }
};