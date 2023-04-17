package HinhHoc;

import java.util.Scanner;

public class HinhTron extends HinhHoc{
    public float bKinh;
    public HinhTron()
    {
        ten = "Hinh Tron";
    }
    public void nhapbankinh ()
    {
        System.out.print("Ban Kinh = ");
        Scanner sc = new Scanner(System.in);
        bKinh = sc.nextFloat();


    }
    public void Tinhcv()
    {
        Cvi = 2*PI*bKinh;

    }
    public void Tinhdt()
    {
        Dtich = PI * bKinh *bKinh;
        
    }
}
