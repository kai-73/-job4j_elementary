package exercises;

public class NonSquareArray12 {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1}, {2, 3}, {4, 5, 6}};
        for (int i = 0; i < array.length; i++) {
<<<<<<< HEAD
            System.out.print(array[i].length + " - ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
=======
            System.out.print(array[i].length + " - {");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println("}");
>>>>>>> 4a5e4bf (1.2. Создание неоднородного двумерного массива.)
            System.out.println();
        }
    }
}
