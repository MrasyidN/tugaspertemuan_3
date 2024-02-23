package pkg2_percabangan;

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
        
        //kondisi dimana melakukan perbandingan dari ketiga bilangan
        if(bil1 > bil2 && bil1 > bil3){
            System.out.println("bilagan ke 1 merupakan paling besar ");
        }else if(bil2 > bil1 && bil2 > bil3){
            System.out.println("bilagan ke 2 merupakan paling besar ");
        }else{
            System.out.println("bilagan ke 3 merupakan paling besar ");
        }
        
    }
    
}
