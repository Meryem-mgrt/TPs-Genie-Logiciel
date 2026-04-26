package Tppoo.ex3;

class CompteBancaire {
    private String numeroCompte;
    private double solde;
 
    public CompteBancaire(String numeroCompte, double soldeInitial) {
        this.numeroCompte = numeroCompte;
        this.solde = soldeInitial;
    }
 
    public String getNumeroCompte() { return numeroCompte; }
    public double getSolde()        { return solde; }
 
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + " € effectué. Solde : " + solde + " €");
        } else {
            System.out.println("Montant de dépôt invalide.");
        }
    }
     public void retirer(double montant) {
        if (montant <= 0) {
            System.out.println("Montant de retrait invalide.");
        } else if (montant > solde) {
            System.out.println("Solde insuffisant. Solde actuel : " + solde + " €");
        } else {
            solde -= montant;
            System.out.println("Retrait de " + montant + " € effectué. Solde : " + solde + " €");
        }
    }
}