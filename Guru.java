
    //Object Class
public class Guru {
    //variabel
    String nama;
    String mapel;
    String status;
    int NIP;

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMapel() {
        return this.mapel;
    }

    public void setMapel(String mapel) {
        this.mapel = mapel;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNIP() {
        return this.NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }
    
    //Construstor Parameter
    public Guru(String n, String m, String s, int p) {
        nama = n;
        mapel = m;
        status = s;
        NIP = p;
    }

    //Getter
    //Setter
    //Method
    public void print() {
        System.out.println("Nama : " + nama);
        System.out.println("Mapel: " + mapel);
        System.out.println("Status: " + status);
        System.out.println("NIP: " + NIP);

    }

}


