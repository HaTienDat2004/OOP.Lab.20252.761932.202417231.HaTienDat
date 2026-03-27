import java.util.Scanner;

public class bai6_5 {

    public static void main (String[] args){

    Scanner sc = new Scanner(System.in);
    double[] arr;
    System.out.println("xin moi nhap vao so phan tu cua mang: ");
    int n = sc.nextInt();
    arr = new double[n];
    double sum = 0;
    for(int i = 0; i < n; i++){
        System.out.printf("xin moi nhap vao phan tu thu %d: ", i+1);
        arr[i] = sc.nextDouble();
        sum += arr[i];
    }
    System.out.printf("Tong cua cac phan tu trong day la %.2f\n", sum);
    System.out.printf("Trung binh cua cac phan tu trong day la %.2f", sum/n);
    sc.close();

}
}