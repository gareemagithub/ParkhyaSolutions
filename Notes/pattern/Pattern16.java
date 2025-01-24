package Pattern;

//                  1
//                1 2 1
//              1 2 3 2 1
//            1 2 3 4 3 2 1
//          1 2 3 4 5 4 3 2 1
//        1 2 3 4 5 6 5 4 3 2 1
//      1 2 3 4 5 6 7 6 5 4 3 2 1
//    1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
//  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

public class Pattern16 {
    public static void main(String[] args) {
        int rowCount = 1;
        for (int i = 9; i > 0; i--)
        {
            //Printing i*2 spaces at the beginning of each row
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
            //Printing j value where j value will be from 1 to rowCount
            for (int j = 1; j <= rowCount; j++)          
            {
                System.out.print(j+" ");
            }
            //Printing j value where j value will be from rowCount-1 to 1 
            for (int j = rowCount-1; j >= 1; j--)
            {               
                System.out.print(j+" ");            
            }                       
            System.out.println();
            rowCount++;
        }
    }
}
