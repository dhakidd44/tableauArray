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

import java.util.Random;

public class PlusGrandeValeurTableau {
    public static void main(String[] args) {
        // Cration d'un tableau d'entiers avec 15 cellules.
        int[] tableau = new int[15];

        // Initialisation d'un générateur de nombres aléatoires.
        Random rand = new Random();

        // Remplissage du tableau avec des valeurs aléatoires entre 0 et 100.
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = rand.nextInt(101); // Génère des entiers aléatoires de 0 à 100.
        }

        // Initialisationsdes variables pour stocker le plus grand, le plus petit, et
        // leurs index correspondants.
        int plusGrand = tableau[0]; // Suppose que le plus grand est le premier élément du tableau.
        int plusPetit = tableau[0]; // Suppose que le plus petit est le premier élément du tableau.
        int indexPlusGrand = 0; // Initialise l'index du plus grand.
        int indexPlusPetit = 0; // Initialise l'index du plus petit.

        // Affichage du contenu du tableau et recherche le plus grand et le plus petit
        // nombre.
        System.out.println(" ***** Affichage du Tableau ***** :");

        for (int i = 0; i < tableau.length; i++) {
            // Affichage de l'élément actuel avec son index.
            System.out.println("Tableau [" + i + "]: " + tableau[i]);

            // Mise à jour le plus grand nombre si une valeur plus grande est trouvée.
            if (tableau[i] > plusGrand) {
                plusGrand = tableau[i];
                indexPlusGrand = i;
            }

            // Mise à jour le plus petit nombre si une valeur plus petite est trouvée.
            if (tableau[i] < plusPetit) {
                plusPetit = tableau[i];
                indexPlusPetit = i;
            }

        }

        // Affichage du résultat, y compris les indices des plus grands et des plus
        // petits nombres.
        System.out.println("Le plus grand nombre du tableau est : " + plusGrand);
        System.out.println("Le plus grand nombre est à l'index : " + indexPlusGrand);
        System.out.println("Le plus petit nombre du tableau est : " + plusPetit);
        System.out.println("Le plus petit nombre est à l'index : " + indexPlusPetit);

    }
}