package Matrix;

public class LowerUpperTraingularMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{3,4,5},{5,6,7}};
        int row=matrix.length;
        int col=matrix[0].length;

        if(row!=col){
            System.out.println("matrix should be square matrix");
        }else{
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(j>i){
                        System.out.print("0 ");
                    }else{
                        System.out.print(matrix[i][j]+" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
