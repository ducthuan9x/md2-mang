import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập size mảng");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("nhập size cho arr2");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("phần tử mảng thứ : " + i);
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("phần tử thứ : " + i);
            arr2[i] = scanner.nextInt();
        }
        int[] arr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = arr1.length; i < arr.length; i++) {
            arr[i] = arr2[i-arr1.length];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}