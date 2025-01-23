package Pattern;

/* 
   1
   2 3
   4 5 6
   7 8 9 10
 */

public class Pattern6 {
    public static void main(String[] args) {
        int num = 1;
        for(int i=1;i<=4;i++){
            for(int j=0;j<i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
