package BaiThucHanh2102;

import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("" + b);
        } else {
            System.out.println("" + a);
        }
    }
}
