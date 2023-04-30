import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }


    public static void task1() {
        System.out.println("Task1");
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        double[] doubleArray = {1.57d, 7.654d, 9.986d};

        byte[] byteArray = {1, 10, 20};



    }
    public static void task2() {
        System.out.println("Task2");
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        double[] doubleArray = {1.57d, 7.654d, 9.986d};

        byte[] byteArray = {1, 10, 20};

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(Arrays.toString(byteArray));

    }


    public static void task3() {
        System.out.println("Task3");
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        double[] doubleArray = {1.57d, 7.654d, 9.986d};

        byte[] byteArray = {1, 10, 20};



        System.out.println((Arrays.toString(intArray)).substring(1, 8));

        for (int i = 0; i<= doubleArray.length -1 ; i++) {
            System.out.print(doubleArray[i]);
            if (i != doubleArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        System.out.println((Arrays.toString(byteArray)).substring(1, 10));



    }


    public static void task4() {
        System.out.println("Task4");
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i <= intArray.length -1; i++) {
            if (intArray[i] % 2 != 0) {
                intArray[i] += 1;
            }
        }

        System.out.println(Arrays.toString(intArray));


    }
}





