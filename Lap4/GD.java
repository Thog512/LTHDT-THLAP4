
package Lap4;

import java.time.LocalDate;

public class GD {
    public int MaGD;
    public LocalDate NgayGD;
    public double DonGia;
    public double dienTich;

    public GD() {
    }

    public GD(int MaGD, LocalDate NgayGD, double DonGia, String loaiDat, double dienTich) {
        this.MaGD = MaGD;
        this.NgayGD = NgayGD;
        this.DonGia = DonGia;
        this.dienTich = dienTich;
    }

    public int getMaGD() {
        return MaGD;
    }

    public void setMaGD(int MaGD) {
        this.MaGD = MaGD;
    }

    public LocalDate getNgayGD() {
        return NgayGD;
    }

    public void setNgayGD(LocalDate NgayGD) {
        this.NgayGD = NgayGD;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    
    
}
