package BaiThucHanh0703;

import java.util.Scanner;

public class Slide74 {
    public static void main(String[] args) throws Exception {
        Scanner scaner = new Scanner(System.in);
        int n, sum = 0;

        System.out.println("Nhap vao so phan tu cua mang:");
        n = scaner.nextInt();
        int arrA[] = new int[n];

        for (int i = 0; i < arrA.length; i++) {
            System.out.printf("Nhap vao gia tri phan tu thu %d cua mang ", i);
            arrA[i] = scaner.nextInt();
        }

        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i] % 2 == 0) {
                sum += arrA[i];
            }
        }
        System.out.println("Tong so chan cua mang la: " + sum);

    }
}