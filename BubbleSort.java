import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[5];

        System.out.println("请输入五个整数进行排序");

        Scanner num = new Scanner(System.in);

        for (int k = 0; k < arr.length; k++) {
            arr[k] = num.nextInt();
        }

        num.close();

        System.out.println("排序前：");
        printArr(arr);

        for (int i = 0; i < arr.length; i++) {
            boolean flg = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flg = true;
                }
            }

            if (flg == false) {
                break;
            }
        }

        System.out.println("排序后：");
        printArr(arr);

        return;

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }

        System.out.print("\n");

        return;

    }
}