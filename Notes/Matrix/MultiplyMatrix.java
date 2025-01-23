package Matrix;

public class MultiplyMatrix {
    public static void main(String[] args) {
        int[][] matrix1={{1,2,3},{3,4,5},{5,6,7}};
        int[][] matrix2={{1,2,3},{3,4,5},{5,6,7}};
        int[][] result= new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    result[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
