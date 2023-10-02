package personnages;
import personnages.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement;
	private int nbEquipement =0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		// TODO Auto-generated method stub
		return force;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void dire(String texte) {
		System.out.println(commencerDiscution() + "« " + texte + "»");
	}
	
	private String commencerDiscution() {
		return "Le soldat " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		int PostForce = force;
		force -= forceCoup;
		assert force >0;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert force < PostForce;
	}
	
	
	public void sEquiper(Equipement equipe) {
		switch(nbEquipement)
		{
		case 0:
			dire("Est deja bien protegé");
			break;
		case 1:
			if(equipe == equipement[0]) {
				dire("possede deja un " + equipe.getNom());
			}else {
				equiper(equipe);
				break;
			}
				
		}
		
	}
	
	
	public void equiper(Equipement equiper) {
		dire("s'équipe avec un " + equiper.getNom());
		nbEquipement ++;
		equipement[nbEquipement -1] = equiper;
		
	}
	
	
	public static void main(String[] args) {
		Romain minus = new Romain ("Minus" ,6);
		minus.parler("Bonjour");
		minus.prendreParole();
		minus.recevoirCoup(4);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		
		}

	
}
