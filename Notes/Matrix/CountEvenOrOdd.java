package Matrix;

public class CountEvenOrOdd {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{3,4,5},{5,6,7}};
        int countEven=0, countOdd=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matrix[i][j]%2==0){
                    countEven++;
                }else{
                    countOdd++;
                }
            }
        }
        System.out.println("Even numbers are: "+countEven);
        System.out.println("Odd numbers are: "+countOdd);

    }
}
