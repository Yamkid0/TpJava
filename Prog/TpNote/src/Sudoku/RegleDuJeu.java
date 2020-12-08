package Sudoku;

public interface RegleDuJeu {
	/**
	 * Initialise la grille de jeu
	 * @param nbLigne le nombre de ligne de la grille de jeu
	 * @param nbColonne le nombre de colonne de la grille de jeu
	 */
	public void initialiserJeu(int nbLigne, int nbColonne);
	
	/**
	 * Verifie le dernier ajout et sa coherence selon la regle
	 * @param ligne ligne de l'ajout
	 * @param colonne colonne de l'ajout
	 */
	public void verifierAjout(int ligne, int colonne);
	
	/**
	 * Algorithme d'aide pour les regles du jeu
	 */
	public void algoAide();
	
	/**
	 * Verifie la victoire du joueur
	 * @return true = le joueur a gagné
	 */
	public boolean verifierVictoire();
}
