/*Exercici 4*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Bon dia! Introdueix el nombre de nois a la classe.");
        boolean valid = true;
        double nNois;
        double nNoies;
        do {
            nNois = scan.nextInt();
            if (!scan.hasNextInt() || nNois < 0) {
                System.out.println("Introdueix un nombre enter positiu.");
                valid = false;
            }
            else{
                valid=true;
            }
        } while (!valid);
        System.out.println("Introdueix el nombre de noies a la classe.");
        do {
            nNoies = scan.nextInt();
            if (!scan.hasNextInt() || nNoies < 0) {
                System.out.println("Introdueix un nombre enter positiu.");
                valid = false;
            }
            else{
                valid=true;
            }
        } while (!valid);
        double nTotal =  nNois+nNoies;
        double percentNois = nNois/nTotal;
        double percentNoies = nNoies/nTotal;
        System.out.println("El percentatge de nois a la classe és de: " + percentNois + "%");
        System.out.println("El percentatge de noies a la classe és de: " + percentNoies + "%");



    }
}
