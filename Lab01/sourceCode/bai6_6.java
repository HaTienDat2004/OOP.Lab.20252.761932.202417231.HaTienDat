import java.util.Scanner;

public class bai6_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Xin moi nhap vao kich thuoc cua cac ma tran duoi dang m hang x n cot: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mangA = new int[m][n];
        int[][] mangB = new int[m][n];
        int[][] mangC = new int[m][n];
        System.out.println("Xin moi nhap vao ma tran thu 1");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                mangA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Xin moi nhap vao ma tran thu 2");

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                mangB[i][j] = sc.nextInt();
                mangC[i][j] = mangA[i][j] + mangB[i][j];
            }
        }
        System.out.println("Ma tran ket qua tong la: ");
        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("%d ", mangC[i][j]);
                if (j == n - 1){
                    System.out.println();
                }
            }
        }

        sc.close();

    }
    
}
