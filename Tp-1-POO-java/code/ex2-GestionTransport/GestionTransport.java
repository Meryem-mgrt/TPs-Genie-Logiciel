package Tppoo.ex2;

class GestionTransport {
    public static void main(String[] args) {
        Vehicule maVoiture  = new Voiture("Toyota", "Corolla", 2021, 4);
        Vehicule monCamion  = new Camion("Volvo", "FMX", 2019, 12.5);
        Vehicule maMoto     = new Moto("Honda", "CB500", 2022, "Guidon sport");
 
        maVoiture.afficherDetails();
        monCamion.afficherDetails();
        maMoto.afficherDetails();
    }
}
