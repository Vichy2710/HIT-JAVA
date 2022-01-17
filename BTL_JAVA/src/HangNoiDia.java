import java.util.Scanner;

public class HangNoiDia extends FormatNumber implements Comparable<HangNoiDia> {
    Scanner input= new Scanner(System.in);
    protected String idHang;
    protected String tenHang;
    protected long soLuong;
    protected double gia;
    protected FormatNumber fn= new FormatNumber();

    public HangNoiDia(){}
    public HangNoiDia(String idHang, String tenHang, long soLuong, double gia) {
        this.idHang = idHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    public String getIdHang() {
        return idHang;
    }

    public void setIdHang(String idHang) {
        this.idHang = idHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public long getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(long soLuong) {
        this.soLuong = soLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void Nhap(){
        String regID="^[A-Z][0-9]{1,5}$"; // VD: H84, U9
        do{
            System.out.print("- ID hàng: "); idHang=input.nextLine();
            if(!idHang.matches(regID)){
                System.out.println("Dữ liệu không hợp lệ! Mời bạn nhập lại!");
            }
        }while(!idHang.matches(regID));
        boolean check=true;
        System.out.print("- Tên hàng: "); tenHang=input.nextLine();
        do{
            try{
                System.out.print("- Số lượng: "); soLuong=input.nextLong();
                check=false;
            }catch (Exception e){
                System.out.println("Dữ liệu không hợp lệ! Mời bạn nhập lại!");input.nextLine();
            }
        }while(check);
        check=true;
        do{
            try{
                System.out.print("- Giá: "); gia=input.nextDouble();
                check=false;
            }catch (Exception e){
                System.out.println("Dữ liệu không hợp lệ! Mời bạn nhập lại!");input.nextLine();
            }
        }while(check);

    }
    public void Xuat(){
        System.out.format("| %-5s %-20s %-15d %-9s ",idHang, tenHang, soLuong, fn.Format(gia)); // 7,500
    }
    public double ThanhTien(){
        return soLuong*gia;
    }
    @Override
    public int compareTo(HangNoiDia a){
        return getTenHang().compareTo(a.getTenHang());
    }

    @Override
    public String toString() {
        return "HangNoiDia{" +
                "idHang='" + idHang + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", soLuong=" + soLuong +
                ", gia=" + gia +
                '}';
    }
}
