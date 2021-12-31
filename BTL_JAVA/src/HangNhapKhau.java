import java.util.Scanner;

public class HangNhapKhau extends HangNoiDia {
    private String xuatXu;
    private double phiVanChuyen;
    Scanner input = new Scanner(System.in);

    public HangNhapKhau(){}
    public HangNhapKhau(String idHang, String tenHang, long soLuong, double gia, String xuatXu, float phiVanChuyen) {
        super(idHang, tenHang, soLuong, gia);
        this.xuatXu = xuatXu;
        this.phiVanChuyen = phiVanChuyen;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public double getPhiVanChuyen() {
        return phiVanChuyen;
    }

    public void setPhiVanChuyen(double phiVanChuyen) {
        this.phiVanChuyen = phiVanChuyen;
    }

    public void Nhap(){
        super.Nhap();
        System.out.print("- Xuất xứ: "); xuatXu = input.nextLine();
        boolean check=true;
        do{
            try{
                System.out.print("- Phí vận chuyển: "); phiVanChuyen= input.nextDouble();
                check=false;
            }catch (Exception e){
                System.out.println("Dữ liệu không hợp lệ! Mời bạn nhập lại!");input.nextLine();
            }
        }while(check);
    }
    public void Xuat(){
        super.Xuat();
        System.out.format("%-15s %-15f",xuatXu,phiVanChuyen);
    }
    public double ThanhTien(){
        return soLuong*gia+phiVanChuyen;
    }

    @Override
    public String toString() {
        return "HangNhapKhau{" +
                "xuatXu='" + xuatXu + '\'' +
                ", phiVanChuyen=" + phiVanChuyen +
                ", idHang='" + idHang + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", soLuong=" + soLuong +
                ", gia=" + gia +
                '}';
    }
}
