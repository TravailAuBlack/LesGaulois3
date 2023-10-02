package lieu;
import personnages.Chef;
import personnages.Gaulois;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0 ;

	
	public Village(String nom , int nbVillageoisMax) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMax];
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] =  gaulois ;
		nbVillageois++;
	}
	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois -1 ]; 
	}
	
	
	public void afficherVillageois(){
		int i;
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les légendaires gaulois :");
		for (i=0;i <nbVillageois ; i++) {
			System.out.println("- "+ villageois[i].getNom());	
		}
	}
	
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles" , 30);
		Chef abracourcix = new Chef("Abracourcix", 6, village);
		Gaulois asterix = new Gaulois("Astérix",8);
		village.ajouterHabitant(asterix);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
//		les resultat obtenue est :Gaulois [nom=Astérix, force=8, effetPotion=1]
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
		village.setChef(abracourcix);
		village.afficherVillageois();
		

		
		
		
		
		
		
	}
	



}
