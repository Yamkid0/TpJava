package Sudoku;

import java.util.Scanner;

public class Sudoku implements RegleDuJeu{
	public Case[][] grilleJeu; //Case[numLigne][numColonne]
	
	// Cette application ne devrait pas se faire il y a plus que probablement une erreur de conception
	//Mais j'ai préféré continuer à avancer plutot que d'etre bloquer et ne rien pouvoir faire
	Interface interfaceSudoku;
	
	/**
	 * Constructeur par defaut
	 */
	public Sudoku(Interface interfaceSudoku) { 
		this.interfaceSudoku = interfaceSudoku;
	}
	
	/**
	 * Initialise le jeu -> la grille de jeu
	 * Place les elements initiaux dans des cases
	 * @param nbLigne
	 * @param nbColonne
	 */
	@Override
	public void initialiserJeu(int nbLigne, int nbColonne) {
		grilleJeu = new Case[nbLigne][nbColonne];
		grilleJeu[0][0] = new Case("1",true,1);//initialisation en dur pour consigne
		grilleJeu[1][2] = new Case("2",true,2);
		grilleJeu[3][1] = new Case("3",true,3);
		grilleJeu[3][3] = new Case("4",true,4);
	}
	
	/**
	 * Verif que la colonne et la ligne soit valide
	 * Que le symbole soit valide et que la case correspondante ne soit pas une case initial
	 */
	@Override
	public void verifierAjout(int ligne, int colonne) {
		boolean ajoutOk = true;
	}

	/**
	 * Algorithme d'aide correspondant à la méthode
	 */
	@Override
	public void algoAide() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Boucle principale du jeu
	 * Demande une case à modifier à l'utilisateur regarde si elle est correcte
	 * Verifie les conditions de victoire
	 */
	public void gestionJeu() {
		boolean partiePasGagne = true;
		initialiserJeu(4,4);
		interfaceSudoku.afficherGrille(grilleJeu);
		while(partiePasGagne) {
			saisirCase();
			interfaceSudoku.afficherGrille(grilleJeu);
			partiePasGagne = !verifierVictoire(); //si la partie est gagné alors retourne true 
			//donc le boolean partiePasGagne doit etre a false pour couper la fonction principale
		}
		interfaceSudoku.afficherVictoire();
	}
	
	/**
	 * Retourne la grille de jeu
	 * @return la grille de jeu actuelle
	 */
	public Case[][] getGrilleJeu() {
		return grilleJeu;
	}

	/**
	 * Setter de la grille de jeu
	 * @param grilleJeu la nouvelle grille de jeu
	 */
	public void setGrilleJeu(Case[][] grilleJeu) {
		this.grilleJeu = grilleJeu;
	}
	
	/**
	 * TODO : Ce code ne devrait pas etre la il devrait etre dans InterfaceConsole
	 * Il y'a plus que probablement une erreur de conception
	 * Je la place ici pour pouvoir avancer
	 */
	public void saisirCase() {
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
		verifierAjout(ligne, colonne); //verifie la validité avec la règle ( ex : pas déjà le meme symbole dans la ligne)
		
	}

	
	/**
	 * Verifie la victoire
	 */
	@Override
	public boolean verifierVictoire() {
		return true;
	}
}
