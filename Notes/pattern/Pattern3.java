package Pattern;

/* 
   1
   2 4
   3 6 9
   4 8 12 16
   5 10 15 20 25
   6 12 18 24 30 36
   7 14 21 28 35 42 49
 */

public class Pattern3 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
