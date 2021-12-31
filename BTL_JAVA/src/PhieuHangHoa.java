import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class PhieuHangHoa {
    Scanner input= new Scanner(System.in);
    private String idPhieu;
    private String thoiGian;
    private NhanVien nhanVien;
    private ArrayList<HangNoiDia> goods= new ArrayList<>();
    private int soLuong = 0;

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getIdPhieu() {
        return idPhieu;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public ArrayList<HangNoiDia> getGoods() {
        return goods;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void Nhap(){
        String regID="^PH\\d{5}$";
        do{
            System.out.print("- ID phiếu: "); idPhieu=input.nextLine();
            if(!idPhieu.matches(regID)){
                System.out.println("Dữ liệu không hợp lệ! Mời bạn nhập lại!");
            }
        }while (!idPhieu.matches(regID));
        nhanVien= new NhanVien();
        System.out.println("Nhập thông tin nhân viên:");
        nhanVien.Nhap();

        boolean check=true;

        do{
            try{
                System.out.print("Nhap so luong hang: "); soLuong= input.nextInt();
                check=false;
            }catch (Exception e){
                System.out.println("Dữ liệu không hợp lệ! Mời bạn nhập lại!"); input.nextLine();
            }
        }while(check || soLuong<=0);
        for(int i=0;i<soLuong ;i++){
            System.out.println("1. Hàng nội địa\n" +
                    "2. Hàng quốc tế");
            int opt=input.nextInt();
            switch (opt){
                case 1:
                    HangNoiDia tmpND= new HangNoiDia();
                    tmpND.Nhap();
                    boolean checkExistedID1=goods.stream().anyMatch(n->n.getIdHang().equals(tmpND.getIdHang()));
                    while(checkExistedID1){
                        input.nextLine();
                        System.out.print("- ID hàng đã tồn tại! Mời bạn nhập lại: ");
                        tmpND.setIdHang(input.nextLine());
                        checkExistedID1=goods.stream().anyMatch(n->n.getIdHang().equals(tmpND.getIdHang()));
                    }
                    goods.add(tmpND);
                    break;
                case 2:
                    HangNhapKhau tmpNK= new HangNhapKhau();
                    tmpNK.Nhap();
                    boolean checkExistedID2=goods.stream().anyMatch(n->n.getIdHang().equals(tmpNK.getIdHang()));
                    while(checkExistedID2){
                        input.nextLine();
                        System.out.print("- ID hàng đã tồn tại! Mời bạn nhập lại: ");
                        tmpNK.setIdHang(input.nextLine());
                        checkExistedID2=goods.stream().anyMatch(n->n.getIdHang().equals(tmpNK.getIdHang()));
                    }
                    goods.add(tmpNK);
                    break;
                default:
                    System.out.println("Nhập không hợp lệ!");
            }
        }
        Date date= new Date();
        SimpleDateFormat now= new SimpleDateFormat("dd/MM/yyyy hh:mm");
        thoiGian=now.format(date);
    }
    public void Xuat(){
        System.out.format("%45s \n","PHIẾU NHẬP HÀNG HÓA");
        System.out.format(" ID Phiếu: %-40s Thời gian: %s\n",idPhieu,thoiGian);
        nhanVien.Xuat();
        int hangND=0, hangNK=0;
        for (HangNoiDia i:goods){
            if(i instanceof HangNhapKhau){
                hangNK++;
            }
            else{
                hangND++;
            }
        }
        if(hangND!=0 && hangNK!=0){
            System.out.println("--Hàng nội địa:");
            System.out.format("%-5s %-20s %-15s %-9s %s \n","ID", "Tên hàng", "Số lượng", "Giá", "Thành tiền");
            for (HangNoiDia i:goods){
                if(!(i instanceof HangNhapKhau)){
                    i.Xuat();
                    System.out.println(i.ThanhTien());
                }
            }
            System.out.println("--Hàng nhập khẩu: ");
            System.out.format("%-5s %-20s %-15s %-9s %-15s %-14s %s \n","ID", "Tên hàng", "Số lượng", "Giá", "Xuất xứ","Phí VC", "Thành tiền");
            for (HangNoiDia i:goods){
                if(i instanceof HangNhapKhau){
                    i.Xuat();
                    System.out.println(i.ThanhTien());
                }
            }
        }else if(hangND==0){
            System.out.println("--Hàng nhập khẩu: ");
            System.out.format("%-5s %-20s %-15s %-9s %-15s %-14s %s \n","ID", "Tên hàng", "Số lượng", "Giá", "Xuất xứ","Phí VC", "Thành tiền");
            for (HangNoiDia i:goods){
                if(i instanceof HangNhapKhau){
                    i.Xuat();
                    System.out.println(i.ThanhTien());
                }
            }
        }else{
            System.out.println("--Hàng nội địa:");
            System.out.format("%-5s %-20s %-15s %-9s %s \n","ID", "Tên hàng", "Số lượng", "Giá", "Thành tiền");
            for (HangNoiDia i:goods){
                if(!(i instanceof HangNhapKhau)){
                    i.Xuat();
                    System.out.println(i.ThanhTien());
                }
            }
        }
        double tongTienHang= goods.stream().mapToDouble(HangNoiDia::ThanhTien).sum();
        System.out.println("\n Tổng tiền hàng: "+tongTienHang);
        System.out.format("%70s\n","Chữ ký người làm phiếu");
        String[] tmpName=nhanVien.getTenNhanVien()
                .replaceAll("\\s+"," ").trim().split(" ");
        System.out.format("%60s",tmpName[tmpName.length-1]);

    }
}
