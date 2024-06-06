class Main {
    public static void setMatrixZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean zeroFound = false;
        // Check if any zero is present
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    zeroFound = true;
                    break;
                }
            }
        }
        if (zeroFound) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {6, 3, 12},
                {76, 0, 23},
                {89, 34, 24},
        };
        setMatrixZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
