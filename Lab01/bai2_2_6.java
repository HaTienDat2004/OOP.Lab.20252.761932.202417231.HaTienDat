import java.util.Scanner;

public class bai2_2_6 {
    public static void main (String[] args){

    Scanner sc = new Scanner(System.in);
    
    System.out.println("=================Menu===============");
    System.out.println("1. Phuong trinh bac nhat.");
    System.out.println("2. He phuong trinh bac nhat 2 an.");
    System.out.println("3. Phuong trinh bac 2");
    System.out.println("Hay nhap lua chon cua ban bang cac so 1 2 3 theo menu!");
    int luachon = sc.nextInt();
    if(luachon == 1){
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
        System.exit(0);
    }
    sc.close();
    }
}