package exercises;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] rsl = new int[right.length + 1];
        rsl[0] = left[0];
        rsl[rsl.length - 1] = left[left.length - 1];
        int rslPoint = 1;
        int j = 0;
        while (rslPoint != rsl.length - 1) {
            rsl[rslPoint++] = rslPoint % 2 == 0 ? right[j++] : middle[j++];
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] left = {1, 2, 3, 4, 5};
        int[] middle = {6, 7, 8, 9, 10};
        int[] right = {11, 12, 13, 14, 15, 16};
        int[] z = union(left, middle, right);
        int i = 0;
        System.out.print("{ ");
        while (i < z.length) {
            System.out.print(z[i++] + " ");
        }
        System.out.print("}");
    }
}
