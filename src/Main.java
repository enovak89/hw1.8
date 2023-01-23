import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {

        task1_4();
        taskAdd5();
        taskAdd6();
        taskAdd7();
        taskAdd8();
        taskAdd9();
        taskAdd10();
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

        for (int i = arrayFirst.length - 1; i > 0; i--) {
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

    public static void taskAdd5() {
        System.out.println("Task5");
        int[] arrayFirst = new int[15];
        int countOfEven = 0;
        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] = ThreadLocalRandom.current().nextInt(0, 100);
            if (arrayFirst[i] % 2 == 0) {
                countOfEven++;
            }
        }
        System.out.println(Arrays.toString(arrayFirst) + "\n" + countOfEven);
    }

    public static void taskAdd6() {
        System.out.println("Task6");
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(1, 11);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void taskAdd7() {
        System.out.println("Task7");
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int arr1Average = 0, arr2Average = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = ThreadLocalRandom.current().nextInt(0, 6);
            arr2[i] = ThreadLocalRandom.current().nextInt(0, 6);
            arr1Average += arr1[i];
            arr2Average += arr2[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.printf("%.2f\n", (double) arr1Average / arr1.length);
        System.out.printf("%.2f\n", (double) arr2Average / arr2.length);
        if (arr1Average / arr1.length > arr2Average / arr2.length) {
            System.out.println("Ср арифм первого массива больше");
        } else if (arr1Average / arr1.length < arr2Average / arr2.length) {
            System.out.println("Ср арифм второго массива больше");
        } else {
            System.out.println("Ср арифм массивов равны");
        }
    }

    public static void taskAdd8() {
        System.out.println("Task8");
        int[] arr = new int[4];
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(10, 100);
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j + 1] >= arr[j]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        System.out.println(flag == true ? "Возрастающий" : "нет");
    }

    public static void taskAdd9() {
        System.out.println("Task9");
        int[] arr = new int[20];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void taskAdd10() {
        System.out.println("Task10");
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];
        int[] arr4 = new int[10];
        int[] arr5 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) pow(i + 1, 2);
        }
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr2.length; i++) {
            if (i % 2 == 1) {
                arr2[i] = - (int) pow(i + 1, 2);
            } else {
                arr2[i] = (int) pow(i + 1, 2);
            }
        }
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr3.length; i++) {
            if (i % 2 == 1) {
                arr3[i] = - 1;
            } else {
                arr3[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr3));
        int j = 1;
        for (int i = 0; i < arr4.length; i++) {
            if (i % 2 == 0) {
                arr4[i] = j;
                j++;
            } else {
                arr4[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr4));

    }
}
