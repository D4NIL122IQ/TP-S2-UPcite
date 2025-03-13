package exoAnnuaire;

public class Client {
	private static int prochainClt = 0;
	private int numero;
	private String nom;
	private String adresse;
	private int numeroTel;
	private float solde;

	public Client(String nom, String adrs, int numeroTel, float solde) {
		this.numero = prochainClt++;
		this.nom = nom;
		adresse = adrs;
		this.solde = solde;
		this.numeroTel = numeroTel;
	}
	

	public int getNumero() {
		return numero;
	}

	public String getNom() {
		return nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public int getNumeroTel() {
		return numeroTel;
	}

	public float getSolde() {
		return solde;
	}
	
	public String toString() {
		return "numero=" + numero + ", nom=" + nom + ", adresse=" + adresse + ", numeroTel=" + numeroTel
				+ ", solde=" + solde ;
	}
	
	void afficher() {
		System.out.println(this.toString());
	}
}
