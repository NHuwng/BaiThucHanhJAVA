import java.util.Scanner;

public class HinhTron {
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;
    void nhapbankinh()
    {
        System.out.print("Nhap ban kinh cua hinh tron: ");
        Scanner scanner=new Scanner(System.in);
        r = scanner.nextFloat();
    
    }
    void tinhchuvi()
    {
        cv = 2*PI*r;
    }
    void tinhdientich()
    {
        dt = PI*r*r;
    }  
    void inThongTin()
    {
        System.out.printf("Chu vi hinh tron la: %f",cv);
        System.out.printf("\nDien tich hinh tron la: %f",dt);
    }

    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.nhapbankinh();
        ht.tinhchuvi();
        ht.tinhdientich();
        ht.inThongTin();
    }
}


