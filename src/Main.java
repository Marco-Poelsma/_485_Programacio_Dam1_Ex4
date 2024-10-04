/*Exercici 4*/
import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Bon dia! Introdueix el nombre de nois a la classe.");
        int nNois = 0;
        int nNoies = 0;
        boolean valid = true;
        do{
            if (!valid){
                System.out.println("Si us plau, introdueix un nombre enter positiu.");
            }
            while(!scan.hasNextInt()){
                scan.nextLine();
                System.out.println("Si us plau, introdueix un nombre enter positiu.");
            }
            nNois = scan.nextInt();
            valid = nNois >= 0;
        }while (!valid);
        System.out.println("Introdueix el nombre de noies a la classe.");
        do{
            if (!valid){
                System.out.println("Si us plau, introdueix un nombre enter positiu.");
            }
            while(!scan.hasNextInt()){
                System.out.println("Si us plau, introdueix un nombre enter positiu.");
                String clearCache = scan.nextLine();
                scan.nextLine();

            }
            nNoies = scan.nextInt();
            valid = nNoies >= 0;
        }while (!valid);
        double nTotal =  nNois+nNoies;
        double percentNois = (nNois/nTotal)*100;
        double percentNoies = (nNoies/nTotal)*100;
        System.out.println("El percentatge de nois a la classe és de: " + percentNois + "%");
        System.out.println("El percentatge de noies a la classe és de: " + percentNoies + "%");



    }
}
