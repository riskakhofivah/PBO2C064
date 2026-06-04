public class mahasiswa {

    // Atribut
    String nama;
    String nim;
    String jurusan;

    // Constructor
    public mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Method tampilData()
    public void tampilData() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        // Membuat 2 objek
        mahasiswa mhs1 = new mahasiswa("Riska Khofivah S", "064", "Sistem Informasi");
        mahasiswa mhs2 = new mahasiswa("Fira Salima", "055", "Teknik Informatika");

        // Menampilkan data
        mhs1.tampilData();
        mhs2.tampilData();
    }
}
