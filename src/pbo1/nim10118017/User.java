package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class untuk simulasi login.
 * 
 */
public class User {
    //Atribut class.
    private final String username = "RizkiAdam";
    private final String password = "terbaikselalu";
    private boolean statusAkun;
    
    //Method memeriksa inputan sama tidaknya dengan konstanta sekaligus memberi nilai pada atribut statusAkun.
    private boolean cekAkun(String parUsername, String parPassword) {
        if (parUsername.equals(username) && parPassword.equals(password)) {
            statusAkun = true;
        }
        return statusAkun;
    }
    
    //Method menampilkan hasil login,
    //Terdapat kondisi untuk mencegah bypass terjadi.
    private void hasilLogin(boolean status, String parUsername) {
        if (status && statusAkun) {
            System.out.println("\n******HALLO " + parUsername.toUpperCase() + "******\nSelamat Datang di Aplikasi ini");
        } else {
            System.out.println("\nOoops, Username atau Password anda salah");
        }
    }
    
    //Method ini memanggil kedua method diatas.
    //bypass akan terjadi jika memasukkan nilai true pada parameter.
    public void pengecekkanLogin(String parUsername, String parPassword) {
        boolean status = cekAkun(parUsername, parPassword);
        hasilLogin(status, parUsername);
    }
    
}
