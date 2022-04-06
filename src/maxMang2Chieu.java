import java.util.Scanner;

public class maxMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập số dòng");
        int dong=scanner.nextInt();
        System.out.println("nhập số cột");
        int cot =scanner.nextInt();
        int [][] arr= new int[dong][cot];
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print("arr[" + i + "]["+ j + "] = ");
                arr[i][j]=scanner.nextInt();
            }
        }
        int max=arr[0][0];
        for(int i=0;i< arr.length;i++){
            for(int j=0 ;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max =arr[i][j];
                }
            }
        }
        System.out.println("giá trị max = "+max);
    }
}