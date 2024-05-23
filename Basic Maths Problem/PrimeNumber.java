class Main{
    public static int primeNumber(int N){
        int a = 1;
        for(int i=2;i*i<=N;i++){
            if(N%i==0){
                a=0;
                break;
            }
        }
        return a;
    }
}