import java.util.Scanner;
import java.lang.Math;
public class bai2_2_6 {
    public static void main (String[] args){

    Scanner sc = new Scanner(System.in);
    while(true){
    System.out.println("=================Menu===============");
    System.out.println("0. Thoat chuong trinh");
    System.out.println("1. Phuong trinh bac nhat.");
    System.out.println("2. He phuong trinh bac nhat 2 an.");
    System.out.println("3. Phuong trinh bac 2");
    System.out.println("Hay nhap lua chon cua ban bang cac so 0 1 2 3 theo menu!");
    int luachon = sc.nextInt();
    if(luachon == 0){
        break;
    }
    else if(luachon == 1){
        System.out.println("Hay nhap vao he so a: ");
        double a = sc.nextDouble();
        System.out.println("Hay nhap vao he so b: ");
        double b = sc.nextDouble();
        if(a == 0){
            if(b == 0){
                System.out.println("Vo so nghiem!");
            } else{
                System.out.println("Vo nghiem");
            }
        } else {
            System.out.println("Phuong trinh co nghiem la: " + -b / a);
        }
    } else if(luachon == 2){
        System.out.println("Xin moi nhap he so a1: ");
        double a1= sc.nextDouble();
        System.out.println("Xin moi nhap vao he so b1: ");
        double b1 = sc.nextDouble();
        System.out.println("Xin moi nhap vao he so c1: ");
        double c1 = sc.nextDouble();
        System.out.println("Xin moi nhap vao he so a2: ");
        double a2 = sc.nextDouble();
        System.out.println("Xin moi nhap vao he so b2: ");
        double b2 = sc.nextDouble();
        System.out.println("xin moi nhap vao he so c2: ");
        double c2 = sc.nextDouble();
        double D = a1*b2 - a2*b1;
        double Dx = c1*b2 - c2*b1;
        double Dy = a1*c2 - a2*c1;
        if(D!=0){
            System.out.printf("He phuong trinh co nghiem duy nhat: x = %.2f, y = %.2f\n", Dx/D, Dy/D);
        } else if (Dx == 0 && Dy == 0){
            System.out.println("He phuong trinh vo so nghiem");
        } else{
            System.out.println("He phuong trinh vo nghiem");
        }
    } else if(luachon == 3){
        System.out.println("Phuong trinh bac 2 co dang ax^2 + bx + c = 0");
        System.out.println("Xin moi nhap vao he so a: ");
        double a = sc.nextDouble();
        System.out.println("xin moi nhap vao he so b: ");
        double b = sc.nextDouble();
        System.out.println("Xin moi nhap vao he so c");
        double c = sc.nextDouble();
        if (a == 0){
            if(b == 0){
                if(c == 0){
                    System.out.println("Phuong trinh vo so nghiem!");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                System.out.println("Phuong trinh co nghiem duy nhat: x = " + -c/b);
            }
        } else {
            double delta = b*b - 4 * a * c;
            if(Math.abs(delta) <  1e-6){
                System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + (-b)/ 2 / a);
            } else if(delta < 0){
                System.out.println("Phuong trinh vo nghiem");
            } else {
                double candelta = Math.sqrt(delta);
                System.out.printf("Phuong trinh co 2 nghiem: x1 = %.2f, x2 = %.2f", ((-b)- candelta)/2 / a, ((-b) + candelta) / 2 / a);
            }
        }
    }else{
        System.out.println("Lua chon sai, moi lua chon lai!");
    }}
    sc.close();
    }
}