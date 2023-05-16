
package Lap4;

import java.time.LocalDate;

public class GDNha extends GD{
    public String loaiNha;
    public String diaChi;

    public GDNha() {
    }

    public GDNha(String loaiNha, String diaChi, int MaGD, LocalDate NgayGD, double DonGia, String loaiDat, double dienTich) {
        super(MaGD, NgayGD, DonGia, loaiDat, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public double tinhThanhTien() {
        if (loaiNha.equalsIgnoreCase("cao cấp")) {
            return dienTich * DonGia;
        } else {
            return dienTich * DonGia * 0.9;
        }
    }    
}

