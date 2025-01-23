package Matrix;

public class SparseMatrix {
    public static void main(String[] args) {
        int[][] matrix1={{1,0,0},{0,1,0},{0,0,1}};
        int row=matrix1.length;
        int col=matrix1[0].length;
        int size=row*col, count=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix1[i][j]==0){
                    count++;
                }
            }
        }
        if(count>size/2){
            System.out.println("matrix is sparse");
        }
        else{
            System.out.println("matrix is not sparse");
        }
    }
}
