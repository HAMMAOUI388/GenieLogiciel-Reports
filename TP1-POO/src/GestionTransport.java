package src;

// 1. Classe abstraite Véhicule
abstract class Vehicule { 
 private String marque; 
 private String modele; 
 private int annee; 
 public Vehicule(String marque, String modele, int annee) { 
 this.marque = marque; 
 this.modele = modele; 
 this.annee = annee; 
 } 
 public String getMarque() { 
 return marque; 
 } 
 public String getModele() { 
 return modele; 
 } 
 public int getAnnee() { 
 return annee; 
 } 
 // Méthode abstraite à implémenter dans les sous-classes
 public abstract void afficherDetails(); 
 public void demarrer() {
    System.out.println("Le véhicule démarre.");
 }
} 

// 2. Classe Voiture qui hérite de Véhicule
class Voiture extends Vehicule { 
 private int nombreDePortes; 
 public Voiture(String marque, String modele, int annee, int nombreDePortes) { 
 super(marque, modele, annee); 
 this.nombreDePortes = nombreDePortes; 
 } 
//  @Override
//  public void afficherDetails() { 
//  System.out.println("Voiture: " + getMarque() + " " + getModele() + " (" + getAnnee() +
// "), Portes: " + nombreDePortes); 
//  } 
 @Override
public void afficherDetails() {
    demarrer();
    System.out.println("Voiture: " + getMarque() + " " + getModele() +
    " (" + getAnnee() + "), Portes: " + nombreDePortes);
}
} 

// 3. Classe Camion qui hérite de Véhicule
class Camion extends Vehicule { 
 private double capaciteDeCharge; 
 public Camion(String marque, String modele, int annee, double capaciteDeCharge) { 
 super(marque, modele, annee); 
 this.capaciteDeCharge = capaciteDeCharge; 
 } 
//  @Override
//  public void afficherDetails() {System.out.println("Camion: " + getMarque() + " " + getModele() + " (" + getAnnee() + "), Capacité: " + capaciteDeCharge + " tonnes"); 
//  } 
 @Override
 public void afficherDetails() {
    demarrer();
    System.out.println("Camion: " + getMarque() + " " + getModele() +
    " (" + getAnnee() + "), Capacité: " + capaciteDeCharge + " tonnes");
 }
} 

// Q6: class Moto :
class Moto extends Vehicule {

    private String typeDeGuidon;

    public Moto(String marque, String modele, int annee, String typeDeGuidon) {
        super(marque, modele, annee);
        this.typeDeGuidon = typeDeGuidon;
    }

    @Override
    public void afficherDetails() {
        demarrer();
        System.out.println("Moto: " + getMarque() + " " + getModele() +
        " (" + getAnnee() + "), Guidon: " + typeDeGuidon);
    }
}

// 4. Classe principale
public class GestionTransport { 
 public static void main(String[] args) { 
 Vehicule maVoiture = new Voiture("Toyota", "Corolla", 2021, 4); 
 Vehicule monCamion = new Camion("Volvo", "FMX", 2019, 12.5); 
 maVoiture.afficherDetails(); // Voiture: Toyota Corolla (2021), Portes: 4
 monCamion.afficherDetails(); // Camion: Volvo FMX (2019), Capacité: 12.5 tonnes
 // Polymorphisme : la méthode afficherDetails() se comporte différemment
 // selon l'instance de Vehicule (Voiture ou Camion)
 } 
}