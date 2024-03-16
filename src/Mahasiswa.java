import java.util.Scanner;

public class Mahasiswa {
    Scanner input = new Scanner(System.in);

    // atribute
    private String nama;
    private String nim;
    private String alamat;

    //constuctor
    Mahasiswa(){
      setNama(nama);
      setNim(nim);
      setAlamat(alamat);  
    }

    //method untuk mengambil inputan dari user
    //==================================================
    private void setNama(String nama){
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        this.nama = nama;
    }

    private void setNim(String nim) {
        System.out.print("Masukkan Nim: ");
        nim = input.nextLine();
        this.nim = nim;
    }

    private void setAlamat(String alamat) {
        System.out.print("Masukkan Alamat: ");
        alamat = input.nextLine();
        this.alamat = alamat;
    }
    //==================================================


    // method untuk menampilkan inputan data
    public void display(){
        System.out.printf("| %-21s | %-21s | %-29s |",nim,nama,alamat);
    }


}
