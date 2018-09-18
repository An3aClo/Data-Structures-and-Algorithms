package multidemensionalarray;

public class MultidemensionalArray {

    public static void main(String[] args) {
        int[][] m = new int[5][30];

        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 3; col++) {
                m[row][col] = row + col;
            }
        }

        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 3; c++) {

                System.out.print(m[r][c] + ", ");
             
               
            }
          System.out.println();
        }
        
    }

}
