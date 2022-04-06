import java.util.Scanner;

public class GiaTriNN {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhập size của arr");
        int size= scanner.nextInt();
        int[] arr= new int[size];
        for (int i=0;i< arr.length;i++) {
            System.out.println("giá trị phần tử của arr " + i);
            arr[i] = scanner.nextInt();
        }
            int min=arr[0];
            for(int i=0;i< arr.length;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
        System.out.println("\n giá tri nn =" +min);
        }
    }