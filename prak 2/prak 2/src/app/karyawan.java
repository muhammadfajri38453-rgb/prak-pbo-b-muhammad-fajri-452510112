package app;

public class karyawan {
    protected String kodekaryawan;
    protected String nama;

    public karyawan(String varl, String var2) {
        this.kodekaryawan = varl;
        this.nama = var2;
    }
    
    public void absenpagi() {
        System.out.println(this.nama + ": absen pagi");
    }
    
    public void kerja() {
        System.out.println(this.nama + ": sedang bekerja");
    }

    public void absenpulang() {
        System.out.println(this.nama + ": absen pulang");
    }

    public void getInfo() {
        System.out.println("kode karyawan " + this.kodekaryawan);
        System.out.println("nama " + this.nama);

    }
}
