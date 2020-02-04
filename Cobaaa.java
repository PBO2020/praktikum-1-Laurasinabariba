package cobaaa;

import java.util.ArrayList;
import java.util.Scanner;

public class Cobaaa {

    String NIK;
    String Nama;
    String TTL;
    String jeniskelamin;
    int golongandarah;

    ArrayList<String> loraa = new ArrayList<>();
    Scanner snb = new Scanner(System.in);
    lora lra = new lora();

    public static void main(String[] args) {
        Cobaaa belajar = new Cobaaa();
        belajar.menu();
    }

    void menu() {
        int pilih;
        System.out.println("====================");
        System.out.println(" 1. Input Data  ");
        System.out.println(" 2. Cetak Data");
        System.out.println(" 3. Keluar");
        System.out.println("=====================");
        System.out.println("pilihan :");
        pilih = snb.nextInt();
        if (pilih == 1) {
            chose();
        } else if (pilih == 2) {
            cetak();
        } else if (pilih == 3) {
            System.out.println("thank you");
        } else {
            System.out.println("pilihan anda tidak tersedia");
            menu();
        }
    }

    void chose() {
        System.out.println("NIK     :");
        NIK = snb.next();
        System.out.println("Nama    :");
        Nama = snb.next();
        System.out.println("TTL     :");
        TTL = snb.next();
        System.out.println("Jenis Kelamin :");
        jeniskelamin = snb.next();
        System.out.println("");
        System.out.println(" 1 = A ");
        System.out.println(" 2 = B ");
        System.out.println(" 3 = AB");
        System.out.println(" 4 = O ");
        System.out.println(" Golongan Darah :");
        golongandarah = snb.nextInt();
        if (golongandarah == 1) {
            System.out.println("Golongan Darah A ");
        } else if (golongandarah == 2) {
            System.out.println("Golongan Darah B ");
        } else if (golongandarah == 3) {
            System.out.println("Golongan Darah AB ");
        } else if (golongandarah == 4) {
            System.out.println("Golongan Darah O ");
        } else {
            System.out.println("pilihan anda tidak tersedia");
            menu();
        }
    }

    void cetak() {
        System.out.println("DATA ANDA");
        System.out.println("NIK     : " + lra.NIK);
        System.out.println("Nama    : " + lra.Nama);
        System.out.println("TTL     : " + lra.TTL);
        System.out.println("Jenis Kelamin : " + lra.jeniskelamin);
        System.out.println("Golongan Darah : " + lra.golongandarah);
        if (golongandarah == 1) {
            System.out.println("Golongan Darah A ");
        } else if (golongandarah == 2) {
            System.out.println("Golongan Darah B ");
        } else if (golongandarah == 3) {
            System.out.println("Golongan Darah AB ");
        } else if (golongandarah == 4) {
            System.out.println("Golongan Darah O ");
        } else {
            System.out.println("pilihan anda tidak tersedia");
            menu();
        }
    }
}
