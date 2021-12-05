public class Karyawan{

    /*
    Role 1 => Admin (Bisa memberi role, dan mencabut role.)
    Role 2 => Manager (Mengecek Data Barang, mengkonfirmasi transaksi, membuat laporan.)
    Role 3 => Gudang (Dapat menerima transaksi, dan mengajukan transaksi.)
    Role 4 => Developer !Temporary! (Menerima segala privilege yang dimiliki role)

    Status 0 => Aktif, bisa melakukan apapun di dalam role mereka.
    Status 1 => Tidak Aktif, tidak bisa melakukan apapun.
    */

    final int ROLE_ADMIN = 1;
    final int ROLE_MANAGER = 2;
    final int ROLE_GUDANG = 3;
    final int ROLE_DEVELOPER = 4;

    final int STATUS_AKTIF = 0;
    final int STATUS_INAKTIF = 1;

    private int role;
    private String nama;
    private String username;
    private int status;

    public Karyawan(int Role, String nama){
        this.role = ROLE_DEVELOPER;
        this.nama = nama;
        this.username = "Alif414";
        this.status = STATUS_AKTIF;
    }

    public Karyawan(String nama){
        this.nama = nama;
        this.username = "Clint02";
        this.status = STATUS_AKTIF;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public void setNama(String username){
        this.username = username;
    }

    public void setRole(int role){
        this.role = role;
    }

    public void setRole(int role, Karyawan karyawan){
        boolean terisi = false;
        
        if(role == ROLE_ADMIN || role == ROLE_DEVELOPER){
            while(!terisi){
                if(role != ROLE_ADMIN || role != ROLE_GUDANG || role != ROLE_MANAGER){
                    System.out.println("Pilih role lagi!");
                } else{
                    karyawan.role = role;
                    terisi = true;
                }
                
            }
        } else {
            System.out.println("Anda tidak memiliki hak untuk melakukan perubahan role.");
            return;
        }
    }

    public int getRole(){
        return role;
    }

    public int getStatus(){
        return status;
    }

    public String getNama(){
        return nama;
    }

    public String getUsername(){
        return username;
    }
}