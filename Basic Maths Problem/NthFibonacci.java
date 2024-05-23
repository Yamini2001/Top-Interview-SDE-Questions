class Main{
    public static int NthFibonacci(int n){
        int x = 100000007;
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        int a = 1;
        int b =1;
        int fib = 0;
        for(int i=3;i<=n;i++){
            fib = (a+b) % x;
            a = b;
            b= a;
        }
        return (int) fib;
    }
}