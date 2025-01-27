package Pattern;

//            1
//          1   1
//        1   2   1
//      1   3   3   1
//    1   4   6   4   1
//  1   5  10  10   5   1

public class Pattern13 {
    public static void main(String[] args) {

        // int col=1, rows=6;
        // for(int i=0;i<rows;i++){
        //     for(int space = 1; space < rows - i; ++space) {  
        //         System.out.print("  ");  
        //     }    

        //     for(int j = 0; j <= i; j++) {  
        //         if (j == 0 || i == 0)  
        //             col = 1;  
        //         else  
        //             col = col * (i - j + 1) / j;  
        //         // System.out.printf("%4d", col);  
        //         System.out.print(" "+col+"  "); 
        //     } 
        //     System.out.println(); 
        // }

        int rows = 5; 
        for (int i = 0; i < rows; i++) {
            int number = 1; 

            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <=i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);  
            }
            System.out.println();  // Move to the next line after printing a row
        }
    }
}
