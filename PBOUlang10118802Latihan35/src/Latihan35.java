
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IantReza
 */
public class Latihan35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        Karyawan karyawan = new Karyawan();

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp. ");
        karyawan.gajiPokok = scanner.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        karyawan.status = scanner.next();

        karyawan.HasilHitung(karyawan.status,karyawan.gajiPokok);
        
    }
    
}
