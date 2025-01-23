package Matrix;

public class AddSubMatrix {
    public static void main(String[] args) {
        int[][] matrix1={{1,2,3},{3,4,5},{5,6,7}};
        int[][] matrix2={{1,2,3},{3,4,5},{5,6,7}};
        int[][] result= new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               result[i][j]=matrix1[i][j]+matrix2[i][j];
               System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
}
