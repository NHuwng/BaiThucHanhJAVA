package HinhHoc;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{
    public float dai;
    public float rong;


    public HinhChuNhat()
    {
        ten = "Hinh chu nhat";
    }
    public void Nhapcd()
    {
        System.out.print("Chieu dai = ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();

    }
    public void Nhapcr()
    {
        System.out.print("Chieu rong = ");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
    }
    public void Tinhcv()
    {
        Cvi = 2 * (dai + rong);

    }
    public void Tinhdt()
    {
        Dtich = dai * rong;
    }
}
