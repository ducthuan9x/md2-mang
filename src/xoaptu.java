public class xoaptu {
    public static void main(String[] args) {
        double arr[]={5,7,8,9,10};
        double b[]=new double[4];
        for(int i=2;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        for (int i=0;i< b.length;i++){
            b[i]=arr[i];
            System.out.println(b[i]);
        }
    }
}
