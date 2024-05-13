class Main{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] prefix = new int[5];
        prefix[0] = arr[0];
        for(int i=1;i<5;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0;i<5;i++){
            System.out.println(prefix[i]+" ");
        }
    }
}