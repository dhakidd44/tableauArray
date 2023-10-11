/*
  Titre      : tableauArray
  Auteur     : Ernest Samuel Andre
  Date       : 11/10/2023
  Description: Ce prgramme Java un est menu qui va utiliser un menu qui va demander
               a un utiliateur a choisir entre deux classes soit un qui utilise un tableau ou 
               liste dans lesquelles on va mettre 15 nombres aleatoires, le programme va nous afficher
               le plus grand notre stocke, le plus petit et aussi leur index d'enregiatrement,
  Version    : 0.0.1
*/

package valeur;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Affichage du Menu a l'utulisateur
            System.out.println("Menu :");
            System.out.println("1. Utiliser la classe PlusGrandeValeurTableau");
            System.out.println("2. Utiliser la classe PlusGrandeValeurArrayList");
            System.out.println("3. Quitter");
            System.out.print("Choisissez une option : ");

            int choix = scanner.nextInt();
            //Choix des utilisateur
            if (choix == 1) {
                PlusGrandeValeurTableau.main(null);
            } else if (choix == 2) {
                PlusGrandeValeurArrayList.main(null);
            } else if (choix == 3) {
                System.out.println("Au revoir !");
                break;
            } else {
                System.out.println("Option non valide. Veuillez choisir une option valide.");
            }
        }

    }
}