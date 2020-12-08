package Sudoku;

import java.util.Scanner;


public class InterfaceConsole implements Interface {

	@Override
	/**
	 * Affiche le status actuel de la grille de jeu
	 */
	public void afficherGrille(Case[][] grilleJeu) {
		for(int i = 0 ; i < grilleJeu.length; i++) {
			System.out.println(); //saut de ligne
			for(int j = 0 ; j < grilleJeu[0].length; j++) {
				if(grilleJeu[i][j]!= null) { //si la case possede une valeur
					System.out.print(grilleJeu[i][j].getSymbole() + "|"); //on l'affiche
				} else {
					System.out.print(" |"); // sinon on n'affiche rien
				}
			}
		}
		System.out.println(); //saut de ligne
	}

	@Override
	/**
	 * Permet de saisir une nouvelle entree dans la grille de jeu
	 */
	public void saisirCase(Case[][] grilleJeu) {
		Scanner entree = new Scanner(System.in);
		int ligne;
		int colonne;
		String symbole;
		System.out.println("Entrer ligne");
		ligne = entree.nextInt()-1; //L'utilisateur entre une valeur ligne 1 hors cela correspond a l'index 0
		System.out.println("Entrer colonne");
		colonne = entree.nextInt()-1;
		System.out.println("Entrer votre symbole :");
		symbole = entree.next();
		//TODO verifier que le symbole est correct avec la regle
		//TODO verification que la ligne est la colonne existe
		if(grilleJeu[ligne][colonne]!= null
		&& grilleJeu[ligne][colonne].isInitial()) { //Si il s'agit d'une case initial
			System.out.println("Case initial impossible de modifier");
		} else {
			grilleJeu[ligne][colonne] = new Case(symbole,false,0);//TODO gerer les bloc
		}
	}

	@Override
	/**
	 * Affiche la victoire
	 */
	public void afficherVictoire() {
		System.out.println("Victoire");
		
	}
}
