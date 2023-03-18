package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a, sum = 0;
        String space = " ";

        do {
            System.out.println("Nhap vao cac so nguyen: ");
            a = scanner.nextInt();
            space += a + " + ";
            sum += a;
        } while (sum < 100);
        System.out.println(
                "Tong cac so cong lon hon 100: " + space.substring(0, space.length() - 2) + " = " + sum);

    }
}