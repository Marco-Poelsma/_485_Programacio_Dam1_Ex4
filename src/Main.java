/*Exercici 4*/
import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
        //Declaració de variables
        Scanner scan = new Scanner (System.in);
        int nNois = 0;
        int nNoies = 0;
        boolean valid = true;
        //Introducció del nombre de nois
        System.out.println("Bon dia! Introdueix el nombre de nois a la classe.");
        do{
            //Missatge d'error
            if (!valid){
                System.out.println("Si us plau, introdueix un nombre enter positiu.");
            }
            //Comprovació de que s'ha introduït un nombre enter.
            while(!scan.hasNextInt()){
                scan.nextLine();
                System.out.println("Si us plau, introdueix un nombre enter positiu.");
            }
            nNois = scan.nextInt();
            valid = nNois >= 0;
        }while (!valid);
        //Introducció del nombre de noies
        System.out.println("Introdueix el nombre de noies a la classe.");
        do{
            //Missatge d'error
            if (!valid){
                System.out.println("Si us plau, introdueix un nombre enter positiu.");
            }
            //Comprovació de que s'ha introduït un nombre enter.
            while(!scan.hasNextInt()){
                System.out.println("Si us plau, introdueix un nombre enter positiu.");
                String clearCache = scan.nextLine(); //Fa falta perquè si no, duplica el System.out.println anterior la primera vegada que s'introdueix un nombre erroni.
                scan.nextLine();

            }
            nNoies = scan.nextInt();
            valid = nNoies >= 0;
        }while (!valid);
        //Càlculs necessaris
        double nTotal =  nNois+nNoies;
        double percentNois = (nNois/nTotal)*100;
        double percentNoies = (nNoies/nTotal)*100;
        //Retorn de resultats per pantalla
        System.out.println("El percentatge de nois a la classe és de: " + percentNois + "%");
        System.out.println("El percentatge de noies a la classe és de: " + percentNoies + "%");
    }
}
