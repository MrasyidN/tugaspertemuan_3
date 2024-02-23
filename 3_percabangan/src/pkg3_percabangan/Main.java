package pkg3_percabangan;

//libratri untuk menginpor scanner untuk melakukan sebuahinput an
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //deklarasi
        int jamMasuk, jamKeluar, lamaParkir, tarif ;
        
        //input jam masuk
        System.out.println("jam masuk");
        jamMasuk = scanner.nextInt();
        
        //input jam keluar
        System.out.println("jam keluar");
        jamKeluar = scanner.nextInt();
        
        //buat mengetahui lama parkir
        lamaParkir = jamKeluar - jamMasuk;
        
        //kondisi if else
        if(lamaParkir == 1){
           System.out.println(1500);
        }else if(lamaParkir > 1){
            tarif = 1500 + (lamaParkir - 1 ) * 1000;
            System.out.println("total biaya parkir " + tarif);
        }
        
    }
      
}
