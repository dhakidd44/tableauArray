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

// Initialisationsdes variables pour stocker le plus grand, le plus petit, et leurs index correspondants.
int plusGrand = tableau[0]; // Suppose que le plus grand est le premier élément du tableau.
int plusPetit = tableau[0]; // Suppose que le plus petit est le premier élément du tableau.
int indexPlusGrand = 0; // Initialise l'index du plus grand.
int indexPlusPetit = 0; // Initialise l'index du plus petit.
        
}
}