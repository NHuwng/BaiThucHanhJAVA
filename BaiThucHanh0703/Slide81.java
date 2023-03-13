package BaiThucHanh0703;

import java.util.Scanner;

public class Slide81 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int sodong, socot, max = 0;

        do {
            System.out.println("Nhap vao so dong cua mang: ");
            sodong = scan.nextInt();
        } while (sodong <= 0);

        do {
            System.out.println("Nhap vao so cot cua mang: ");
            socot = scan.nextInt();
        } while (socot <= 0);

        int arrA[][] = new int[sodong][socot];
        for (int i = 0; i < sodong; i++) {
            for (int j = 0; j < socot; j++) {
                System.out.printf("Nhap vao gia tri phan tu cua mang A[%d][%d]: ", i, j);
                arrA[i][j] = scan.nextInt();
            }
        }

        max = arrA[0][0];
        for (int i = 0; i < sodong; i++) {
            for (int j = 0; j < socot; j++) {
                if (max < arrA[i][j]) {
                    max = arrA[i][j];
                }
            }
        }
        System.out.println("Phan tu co gia tri lon nhat trong mang la: " + max);
    }
}