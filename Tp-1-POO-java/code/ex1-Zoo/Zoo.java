package Tppoo;

class Zoo {
    public static void main(String[] args) {
        Animal tigre = new Mammifere("Tigre");
        Animal perroquet = new Oiseau("Perroquet");
 
        tigre.faireDuBruit();      
        perroquet.faireDuBruit(); 
        
        // Question 6 :
        Oiseau perroquetOiseau = (Oiseau) perroquet;
        perroquetOiseau.voler(); 
    }
}