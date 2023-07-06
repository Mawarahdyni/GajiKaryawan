//Mawar Ahdayani Samual
//227064516023

package karyawan1;

class Karyawan {
    protected String nip;
    protected String nama;
    protected String jenisKelamin;
    protected int jumlahHari;
    protected int totalGaji;

    public Karyawan(String nip, String nama, String jenisKelamin) {
        this.nip = nip;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }

    public void absenKerja() {
        System.out.println("Karyawan " + nama + " dengan NIP " + nip + " telah absen kerja.");
    }

    public void hitungGaji() {
        totalGaji = jumlahHari * 50000;
        System.out.println("Gaji karyawan " + nama + ": Rp " + totalGaji);
    }

    public void hitungGaji(int jumlahHari) {
        this.jumlahHari = jumlahHari;
        hitungGaji();
    }
}

class Dosen extends Karyawan {
    private String golongan;
    private int jumlahSKS;
    private int upahPerSKS;

    public Dosen(String nip, String nama, String jenisKelamin, String golongan, int jumlahSKS, int upahPerSKS) {
        super(nip, nama, jenisKelamin);
        this.golongan = golongan;
        this.jumlahSKS = jumlahSKS;
        this.upahPerSKS = upahPerSKS;
    }

    
    public void hitungGaji() {
        totalGaji = upahPerSKS * jumlahSKS * jumlahHari;
        System.out.println("Gaji dosen " + nama + ": Rp " + totalGaji);
    }
}

class Staff extends Karyawan {
    private int jamKerja;
    private int upahPerJam;

    public Staff(String nip, String nama, String jenisKelamin, int jamKerja, int upahPerJam) {
        super(nip, nama, jenisKelamin);
        this.jamKerja = jamKerja;
        this.upahPerJam = upahPerJam;
    }

    
    public void hitungGaji() {
        totalGaji = jamKerja * upahPerJam * jumlahHari;
        System.out.println("Gaji staff " + nama + ": Rp " + totalGaji);
    }
}


public class Karyawan1 {

    
    public static void main(String[] args) {
        
        Karyawan karyawan = new Karyawan("123", "Firman", "Laki-laki");
        karyawan.absenKerja();
        karyawan.hitungGaji();
        karyawan.hitungGaji(20);

        
        Dosen dosen = new Dosen("456", "Dhieka", "Perempuan", "A", 4, 100000);
        dosen.absenKerja();
        dosen.hitungGaji();
        dosen.hitungGaji(15);

        
        Staff staff = new Staff("789", "Fahmi", "Laki-laki", 8, 50000);
        staff.absenKerja();
        staff.hitungGaji();
        staff.hitungGaji(25);
    }
}