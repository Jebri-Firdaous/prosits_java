public class MainClass {
    public  static void main(String[] args)
    {
        /*
        // Création d'un animal (lion) et attribution de valeurs aux attributs
        Animal lion=new Animal();
        lion.family = "Félin";
        lion.name = "Lion";
        lion.age = 5;
        lion.isMammal = true;

        // Création d'un zoo (myZoo) et attribution de valeurs aux attributs
        Zoo myZoo = new Zoo();
        myZoo.name = "Mon Zoo";
        myZoo.city = "VilleZoo";
        myZoo.nbrCages = 10;
        myZoo.animals = new Animal[25];
        */
        Zoo myZoo = new Zoo("Mon Zoo", "VilleZoo", 10);
        Animal lion = new Animal("Félin", "Lion", 5, true);
    }
}
