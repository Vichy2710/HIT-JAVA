import java.util.Scanner;

public class NhanVien {
    private String id;
    private String tenNhanVien;
    private String sdt;
    private String email;
    Scanner input= new Scanner(System.in);

    public NhanVien(){}
    public NhanVien(String id, String tenNhanVien, String sdt, String email) {
        this.id = id;
        this.tenNhanVien = tenNhanVien;
        this.sdt = sdt;
        this.email = email;
    }

    public void Nhap(){
        String regID="^[A-Z]{3}\\d{4}$"; // VD: ADM1234
        String regSDT="^(?:\\+84|0)\\d{9,15}$"; // VD: 0987654332, +8450505023028
        String regEmail="^[a-zA-Z]+[^\\s]*@\\w+\\.\\w+$";  // e@gmail.com, i09@edu.com
        do{
            System.out.print("- ID nhân viên: "); id=input.nextLine();
            if(!id.matches(regID)){
                System.out.println("Dữ liệu không hợp lệ! Mời bạn nhập lại!");
            }
        }while (!id.matches(regID));

        System.out.print("- Tên nhân viên: "); tenNhanVien=input.nextLine();
        do{
            System.out.print("- SDT: "); sdt=input.nextLine();
            if(!sdt.matches(regSDT)){
                System.out.println("Dữ liệu không hợp lệ! Mời bạn nhập lại!");
            }
        }while (!sdt.matches(regSDT));

        do{
            System.out.print("- Email liên hệ: "); email=input.nextLine();
            if(!email.matches(regEmail)){
                System.out.println("Dữ liệu không hợp lệ! Mời bạn nhập lại!");
            }
        }while (!email.matches(regEmail));
    }

    public void Xuat(){
        System.out.format("| %-15s %-40s %-10s %-33s|\n"," ID nhân viên:",id,"SĐT:",sdt);
        System.out.format("| %-15s %-40s %-10s %-33s|\n"," Họ và tên:",tenNhanVien,"Email:",email);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
