package application.modele.utilitaires;

public class Epee extends Utilitaire {
	public static int compteur = 0;
	public Epee(int mat) {
		super(mat, "E" + compteur);
		compteur++;
		// TODO Auto-generated constructor stub
	}

}
