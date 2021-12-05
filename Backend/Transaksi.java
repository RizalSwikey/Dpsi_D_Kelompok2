import java.util.LinkedList;

public class Transaksi{

    private LinkedList<Barang> listTransaksi;
    private LinkedList<String> idTransaksi;
    private LinkedList<String> tanggalTransaksi;
    private LinkedList<String> jenisTransaksi;
    private LinkedList<Integer> jumlahTransaksi;

    public Transaksi(){
        listTransaksi = new LinkedList<Barang>();
        idTransaksi = new LinkedList<String>();
        tanggalTransaksi = new LinkedList<String>();
        jenisTransaksi = new LinkedList<String>();
        jumlahTransaksi = new LinkedList<Integer>();
    }

    public void addTransaksi(Barang barang){
        listTransaksi.add(barang);
    }

    public void addIdTransaksi(String idTransaksi){
        this.idTransaksi.add(idTransaksi);
    }

    public void addTanggalTransaksi(String tanggalTransaksi){
        this.tanggalTransaksi.add(tanggalTransaksi);
    }

    public void addJenisTransaksi(String jenisTransaksi){
        this.jenisTransaksi.add(jenisTransaksi);
    }

    public void addJumlahTransaksi(int jumlahTransaksi){
        this.jumlahTransaksi.add(jumlahTransaksi);
    }

    public void tampilkanData(){
        for(int i=0; i < this.idTransaksi.size(); i++){
            System.out.println("No. | ID Transaksi | Tanggal Transaksi | Jenis Transaksi | ID Barang | Nama Barang | Jumlah Transaksi |");
            System.out.println((i+1) + " | " + idTransaksi.get(i) + " | " + tanggalTransaksi.get(i) + " | " + jenisTransaksi.get(i) + " | " + listTransaksi.get(i).getNamaBarang() + " | " + jumlahTransaksi.get(i) + " " + listTransaksi.get(i).getSatuan() + " |");
        }
    }

    public void printdata(){
        System.out.println(idTransaksi.get(0));
    }
}