package Tugas_Tugas;

// Kelas PersegiPanjang
class PersegiPanjang {
    private int panjang;
    private int lebar;

    // Konstruktor default
    public PersegiPanjang() {
        this.panjang = 0;
        this.lebar = 0;
    }

    // Konstruktor dengan parameter
    public PersegiPanjang(int panjangBaru, int lebarBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
    }

    // Metode untuk menghitung luas
    public int getLuas() {
        return panjang * lebar;
    }

    // Metode untuk menghitung keliling
    public int getKeliling() {
        return 2 * (panjang + lebar);
    }

    // Setter untuk panjang
    public void setPanjang(int panjangBaru) {
        this.panjang = panjangBaru;
    }

    // Setter untuk lebar
    public void setLebar(int lebarBaru) {
        this.lebar = lebarBaru;
    }

    // Getter untuk panjang
    public int getPanjang() {
        return panjang;
    }

    // Getter untuk lebar
    public int getLebar() {
        return lebar;
    }
}

// Kelas Main untuk menguji program
public class TugasPertemuan6_PBO {
    public static void main(String[] args) {
        // Membuat objek PersegiPanjang dengan nilai dari gambar
        PersegiPanjang persegiPanjang1 = new PersegiPanjang(1, 1);
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(30, 40);
        PersegiPanjang persegiPanjang3 = new PersegiPanjang(25, 35);

        // Menampilkan hasil perhitungan
        System.out.println("PersegiPanjang 1: Panjang = " + persegiPanjang1.getPanjang() +
                ", Lebar = " + persegiPanjang1.getLebar() +
                ", Luas = " + persegiPanjang1.getLuas() +
                ", Keliling = " + persegiPanjang1.getKeliling());

        System.out.println("PersegiPanjang 2: Panjang = " + persegiPanjang2.getPanjang() +
                ", Lebar = " + persegiPanjang2.getLebar() +
                ", Luas = " + persegiPanjang2.getLuas() +
                ", Keliling = " + persegiPanjang2.getKeliling());

        System.out.println("PersegiPanjang 3: Panjang = " + persegiPanjang3.getPanjang() +
                ", Lebar = " + persegiPanjang3.getLebar() +
                ", Luas = " + persegiPanjang3.getLuas() +
                ", Keliling = " + persegiPanjang3.getKeliling());
    }
}
