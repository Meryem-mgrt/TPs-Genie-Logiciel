package Tppoo.ex3;

class CompteEpargne extends CompteBancaire {
    public CompteEpargne(String numeroCompte, double soldeInitial) {
        super(numeroCompte, soldeInitial);
    }
 
    public void calculerInterets(double taux) {
        double interets = getSolde() * taux / 100;
        deposer(interets);
        System.out.println("Intérêts calculés au taux de " + taux + "% : +" + interets + " €");
    }
}