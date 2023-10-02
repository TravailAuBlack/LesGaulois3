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
		return villageois[numVillageois ]; 
	}
	
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles" , 30);
		Gaulois gaulois = village.trouverHabitant(30);
		
		
		
	}
	



}
