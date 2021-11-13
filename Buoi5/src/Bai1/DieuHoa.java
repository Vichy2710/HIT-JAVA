package Bai1;

public class DieuHoa extends SanPham{
    private double congSuat;
    private double giaBan;

//    public DieuHoa(String maSP, String tenSP, String tenHangSX, String ngayNhap, double congSuat, double giaBan){
//        super( maSP,  tenSP,  tenHangSX,  ngayNhap);
//        this.congSuat=congSuat;
//        this.giaBan=giaBan;
//    }
    public void Nhap(){
        super.Nhap();
        System.out.print("Nhap cong suat: "); congSuat=input.nextDouble();
        System.out.print("Nhap gia ban: "); giaBan=input.nextDouble();
    }
    public void Xuat(){
        super.Xuat();
        System.out.print("cong suat = '" + congSuat + '\n' +
                "gia ban = '" + giaBan + '\n' );
    }

    @Override
    public String toString() {
        return "DieuHoa{" +
                "congSuat=" + congSuat +
                ", giaBan=" + giaBan +
                ", maSP='" + maSP + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", tenHangSX='" + tenHangSX + '\'' +
                ", ngayNhap='" + ngayNhap + '\'' +
                '}';
    }

    public double getCongSuat() {
        return congSuat;
    }

    public double getGiaBan() {
        return giaBan;
    }
}
