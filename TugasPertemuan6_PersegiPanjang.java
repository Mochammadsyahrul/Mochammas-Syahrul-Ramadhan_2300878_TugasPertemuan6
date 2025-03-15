/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Tugas;

/**
 *
 * @author MS Ramadhan
 */
// Kelas PersegiPanjang
public class TugasPertemuan6_PersegiPanjang{
    // Atribut dengan enkapsulasi
    int panjang;
    int lebar;

    // Konstruktor dengan parameter
    public TugasPertemuan6_PersegiPanjang(int panjangBaru, int lebarBaru) {
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

    // Getter untuk panjang dan lebar
    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }
}
