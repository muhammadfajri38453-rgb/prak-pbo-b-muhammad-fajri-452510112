package app;

public class main {
    public static void main(String[] args) {
        karyawan Rido = new karyawan("123", "rido");
        Rido.getInfo();
        Rido.absenpagi();
        Rido.kerja();
        Rido.absenpulang();

        System.out.println();

        karyawan melani = new karyawan("124", "melani");
        melani.getInfo();
        melani.absenpagi();
        melani.kerja();
        melani.absenpulang();

        System.out.println();

        karyawan andiani = new karyawan("125", "andiani");
        andiani.getInfo();
        andiani.absenpagi();
        andiani.kerja();
        andiani.absenpulang();

        System.out.println();

        karyawan ion = new karyawan("126", "ion");
        ion.getInfo();
        ion.absenpagi();
        ion.kerja();
        ion.absenpulang();

        System.out.println();

    }
    
}
