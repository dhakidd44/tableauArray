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

import java.util.ArrayList;
import java.util.Random;

public class PlusGrandeValeurArrayList {
    public static void main(String[] args) {
        // Création d'un ArrayList pour stocker des nombres entiers.
        ArrayList<Integer> liste = new ArrayList<>();

        // Initialisialisation d'un générateur de nombres aléatoires.
        Random rand = new Random();

        // Remplissage l'ArrayList avec 15 valeurs aléatoires entre 0 et 100.
        for (int i = 0; i < 15; i++) {
            int valeurAleatoire = rand.nextInt(101); // Génère des entiers de 0 à 100.
            liste.add(valeurAleatoire); // Ajoute la valeur générée à l'ArrayList.
        }
        // Remplissage l'ArrayList avec 15 valeurs aléatoires entre 0 et 100.
        for (int i = 0; i < 15; i++) {
            int valeurAleatoire = rand.nextInt(101); // Génère des entiers de 0 à 100.
            liste.add(valeurAleatoire); // Ajoute la valeur générée à l'ArrayList.
        }

        // Initialisation des variables pour stocker le plus grand, le plus petit, et
        // leurs index correspondants.
        int plusGrand = liste.get(0); // Suppose que le plus grand est le premier élément de la liste.
        int plusPetit = liste.get(0); // Suppose que le plus petit est le premier élément de la liste.
        int indexPlusGrand = 0; // Initialise l'index du plus grand.
        int indexPlusPetit = 0; // Initialise l'index du plus petit.

        // Affichage du contenu de l'ArrayList et recherche le plus grand et le plus
        // petit nombre.
        System.out.println(" ***** Affichage de notre liste *****");
        // Affichage du contenu de l'ArrayList et recherche le plus grand et le plus
        // petit nombre.
        System.out.println(" ***** Affichage de notre liste *****");

        for (int i = 0; i < liste.size(); i++) {
            // Affichage l'élément actuel avec son index.
            System.out.println("Index " + i + ": " + liste.get(i));

            // Mise à jour le plus grand nombre si une valeur plus grande est trouvée.
            if (liste.get(i) > plusGrand) {
                plusGrand = liste.get(i);
                indexPlusGrand = i;
            }

            // Mise à jour le plus petit nombre si une valeur plus petite est trouvée.
            if (liste.get(i) < plusPetit) {
                plusPetit = liste.get(i);
                indexPlusPetit = i;
            }
        }

        // Affichage du résultat, y compris les indices des plus grands et des plus
        // petits nombres.
        System.out.println("Le plus grand nombre de notre liste est : " + plusGrand);
        System.out.println("Le plus grand nombre est à l'index : " + indexPlusGrand);
        System.out.println("Le plus petit nombre de notre liste est : " + plusPetit);
        System.out.println("Le plus  petit nombre est à l'index : " + indexPlusPetit);
    }
}
