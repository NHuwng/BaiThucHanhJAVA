package BaiThucHanh0703;

import java.util.Scanner;

public class Slide75 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int sodong, socot, sum = 0;

        do {
            System.out.println("Nhap vao so dong cua mang: ");
            sodong = sc.nextInt();
        } while (sodong <= 0);

        do {
            System.out.println("Nhap vao so cot cua mang: ");
            socot = sc.nextInt();
        } while (socot <= 0);

        int arrA[][] = new int[sodong][socot];

        for (int i = 0; i < sodong; i++) {
            for (int j = 0; j < socot; j++) {
                System.out.printf("Nhap vao gia tri phan tu cua mang A[%d][%d]: ", i, j);
                arrA[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < sodong; i++) {
            for (int j = 0; j < socot; j++) {
                if (arrA[i][j] % 2 == 0) {
                    sum += arrA[i][j];
                }
            }
        }
        System.out.println("Tong so chan cua mang la: " + sum);
    }
}