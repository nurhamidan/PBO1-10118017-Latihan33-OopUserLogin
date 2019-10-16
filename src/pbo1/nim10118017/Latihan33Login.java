package pbo1.nim10118017;

import java.util.Scanner;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : User memasukkan username dan password untuk login, kemudian sistem menampilkan hasilnya.
 * 
 */
public class Latihan33Login {
    //Attribut class
    private static String usName;
    private static String passWord;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instansiasi objek
        Scanner scanner = new Scanner(System.in);
        User u = new User();
        
        //Inputan user
        System.out.print("Masukkan Username = ");
        usName = scanner.next();
        System.out.print("Masukkan Password = ");
        passWord = scanner.next();
        
        //Proses login
        u.pengecekkanLogin(usName, passWord);
        System.out.println("\nDeveloped by : Agung Nurhamidan");
    }
    
}
