package src;

class CompteBancaire {

    protected String numeroCompte;
    protected double solde;

    public CompteBancaire(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public void deposer(double montant) {
        solde += montant;
    }

    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant !");
        }
    }

    public void afficherSolde() {
        System.out.println("Solde: " + solde);
    }
}

class CompteEpargne extends CompteBancaire {

    public CompteEpargne(String numeroCompte, double solde) {
        super(numeroCompte, solde);
    }

    public void calculerInterets(double taux) {
        solde += solde * taux;
    }
}

class CompteCourant extends CompteBancaire {

    public CompteCourant(String numeroCompte, double solde) {
        super(numeroCompte, solde);
    }
}

public class Banque {

    public static void main(String[] args) {

        CompteCourant c1 = new CompteCourant("C001", 1000);
        CompteEpargne c2 = new CompteEpargne("E001", 2000);

        c1.deposer(500);
        c1.retirer(300);
        c1.afficherSolde();

        c2.calculerInterets(0.05);
        c2.afficherSolde();
    }
}