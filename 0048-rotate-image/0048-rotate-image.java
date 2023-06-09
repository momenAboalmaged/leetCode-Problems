class Solution {
    public void rotate(int[][] matrix) {
            int rows = matrix.length;
        int columns = matrix[0].length;
    
        //Transpose
        for (int i=0 ; i < rows; i++) {
            for (int j=i ; j < columns; j++) {
                // rotatedMatrix[j][i] = matrix[i][j];
               int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //rotate : swapping elements of the first column with last column
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < (columns/2); j++) {
                int temp= matrix[i][j];
                matrix[i][j]=matrix[i][columns-1-j];
                matrix[i][columns-1-j]=temp;
            }
        }


     
    
        
    }
}