import java.util.Scanner;

public class testpro01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        MyTools t = new MyTools();

        int[] arr = {7, 2, 3, 7, 8, 1, 9, 4, 7, 5};

        //遍历 排序前
        System.out.println("======arr数组排序前======");         t.print(arr);
        System.out.println();//换行

        //冒泡排序
        t.bubbleSort(arr);

        //遍历 排序后
        System.out.println("======arr数组排序后======");
        t.print(arr);
    }
}
class MyTools {
    public void bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}

