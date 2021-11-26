package exercises.arrays;

public class Converter34 {

    public static int[][] convertInSquareArray(int[][]array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
                count += array[i].length;
        }

        int size = (int) Math.ceil(Math.sqrt(count));
        int[][] exitArray  = new int[size][size];
        int row = 0, cell = 0, countArray = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                exitArray[row][cell++] =  countArray < count ? array[i][j] : 0;
                if (cell == size) {
                    cell = 0;
                    row++;
                }
                countArray++;
            }
        }
        return exitArray;
    }

    public static void main(String[] args) {
        int[][] array = {{1}, {2, 3, 4}, {5, 6}, {7, 8, 9, 10, 11}};
        int[][] res = convertInSquareArray(array);
        for (int z = 0; z < res.length; z++) {
            for (int k = 0; k < res[z].length; k++) {
                System.out.print(res[z][k] + " ");
            }
            System.out.println();
        }
    }
}
