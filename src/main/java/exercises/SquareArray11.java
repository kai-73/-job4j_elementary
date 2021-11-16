package exercises;

public class SquareArray11 {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2}, {3, 4}};
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
