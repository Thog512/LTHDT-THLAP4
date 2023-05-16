
package Lap4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class quanlyGD {
    public static ArrayList<GDDat> listGDDat = new ArrayList<>();
    public static ArrayList<GDNha> listGDNha = new ArrayList<>();
    
    Scanner sc = new Scanner(System.in);
    
    public void addGDD(){
        System.out.print("Nhập mã giao dịch: ");
        int MaGD = sc.nextInt();
        System.out.print("Nhập ngày giao dịch (dd/mm/yyyy): ");
        String NgayGD = sc.next();
        LocalDate date = LocalDate.parse(NgayGD);
        System.out.println("Date entered: " + NgayGD);        
        System.out.print("Nhập đơn giá: ");
        double DonGia = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhập loại đất (A/B/C): ");
        String loaiDat = sc.nextLine();
        System.out.print("Nhập diện tích: ");
        double dienTich = sc.nextDouble();
        sc.nextLine();
        GDDat gdd = new GDDat(MaGD, NgayGD, DonGia, loaiDat, dienTich);
        gdd.tinhThanhTien();
        listGDDat.add(gdd);
        System.out.println("Thêm giao dịch đất thành công!");
        return ;
    }
    
    public void addGDN(){
        System.out.print("Nhập mã giao dịch: ");
        int MaGD = sc.nextInt();
        System.out.print("Nhập ngày giao dịch (dd/mm/yyyy): ");
        String NgayGD = sc.next();
        LocalDate date = LocalDate.parse(NgayGD);
        System.out.println("Date entered: " + NgayGD);        
        System.out.print("Nhập đơn giá: ");
        double DonGia = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhập loại đất (A/B/C): ");
        String loaiDat = sc.nextLine();
        System.out.print("Nhập diện tích: ");
        double dienTich = sc.nextDouble();
        sc.nextLine();
        GGNha gdn = new GDDat(MaGD, NgayGD, DonGia, loaiDat, dienTich);
        gdn.tinhThanhTien();
        listGDNha.add(gdn);
        System.out.println("Thêm giao dịch đất thành công!");
        return ;
    }
    
    public 
    
}
