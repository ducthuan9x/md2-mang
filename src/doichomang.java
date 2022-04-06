import java.util.Scanner;

public class doichomang {
    public static void main(String[] args) {
        int[] mang;
        int size;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập size của mảng");
        size=scanner.nextInt();
        mang=new int[size];
        for(int i=0;i< mang.length;i++) {
            System.out.println("nhập giá trị cho mảng");
            mang[i] = scanner.nextInt();
        }
            for(int j=0;j< mang.length/2;j++){
                int a=mang[j];
                mang[j]=mang[mang.length-j-1];
                mang[mang.length-j-1]=a;
            }
            for(int i=0;i< mang.length;i++) {
                System.out.print(mang[i]);
            }
        }
    }
