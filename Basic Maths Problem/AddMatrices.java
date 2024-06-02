class Main{
    public static int[][] addMatrix(int[][] A,int[][] B){
        int rows = A.length;
        int columns = A[0].length;
        int[][] C = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }
    public static void main(String[] args) {
        int[][] A = {
                {1,5,4},
                {6,4,3},
                {8,2,3},
        };
        int[][] B = {
                {7,3,5},
                {3,2,7},
                {23,76,34},
        };
        int[][] result = addMatrix(A,B);
        for(int i=0;i< result.length;i++){
            for(int j=0;j< result[0].length;j++){
                System.out.println(result[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}