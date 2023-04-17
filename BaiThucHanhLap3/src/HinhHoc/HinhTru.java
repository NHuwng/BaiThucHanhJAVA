package HinhHoc;

import java.util.Scanner;

public class HinhTru extends HinhTron{
    public float cao;
    public HinhTru()
    {
        ten = "Hinh tru";
    }
    public void nhapchieucao ()
    {
        nhapbankinh();
        System.out.print("Chieu cao = ");
        Scanner sc = new Scanner(System.in);
        cao = sc.nextFloat();

    }
    public void Tinhtt()
    {
        Tinhdt();
        Ttich = Dtich * cao;
    }
    
}
