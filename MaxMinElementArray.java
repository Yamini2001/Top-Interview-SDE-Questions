class Main{
    public static int[] maxMinElement(int[] arr,int n){
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return new int[]{largest,smallest};
    }
    public static void main(String[] args){
        int[] arr={54,23,12,65,29,10,34};
        int n = arr.length;
        int[] maxMin = maxMinElement(arr,n);
        System.out.println("Largest Element: "+maxMin[0]);
        System.out.println("Smallest Element: "+maxMin[1]);
    }
}