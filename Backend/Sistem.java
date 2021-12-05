import java.util.Scanner;

public class Sistem {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        Karyawan khaliffman = new Karyawan(4, "Khaliffman");
        Karyawan kenneth = new Karyawan("Kenneth");
        Transaksi transaksi = new Transaksi();
        Karyawan pengguna = new Karyawan("Temporary");

        boolean hasLogin = false;
        while(true){
            
            if(hasLogin == false){
                System.out.print("Karyawan yang aktif: \n1. " + khaliffman.getNama() + "\n2. " + kenneth.getNama() + "\nSiapakah anda? ");
                int chKar = sc.nextInt();
                for(int i = 3; i > 0; i--){
                    if(chKar == 1){
                        System.out.print("Masukkan username anda: ");
                        String stKar = sc.next();
                        if(stKar.equals(khaliffman.getUsername())) {
                            System.out.println("Selamat datang " + khaliffman.getNama());
                            hasLogin = true;
                            break;
                        } else {
                            System.out.println("Username salah anda memiliki " + (i - 1) + " kesempatan");
                        }
                    } else if (chKar == 2){
                        System.out.print("Masukkan username anda: ");
                        String stKar = sc.next();
                        if(stKar.equals(kenneth.getUsername())) {
                            System.out.println("Selamat datang " + kenneth.getNama());
                            break;
                        } else {
                            System.out.println("Username salah anda memiliki " + i + " kesempatan");
                        }
                    }
                    if(i == 1){
                     System.out.println("Anda gagal menginput username dengan benar, program diberhentikan...");
                     return;   
                    }
                }
                if(chKar == 1 && hasLogin == true){
                    pengguna = khaliffman;
                } else if(chKar == 2 && hasLogin == true){
                    pengguna = kenneth;
                }
            }

            System.out.println("Apa yang ingin kamu lakukan, " + pengguna.getNama() + "? ");
            System.out.print("Opsi yang ada saat ini:\n1.Memasukan Transaksi\n2.Melihat Data Transaksi\n3.Mengganti Role\n4.Memberhentikan Program\nApa yang anda ingin lakukan? ");
            int chc = sc.nextInt();
            switch(chc) {

                case 1:{
                    if(pengguna.getRole() == pengguna.ROLE_DEVELOPER || pengguna.getRole() == pengguna.ROLE_MANAGER){
                        Barang temp = new Barang();
                        System.out.print("Masukkan ID Barang: ");
                        temp.setIdBarang(sc.next());
                        System.out.print("Masukkan Nama Barang: ");
                        temp.setNamaBarang(sc.next());
                        System.out.print("Masukkan Satuan Barang: ");
                        temp.setSatuan(sc.next());
                        System.out.print("Masukkan Stok Barang: ");
                        temp.setStok(sc.nextInt());
                        System.out.print("Masukkan Keadaan Barang: ");
                        temp.setKeadaanBarang(sc.nextInt());
                        System.out.print("Masukkan ID Transaksi Barang: ");
                        transaksi.addIdTransaksi(sc.next());
                        System.out.print("Masukkan Jumlah Transaksi Barang: ");
                        transaksi.addJumlahTransaksi(sc.nextInt());
                        System.out.print("Masukkan Tanggal Transaksi Barang: ");
                        transaksi.addTanggalTransaksi(sc.next());
                        System.out.print("Masukkan Jenis Transaksi Barang: ");
                        transaksi.addJenisTransaksi(sc.next());
                        transaksi.addTransaksi(temp);
                        System.out.println("Transaksi sudah masuk ke database!");
                    } else {
                        System.out.println("Anda tidak memiliki hak untuk melakukan operasi ini.");
                    }        
                    break;
                }
                case 2:{
                    if(pengguna.getRole() == pengguna.ROLE_DEVELOPER || pengguna.getRole() == pengguna.ROLE_MANAGER){
                        transaksi.tampilkanData();
                        transaksi.printdata();
                        System.out.println("\nData Transaksi telah ditampilkan!");
                    } else {
                        System.out.println("Anda tidak memiliki hak untuk melakukan operasi ini.");
                    }        
                    break;
                }
                case 4:{
                    System.out.println("Terima kasih telah menggunakan aplikasi Sistem FoodHub!");
                    return;
                }

                case 3:{
                    boolean terisi = false;
        
                    if(pengguna.getRole() == pengguna.ROLE_ADMIN || pengguna.getRole() == pengguna.ROLE_DEVELOPER){
                        while(terisi == false){
                                Karyawan temp = new Karyawan("Temporary");
                                System.out.print("Karyawan yang aktif: \n1. " + khaliffman.getNama() + "\n2. " + kenneth.getNama() + "\nSiapakah yang rolenya ingin anda ubah? ");
                                int chKar = sc.nextInt();
                                if(chKar == 1){
                                    temp = khaliffman;
                                } else if (chKar == 2){
                                    temp = kenneth;
                                }
                                System.out.println("1.Admin\n2.Manager\n3.Gudang\n" + "Role apa yang ingin anda berikan kepada " + temp.getNama() + "? ");
                                while(true){
                                    int role = sc.nextInt();
                                    if(role != pengguna.ROLE_ADMIN && role != pengguna.ROLE_GUDANG && role != pengguna.ROLE_MANAGER){
                                        System.out.println("Pilih role kembali!");
                                    } else{
                                        temp.setRole(role);
                                        kenneth = temp;
                                        System.out.println("Kenneth sekarang adalah " + kenneth.getRole());
                                        terisi = true;
                                        break;
                                    }
                                }
                               break;
                        }
                    } else {
                        System.out.println("Anda tidak memiliki hak untuk melakukan perubahan role.");
                        break;
                    }
                    hasLogin = false;
                    break;
                }
            }
        }
    }

}