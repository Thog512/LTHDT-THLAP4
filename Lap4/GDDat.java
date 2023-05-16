
package Lap4;

import java.time.LocalDate;

public class GDDat extends GD{
    public String loaiDat;

    public GDDat() {
    }
    
    public GDDat(int MaGD, LocalDate NgayGD, double DonGia, String loaiDat, double dienTich) {
        super(MaGD, NgayGD, DonGia, loaiDat, dienTich);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
    
    public double tinhThanhTien() {
        if (loaiDat.equalsIgnoreCase("A")) {
            return dienTich * DonGia * 1.5;
        } else {
            return dienTich * DonGia;
        }
    }
}
