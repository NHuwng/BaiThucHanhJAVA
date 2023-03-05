package BaiThucHanh2102;

import java.util.Scanner;

public class Slide30 {
    public static void main(String[] args) {
        int n, soDu, tong = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen bat ky: ");
        n = scanner.nextInt();

        while (n > 0) {
            soDu = n % 10;
            n = n / 10;
            tong = tong + soDu;
        }

        System.out.println("Tong cac chu so = " + tong);
    }
}