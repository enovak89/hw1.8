import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1_4();
    }

    public static void task1_4() {
        int[] arrayFirst = new int[]{
                1, 2, 3
        };
        double[] arraySecond = {1.57, 7.654, 9.986};
        int[] arrayThird = {10, 9, 8, 7, 6, 5, 4, 3};

        for (int i = 0; i < arrayFirst.length - 1; i++) {
            System.out.print(arrayFirst[i] + ", ");
        }
        System.out.println(arrayFirst[arrayFirst.length - 1]);
        for (int i = 0; i < arraySecond.length - 1; i++) {
            System.out.print(arraySecond[i] + ", ");
        }
        System.out.println(arraySecond[arraySecond.length - 1]);
        for (int i = 0; i < arrayThird.length - 1; i++) {
            System.out.print(arrayThird[i] + ", ");
        }
        System.out.println(arrayThird[arrayThird.length - 1]);

        for (int i = arrayFirst.length - 1; i > 0 ; i--) {
            System.out.print(arrayFirst[i] + ", ");
        }
        System.out.println(arrayFirst[0]);
        for (int i = arraySecond.length - 1; i > 0; i--) {
            System.out.print(arraySecond[i] + ", ");
        }
        System.out.println(arraySecond[0]);
        for (int i = arrayThird.length - 1; i > 0; i--) {
            System.out.print(arrayThird[i] + ", ");
        }
        System.out.println(arrayThird[0]);

        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] % 2 == 1) {
                arrayFirst[i]++;
            }
        }
        System.out.println(Arrays.toString(arrayFirst));
    }
}
