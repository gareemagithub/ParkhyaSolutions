package Matrix;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{3,4,5},{5,6,7}};
        int rows = matrix.length;    
        int cols = matrix[0].length;  
        int[][] transpose=new int[rows][cols];
        for(int i=0;i<cols;i++){
           for(int j=0;j<rows;j++){
               transpose[i][j]=matrix[j][i];
           }
        }
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
         } 
    }
}
