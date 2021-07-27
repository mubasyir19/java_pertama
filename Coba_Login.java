import java.util.Scanner;
public class Coba_Login {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        Coba_Login ujian = new Coba_Login();
        String nama = "Mahdy";
        String npm = "50420697";

        void Menu() {
            System.out.println("=========================");
            System.out.println("1. Data Mahasiswa");
            System.out.println("2. Menu Laundry");
            System.out.println("3. Persegi");
            System.out.println("4. Mata Kuliah");
            System.out.println("=========================");
            System.out.print("Masukkan pilihan : ")
            int pilih = input.nextInt();
            if (pilih == 1) {
                ujian.Mahasiswa();
            } else if (pilih == 2) {
                ujian.Cucican();
            } else if (pilih == 3) {
                ujian.Persegi();
            }
        }

        void Mahasiswa() {
            System.out.print("Masukkan Nama Mahasiswa : ")
            String name = input.nextLine();
            System.out.print("Masukkan Kelas : ");
            String kelas = input.nextLine();
            System.out.print("Masukkan NPM : ");
            int nik = input.nextInt();
            System.out.print("Masukkan Jurusan : ");
            String jurusan = input.nextLine();
            System.out.print("Masukkan Fakultas : ");
            String fakultas = input.nextLine();
            System.out.println("=======================================");
            System.out.println("Nama Mahasiswa  : "+name);
            System.out.println("Kelas Mahasiswa : "+kelas);
            System.out.println("NPM Mahasiswa   : "+nik);
            System.out.println("Jurusan         : "+jurusan);
            System.out.println("Fakultas        : "+fakultas);
            System.out.println("=======================================");
        }

        void Cucican() {
            System.out.print("Masukkan Uang yang dibayarkan : ");
            int uang = input.nextInt();
            if (uang > 0 && uang < 10000) {
                String ket = "Anda dapat mencuci 1 kg";
            } else if (uang < 20000) {
                String ket = "Anda dapat mencuci 4 kg";
            } else if (uang < 50000) {
                Stirng ket = "Anda dapat mencuci 6 kg";
            } else if (uang < 80000) {
                String ket = "Anda dapar mencuci + setrika";
            } else {
                String ket = "Anda dapat mencuci sendiri dirumah";
            }
            System.out.println("===============================");
            System.out.println("Uang yang dibayar : "+uang);
            System.out.println("Keterangan Cucian : "+ket);
            System.out.println("===============================");
        }

        void Persegi() {
            System.out.println("Masukkan batas : ");
            int batas = input.nextInt();
            for (int i=0;i<=batas;i++) {
                System.out.println("*");
            }
        }

        void Matakuliah() {
            Matakuliah = ["Konsep Teknologi Informasi"; "Alogritma & Pemrograman "; "Matematika Informatika "; "Bahasa Inggris"];
            System.out.println("Mata Kuliah 1 : "+Matakuliah[0]);
            System.out.println("Mata Kuliah 2 : "+Matakuliah[1]);
            System.out.println("Mata Kuliah 3 : "+Matakuliah[2]);
            System.out.println("Mata Kuliah 4 : "+Matakuliah[3]);
            System.out.println(" ");
        }

        void balik() {
            System.out.print("Apakah Anda ingin kembali? : ");
            String balik = input.nextLine();
            if (balik == "ya") {
                ujian.menu();
            } else if (balik == "tidak") {
                System.exit();
            } else {
                System.out.println("Masukkan jawaban dengan benar");
            }
        }

        System.out.print("Username : ");
        String user = input.nextLine();
        System.out.print("Password : ");
        String password = input.nextLine();
        if (user.equals(nama) && pass.equals(npm)) {
            System.out.println("Login Anda Berhasil");
            System.out.println(" ");
            ujian.menu();
        } else {
            System.out.println("Login Anda gagal");
            ujian.Login();
    }
}