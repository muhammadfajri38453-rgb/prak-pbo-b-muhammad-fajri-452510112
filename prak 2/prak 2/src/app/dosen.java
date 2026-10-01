package app;

public class dosen extends karyawan {
    private  String NIDN;

    public dosen(String var1, String var2, String var3) {
        super(var1, var2);
        this.NIDN = var3;
    }

    public void setNIDN(String var1) {
        this.NIDN = var1;
    }

    public void getNIDN() {
        System.out.println("NIDN: " + this.NIDN);
    }

    @Override 
    public void  absenpagi() {
        System.out.println(this.nama + ": absen pagi");
    }
    public void  mengajar() {
        System.out.println(this.nama + ": sedang mengajar");
    }

    @Override 
    public void  absenpulang() {
        System.out.println(this.nama + ": absen pulang");
    }

    @Override 
    public void getInfo() {
        System.out.println("kode karyawan: " + this.kodekaryawan);
        System.out.println("nama: " + this.nama);
        System.out.println("NIDN " + this.NIDN);

    }
}
