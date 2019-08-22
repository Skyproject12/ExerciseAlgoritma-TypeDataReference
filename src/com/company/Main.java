package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        gabungan  k;


        Scanner scan = new Scanner (System.in);
        k=new gabungan ();
        System.out.println("1.pemilik garasi");
        k.nama=scan.next ();
        System.out.println("2.nim");
        k.nim=scan.nextInt();
        System.out.println("3.kelas ");
        k.kelas= scan.next () ;
        System.out.println("4.masukkan lebar garasi");
            k.pilih=scan.nextInt() ;
        gabungan v[] = new gabungan [k.pilih];
            for(int o=0; o<k.pilih;o++) {
                v[o] = new gabungan ();
                            System.out.println("    =======================    ");

        System.out.println("1.masukkan data kendaraan ke " +(o+1));
        System.out.println("2.jumlah roda ");
        v[o].roda= scan.nextInt();
        System.out.println("3.warna");
        v[o].warna= scan.next ();
        System.out.println("4.merk ");
        v[o].merk= scan.next ();

}
        System.out.println("========== isi garasi ==================");
        System.out.println("pemilik\t:"+k.nama);
        System.out.println("nim\t:"+k.nim);
        System.out.println("kelas\t:" + k.kelas);
        System.out.println(" ===========================");
        for(int o=0; o<k.pilih;o++){
            System.out.println("jumlah roda\t:" + v[o].roda);
            System.out.println("warna\t:" + v[o].warna);
            System.out.println("merk\t:" + v[o].merk);


}


    }
}