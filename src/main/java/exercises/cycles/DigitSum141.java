package exercises.cycles;

public class DigitSum141 {
    public static int sum(int num) {
       String str = Integer.toString(num);
       int convert;
       int summa = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch =  str.charAt(i);
            //convert =  ch;
            convert = Character.getNumericValue(ch);
            summa += convert;
        }
        return summa;
    }

    public static void main(String[] args) {
        System.out.println(sum(10601));
    }
}
