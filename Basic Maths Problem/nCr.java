class Solution{
    static int nCr(int n, int r)
    {
        // code here
        int mod = 1000000007;
        if(r>n){
            return 0;
        }
        int[] prev = new int[r+1];
        int[] curr = new int[r+1];
        prev[0] = curr[0] = 1;
        if(r==n || r==0){
            return 1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=r;j++){
                curr[j] = (prev[j-1] + prev[j]) % mod;
            }
            prev = curr.clone();
        }
        return prev[r];
    }
}
