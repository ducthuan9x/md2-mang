import java.util.Scanner;

public class TimViTri {
    public static void main(String[] args) {
        Scanner mayQuet = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử: ");
        int soLuong = mayQuet.nextInt();
        int[] arr = new int[soLuong];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + i);
            arr[i] = mayQuet.nextInt();
        }

        System.out.println("Nhập vào số cần tìm: ");
        int soCanTim = mayQuet.nextInt();
        System.out.println("Vị trí trong mảng là: " + timViTriPhanTu(arr, soCanTim));

    }

    static int timViTriPhanTu(int[] mang ,int soCanTim) {
        int viTri = -1;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == soCanTim) {
                viTri = i;
            }
        }
        return viTri;
    }
}


