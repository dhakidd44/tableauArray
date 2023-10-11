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
    }
}