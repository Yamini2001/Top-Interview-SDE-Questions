class Main{
    public static int reverseNumber(int n){
        int reverseNum = 0;
        while(n!=0){
            int digit = n %10;
            reverseNum = reverseNum*10 + digit;
        }
        return reverseNum;
    }
    public static void main(String[] args){
        int n = 35643;
        int reverseNum = reverseNumber(n);
        System.out.println("Reverse Number is: "+reverseNum);
    }
}