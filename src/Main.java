import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] a) {
        Scanner input = new Scanner(System.in);
        // arraylist object mahasiswa
        ArrayList<Mahasiswa> daftarMahasiwa = new ArrayList<>();

        boolean next = true;

        System.out.println("\tMASUKKAN DATA MAHASISWA");
        System.out.println("---------------------------------------");
        // kode perulangan untuk membuat object dan dimasukkan ke arraylist
        while (next) {
            daftarMahasiwa.add(new Mahasiswa());

            System.out.print("tambah lagi? (y/t) ");
            String tambah = input.nextLine();
            System.out.print("\n");

            if (tambah.equalsIgnoreCase("t")) {
                next = false;
                input.close();
            }
        }

        // kode untuk menampilkan data dari object 
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("|\t NIM \t\t|\t NAMA \t\t|\t ALAMAT \t\t|");
        System.out.println("---------------------------------------------------------------------------------");
        for(Mahasiswa mahasiswa : daftarMahasiwa ){
            mahasiswa.display();
        }
    }
}