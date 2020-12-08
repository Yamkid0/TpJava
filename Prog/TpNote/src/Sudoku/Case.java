package Sudoku;

public class Case {
	/**
	 * Symbole contenu par la case
	 */
	private String symbole;
	/**
	 * Est une valeur initial ou non
	 */
	private boolean initial;
	/**
	 * Bloc auquel la valeur appartient
	 */
	private int bloc;
	
	/**
	 * Constructeur de la classe Case
	 * @param symbole le symbole dans la case
	 * @param initial est une valeur initial ou non
	 * @param bloc le bloc auquel la valeur appartient
	 */
	public Case(String symbole, boolean initial, int bloc) {
		this.symbole = symbole;
		this.initial = initial;
		this.bloc = bloc;
	}
	
	/**
	 * Getter symbole
	 * @return symbole le symbole dans la case
	 */
	public String getSymbole() {
		return symbole;
	}
	
	/**
	 * Setter de symbole
	 * @param symbole le nouveau symbole
	 */
	public void setSymbole(String symbole) {
		this.symbole = symbole;
	}
	
	/**
	 * Retourne si la case est intial ou non
	 * @return
	 */
	public boolean isInitial() {
		return initial;
	}
}