package HinhHoc;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{
    public float canh;
    public HinhVuong ()
    {
        ten = "Hinh vuong";
    }
    public void nhapcanh()
    {
        System.out.print("Canh = ");
        Scanner sc = new Scanner(System.in);
        dai = rong = sc.nextFloat();

    }
}
