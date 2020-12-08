package Sudoku;

public interface Interface {
	/**
	 * Affiche la grille
	 * @param grilleJeu la grille du jeu
	 */
	public void afficherGrille(Case[][] grilleJeu);
	
	/**
	 * Permet a l'utilisateu de saisir une case
	 * @param grilleJeu la grille du jeu
	 */
	public void saisirCase(Case[][] grilleJeu);

	public void afficherVictoire();
	
}
