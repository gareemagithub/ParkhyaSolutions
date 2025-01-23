package Pattern;

/* 
   A
   B B
   C C C
   D D D D
   E E E E E
 */

public class Pattern11 {
    public static void main(String[] args) {
        char letter='A';
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
               System.out.print(letter+" ");
            }
            System.out.println();
            letter++;
        }
    }
}
