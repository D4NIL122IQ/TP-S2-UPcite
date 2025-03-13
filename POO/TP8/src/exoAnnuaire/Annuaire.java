package exoAnnuaire;
import java.util.ArrayList;

public class Annuaire {
	private ArrayList<Client> annuaireClient;
	
	public Annuaire(ArrayList<Client> vecClient) {
		annuaireClient = vecClient;
	}
	
	public Annuaire() {
		this(new ArrayList<Client> ());
	}
	
	private void ajouterClient() {
		
		annuaireClient.add(new Client(Saisie.lireChaine("entrez le nom du client a ajouter"),
										Saisie.lireChaine("son adresse"), 
										Saisie.lireEntier("son numero de telephone : "),
										(float)Saisie.lireReel("son sold :")));
	}
	
	private void supprimerClient() {
		int num = Saisie.lireEntier("Entrez le numero du client a supprimer");
		
		if(num < annuaireClient.size()) {
			annuaireClient.remove(num);
		}
	}
	
	private boolean rechercheClientNum() {
		boolean trouver = false;
		int i = 0;
		int num = Saisie.lireEntier("Entrez le numero du client a chercher");
		
		while(!trouver && i<annuaireClient.size()) {
			if(annuaireClient.get(i).getNumero() == num) {
				trouver = true;
			}else {
				i++;
			}
		}
		return trouver;
	}
	
	

	public String toString() {
		StringBuffer yemp = new StringBuffer();
		
		yemp.append("Annuaire Client : \n");
		
		for(Client c: annuaireClient) {
			yemp.append(c.toString() + "\n");
		}
		
		return yemp.toString();
	}
	
	private void afficher() {
		System.out.println(this.toString());
	}
	
	public void menu() {
		int rep =0;
		while(rep!=-1){
			System.out.println("1 ===> Ajouter un nouveau client");
			System.out.println("2 ===> Afficher l'annuaire complet");
			System.out.println("3 ===> Rechercher un client par son numÈro");
			System.out.println("4 ===> Rechercher un client par son numÈro");
			System.out.println("-1 ===> Quitter");
			rep = Saisie.lireEntier("Votre choix ? ");
			
		if(rep == 1){
			ajouterClient();
		}
		else if (rep ==2){
			afficher();
		}
		else if (rep ==3){
			rechercheClientNum();
		}
		else if (rep ==4){
			supprimerClient();
		}
		}
	}
		
}
