package HinhHoc;

public class App {
    public static void main(String[] args) {
        HinhTron Ht = new HinhTron();
        Ht.Xuatten();
        Ht.nhapbankinh();
        Ht.Tinhcv();
        Ht.Tinhdt();
        Ht.inCvi();
        Ht.inDtich();

        HinhChuNhat hcn = new HinhChuNhat();
        hcn.Xuatten();
        hcn.Nhapcd();
        hcn.Nhapcr();
        hcn.Tinhcv();
        hcn.Tinhdt();
        hcn.inCvi();
        hcn.inDtich();

        HinhTru htru = new HinhTru();
        htru.Xuatten();
        htru.nhapchieucao();
        htru.Tinhtt();
        htru.inTtich();

        HinhVuong hv = new HinhVuong();
        hv.Xuatten();
        hv.nhapcanh();
        hv.Tinhcv();
        hv.Tinhdt();
        hv.inCvi();
        hv.inDtich();
    }
    
}
