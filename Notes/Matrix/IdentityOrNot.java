package Matrix;

public class IdentityOrNot {
    public static void main(String[] args) {
        int[][] matrix1={{1,0,0},{0,1,0},{0,0,1}};
        boolean flag=true;
        int row=matrix1.length;
        int col=matrix1[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j && matrix1[i][j]!=1){
                    flag=false;
                    break;
                }
                if(i!=j && matrix1[i][j]!=0){
                    flag=false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("Matrix is identity matrix");
        }else{
            System.out.println("Matrix is not identity matrix");
        }
    }
}
