package Matrix;

public class SumOfRowColumn {
    public static void main(String[] args) {
        int[][] matrix1={{1,2,3},{3,4,5},{5,6,7}};
        int sumRows, sumCols;

        for(int i=0;i<3;i++){
            sumRows=0;
            for(int j=0;j<3;j++){
               sumRows+=matrix1[i][j];
            }
            System.out.println("sum of "+(i+1)+ "row is: "+sumRows);
        }
        for(int i=0;i<3;i++){
            sumCols=0;
            for(int j=0;j<3;j++){
               sumCols+=matrix1[j][i];
            }
            System.out.println("sum of "+(i+1)+ "column is: "+sumCols);
        }
    }
}
