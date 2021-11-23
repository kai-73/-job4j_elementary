package exercises.arrays;

public class TriangleMatrix17 {

    public static int[][] rows(int count) {
            int[][] triangle = new int[count][];
            int k = 1;
            for (int i = 0; i < triangle.length; i++) {
                triangle[i] = new int[i + 1]; //создаем одномерный массив строки i, что бы знать размер для trianle[i].length
                for (int j = 0; j < triangle[i].length; j++) {
                    triangle[i][j] = k;
                    k++;
                }
            }
            return triangle;
    }
}
