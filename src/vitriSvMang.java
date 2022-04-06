import java.util.Scanner;

public class vitriSvMang {
    public static void main(String[] args) {
        String[] Students={"hs1","hs2","hs3","hs4","hs5","hs6"};
        Scanner hS= new Scanner(System.in);
        System.out.println("nhập tên hs");
        String nhapVao= hS.nextLine();
        for(int i=0;i<Students.length;i++){
            if(Students.equals(nhapVao)){
             nhapVao=Students[i];
                System.out.println("có tên hs trong mảng " + Students[i] + "vị trí" + i);
            }

        }
    }
}
