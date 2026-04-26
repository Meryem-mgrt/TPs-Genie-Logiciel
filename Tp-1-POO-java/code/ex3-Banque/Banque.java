package Tppoo.ex3;

public class Banque {
    public static void main(String[] args) {
        System.out.println(" Compte Courant ");
        CompteCourant cc = new CompteCourant("CC-001", 1000.0);
        cc.deposer(500.0);
        cc.retirer(200.0);
        cc.retirer(2000.0);
        
        System.out.println("\n Compte Épargne ");
        CompteEpargne ce = new CompteEpargne("CE-001", 2000.0);
        ce.deposer(500.0);
        ce.calculerInterets(3.5); 
        ce.retirer(100.0);
        System.out.println("Solde final : " + ce.getSolde() + " €");
    }
}