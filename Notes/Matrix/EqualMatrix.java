package Matrix;

public class EqualMatrix {
    public static void main(String[] args) {
        int[][] matrix1={{1,2,3},{3,4,5},{5,6,7}};
        int[][] matrix2={{1,2,3},{3,4,5},{5,6,7}};
        boolean flag= true;

        int row1=matrix1.length;
        int col1=matrix1[0].length;

        int row2=matrix2.length;
        int col2=matrix2[0].length;

        if(row1!=row2 || col1!=col2){
            System.out.println("Matrix are not equal");
        }else{
            for(int i = 0; i < row1; i++){    
                for(int j = 0; j < col1; j++){    
                  if(matrix1[i][j] != matrix2[i][j]){    
                      flag = false;    
                      break;    
                   }
                }
            }
        }
        if(flag){
            System.out.println("Matrix arte equal");
        }else{
            System.out.println("matrix are not equal");
        }
    
    }
}
