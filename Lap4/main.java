
package Lap4;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        GD gd = new GD();
        Scanner sc = new Scanner(System.in);
        ArrayList<GD> danhSachGiaoDich = new ArrayList<>();
        int chon;
        
        do{
            System.out.print("1.Them giao dich dat");
            System.out.print("2.Them giao dich nha");
            System.out.print("3. Hien thi giao dich");
            System.out.print("Thoat");
            chon = sc.nextInt();
            
            switch(chon){
                    case 1:
                        GDDat gdd = new GDDat();
                        quanlyGD.listGDDat.add(gdd);
                        break;
                    case 2:
                        GDNha gdn = new GDNha();
                        quanlyGD.listGDNha.add(gdn);
                        break;
                    case 3:
                        break;
                    case 4:
                        System.out.println("Thoat");
                        break;
                    default:
                        System.out.print("Error !!");
            }
        }while (chon != 4);
    }
}