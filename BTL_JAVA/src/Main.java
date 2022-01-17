import java.io.*;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        Scanner input= new Scanner(System.in);
        PhieuHangHoa phieu1= new PhieuHangHoa();
        phieu1.Nhap();
        System.out.println("Đã nhập xong thông tin của phiếu!");

        int option=0;
        do{
            Thread.sleep(2000);
            System.out.println("\nMời bạn chọn 1 lựa chọn: \n" +
                    "1. Hiện thông tin lên màn hình\n" +
                    "2. Thêm mặt hàng vào danh sách\n" +
                    "3. Xóa mặt hàng khỏi danh sách\n" +
                    "4. Sắp xếp lại thứ tự mặt hàng\n" +
                    "5. Xem thông tin liên hệ\n" +
                    "6. In phiếu\n" +
                    "7. Thoát");
            option=input.nextInt();
            switch (option){
                case 1:
                    phieu1.Xuat();
                    break;
                case 2:
                    ThemHang(phieu1);
                    System.out.println("Thêm thành công!");
                    break;
                case 3:
                    XoaHang(phieu1);
                    break;
                case 4:
                    Collections.sort(phieu1.getGoods());
                    System.out.println("Sắp xếp thành công");
                    break;
                case 5:
                    System.out.println("SĐT: "+phieu1.getNhanVien().getSdt());
                    System.out.println("Email: "+phieu1.getNhanVien().getEmail());
                    break;
                case 6:
                    OutputIntoFile(phieu1);
                    System.out.println("Đã xuất hóa đơn!");
                    break;
                case 7:
                    System.out.println("Cảm ơn quý khách đã sử dụng dịch vụ !!");
                    break;
            }
        }while(option!=7);

    }

    static void OutputIntoFile(PhieuHangHoa phieu) throws FileNotFoundException {
        File fl= new File("PHIEU.txt");
        PrintStream toFile= new PrintStream(fl);
        PrintStream console= System.out;
        System.setOut(toFile);

        phieu.Xuat();

        toFile.close();
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
    }
    static void ThemHang(PhieuHangHoa phieu){
        System.out.print("Số mặt hàng muốn thêm: ");
        Scanner input = new Scanner(System.in);
        int soLuong= input.nextInt();
        phieu.setSoLuong(soLuong+phieu.getSoLuong());
        for (int i=0;i<soLuong;i++){
            System.out.println("1. Hàng nội địa\n" +
                    "2. Hàng quốc tế");
            int opt=input.nextInt();
            switch (opt){
                case 1:
                    HangNoiDia tmpND= new HangNoiDia();
                    tmpND.Nhap();
                    boolean checkExistedID1=phieu.getGoods().stream().anyMatch(n->n.getIdHang().equals(tmpND.getIdHang()));
                    while(checkExistedID1){
                        input.nextLine();
                        System.out.print("- ID hàng đã tồn tại! Mời bạn nhập lại: ");
                        tmpND.setIdHang(input.nextLine());
                        checkExistedID1=phieu.getGoods().stream().anyMatch(n->n.getIdHang().equals(tmpND.getIdHang()));
                    }
                    phieu.getGoods().add(tmpND);
                    break;
                case 2:
                    HangNhapKhau tmpNK= new HangNhapKhau();
                    tmpNK.Nhap();
                    boolean checkExistedID2=phieu.getGoods().stream().anyMatch(n->n.getIdHang().equals(tmpNK.getIdHang()));
                    while(checkExistedID2){
                        input.nextLine();
                        System.out.print("- ID hàng đã tồn tại! Mời bạn nhập lại: ");
                        tmpNK.setIdHang(input.nextLine());
                        checkExistedID2=phieu.getGoods().stream().anyMatch(n->n.getIdHang().equals(tmpNK.getIdHang()));
                    }
                    phieu.getGoods().add(tmpNK);
                    break;
                default:
                    System.out.println("Nhập không hợp lệ!");
            }

        }
    }
    static void XoaHang(PhieuHangHoa phieu){
        Scanner input= new Scanner(System.in);
        System.out.print("Nhập ID mặt hàng muốn xóa: ");
        String delID= input.nextLine();
        boolean checkExistedID=phieu.getGoods().stream().anyMatch(n->n.getIdHang().equals(delID));
        if(checkExistedID){
            phieu.setSoLuong(phieu.getSoLuong()-1);
            phieu.getGoods().removeIf(x->x.getIdHang().equals(delID));

            System.out.println("Xóa thành công!");
        }else{
            System.out.println("ID sai! ");
        }

    }
}
