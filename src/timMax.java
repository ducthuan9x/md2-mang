import java.util.Scanner;

public class timMax {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập size của arr");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        for(int i=0;i< arr.length;i++){
            System.out.println("nhập vào phần tử thứ " +i);
            arr[i]=scanner.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max= "+ max);
    }
}
