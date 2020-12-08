package Sudoku;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestSudoku4x4 {
	public static void main(String[] args) {
		Sudoku sudoku = new Sudoku(new InterfaceConsole());
		sudoku.gestionJeu();
	}
	
	@Test
	public void testVerifVictoire(Case[][] grilleJeu) {
		//TODO tester avec une grille non complete, une grille finie, et une grille avec une erreur
		//assertEquals(test,test);
	}
	@Test
	public void testVerifierAjout() {
		//TODO tester un ajout correct et un ajout incorrect
	}
	@Test
	public void testInitialiserJeu() {
		//TODO verifier que l'algorithme de genreation fonctionne bien
	}
}
