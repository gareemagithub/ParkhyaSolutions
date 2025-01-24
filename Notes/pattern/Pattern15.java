package Pattern;

//         1
//        1 2
//       1 2 3
//      1 2 3 4
//     1 2 3 4 5
//    1 2 3 4 5 6
//   1 2 3 4 5 6 7

public class Pattern15 {
    public static void main(String[] args) {
        int rowCount = 1;
        for (int i = 7; i > 0; i--)
        {
            //Printing i spaces at the beginning of each row
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            //Printing 'rowCount' value 'rowCount' times at the end of each row
            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            //Incrementing the rowCount
            rowCount++;
        }
    }
}
