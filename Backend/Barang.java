public class Barang {
    
    final int BARANG_JADI = 0;
    final int BARANG_MENTAH = 1;

    private String idBarang;
    private String namaBarang;
    private String satuan;
    private int keadaanBarang;
    private int stok;

    public Barang(String idBarang, String namaBarang, String satuan, int stok, int keadaanBarang){
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.satuan = satuan;
        this.stok = stok;
        this.keadaanBarang = keadaanBarang;
    }

    public Barang(){}

    public void setIdBarang(String idBarang){
        this.idBarang = idBarang;
    }

    public void setNamaBarang(String namaBarang){
        this.namaBarang = namaBarang;
    }

    public void setKeadaanBarang(int keadaanBarang){
        this.keadaanBarang = keadaanBarang;
    }

    public void setSatuan(String satuan){
        this.satuan = satuan;
    }

    public void setStok(int stok){
        this.stok = stok;
    }

    public int getKeadaanBarang(){
        return this.keadaanBarang;
    }

    public String getIdBarang(){
        return this.idBarang;
    }
    
    public String getNamaBarang(){
        return this.namaBarang;
    }

    public String getSatuan(){
        return this.satuan;
    }

    public int getStok(){
        return this.stok;
    }
}