package pkg1_percabangan;

//libratri untuk menginpor scanner untuk melakukan sebuahinput an
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //deklarasi dengan integer
        int bil1, bil2, bil3;
        
        //input bilangan ke 1
        System.out.println("masukan integer ke 1");
        bil1 = scanner.nextInt();
        
        //input bilangan ke 2
        System.out.println("masukan integer ke 2");
        bil2 = scanner.nextInt();
        
        //input bilangan ke 3
        System.out.println("masukan integer ke 3");
        bil3 = scanner.nextInt();
        
        //kondisi if else untuk bilangan ke 1
        if(bil1 < 1000 ){
            System.out.println("bilangan ke 1 bukan ribuan");
        }else{
            System.out.println("bilagnan ke 1 integer merupakan ribuan");
        }
        
        //kondisi if else untuk bilangan ke 1
        if(bil2 < 1000){
            System.out.println("bilangan ke 2 bukan ribuan");
        }else{
            System.out.println("bilangan ke 2 integer merupakan ribuan");
        }
        
        //kondisi if else untuk bilangan ke 1
        if(bil3 < 1000){
            System.out.println("bilangan ke 3 bukan ribuan");
        }else{
            System.out.println("bilangan ke 3 integer merupakan ribuan");
        }
        
        
    }
    
}
