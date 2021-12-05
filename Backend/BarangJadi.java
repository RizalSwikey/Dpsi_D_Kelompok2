public class BarangJadi {
    
    private String idBarang;
    private String namaBarang;
    private String satuan;
    private int stok;

    public BarangJadi(String idBarang, String namaBarang, String satuan, int stok){
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.satuan = satuan;
        this.stok = stok;
    }

    public void setIdBarang(String idBarang){
        this.idBarang = idBarang;
    }

    public void setNamaBarang(String namaBarang){
        this.namaBarang = namaBarang;
    }

    public void satuan(String satuan){
        this.satuan = satuan;
    }

    public void setStok(int stok){
        this.stok = stok;
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