import java.util.Scanner;

public class bai2_2_5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        double a = sc.nextDouble();

        System.out.println("Nhap so thu hai: ");
        double b = sc.nextDouble();

        double tong = a + b;
        double hieu = a - b;
        double tich = a * b;

        System.out.println("Tong = " + tong);
        System.out.println("Hieu = " + hieu);
        System.out.println("Tich = " + tich);

        if (b != 0) {
            System.out.println("Thuong = " + a/b);
        } else {
            System.out.println("Khong the chia cho 0");
        }

        sc.close();
    }

}
