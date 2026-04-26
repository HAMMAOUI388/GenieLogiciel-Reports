package src;

// 1. Classe abstraite Animal
abstract class Animal { 
 private String nom; 
 public Animal(String nom) { 
 this.nom = nom; 
 } 
 public String getNom() { 
 return nom; 
 } 
 // Méthode abstraite à implémenter dans les sous-classes
 public abstract void faireDuBruit(); 
} 
// 2. Classe Mammifere héritant d'Animal
class Mammifere extends Animal { 
 public Mammifere(String nom) { 
 super(nom); 
 } 
 @Override
 public void faireDuBruit() { 
 System.out.println(getNom() + " grogne."); 
 } 
} 
// 3. Classe Oiseau héritant d'Animal
// class Oiseau extends Animal { 
//  public Oiseau(String nom) { 
//  super(nom); 
//  } 
//  @Override
//  public void faireDuBruit() { 
//  System.out.println(getNom() + " chante."); 
//  } 
//  // Complétez cette méthode pour ajouter un comportement unique aux oiseaux
//  // public void voler() {
//  // }
// } 

// class Oiseau complete:
class Oiseau extends Animal {
    public Oiseau(String nom) {
        super(nom);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " chante.");
    }

    public void voler() {
        System.out.println(getNom() + " vole.");
    }
}

// 4. Classe principale avec polymorphisme
public class Zoo { 
    public static void main(String[] args) { 
        // Polymorphisme : la méthode faireDuBruit() se comporte différemment
        // selon l'instance d'Animal (tigre ou perroquet)

        Animal tigre = new Mammifere("Tigre");
        tigre.faireDuBruit();

        Oiseau perroquet = new Oiseau("Perroquet");
        perroquet.faireDuBruit();
        perroquet.voler();
    }
}
