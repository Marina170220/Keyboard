
import java.util.Random;

public class ShellSorting {

    static void shellSort(int[] arr) {
        int increment = arr.length / 2;
        while (increment > 0) {
            for (int i = 0; i < arr.length - increment; i++) {
                int j = i;
                while ((j >= 0) && ((arr[j]) > arr[j + increment])) {
                    int temp = arr[j];
                    arr[j] = arr[j + increment];
                    arr[j + increment] = temp;
                    j--;
                }
            }
            increment /= 2;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " , ");
        }
        System.out.println();
        ShellSorting.shellSort(arr);
    }
}