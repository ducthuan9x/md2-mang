import java.util.Scanner;

public class ThemPt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập size của arr");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhập vào phần tử thứ " + i);
            arr[i] = scanner.nextInt();
        }
        int[] arr2= new int[arr.length+1];
            System.out.println("nhập phần tử cần thêm");
            int ptThem=scanner.nextInt();
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        for (int i=0;i< arr2.length;i++){
            arr2[arr2.length-1]=ptThem;
            System.out.println(arr2[i]);
        }
    }
}


