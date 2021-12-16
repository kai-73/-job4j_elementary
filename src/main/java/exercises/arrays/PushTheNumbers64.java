package exercises.arrays;

public class PushTheNumbers64 {

    public static void push(int[][] array, int row, int column) {
       //  for (int i = 0; i < array.length; i++) {
        //    for (int j = 0; j < array[i].length; j++) {
            //    if (i == row && j == column - 1) {
                    for (int k = 0; k < column; k++) {
                        array[row][k] = array[row][k + 1];
                    }
             //   } else if (i == row && j == column + 1) {
                    for (int k = 0; k < array.length - column; k++) {
                       array[row][array.length - 1 - k] = array[row][array.length - 2 - k];
                   }
              //  } else if (i == row - 1 && j == column) {
                    for (int k = 0; k < row; k++) {
                        array[k][column] = array[k + 1][column];
                    }
               // } else if (row + 1 == i && column == j) {
                    for (int k = 0; k <  array.length - row; k++) {
                        array[array.length - 1 - k][column] = array[array.length - 2 - k][column];
                    }
               // }
           // }
        //}
        array[row][column] = 0;
    }
}
