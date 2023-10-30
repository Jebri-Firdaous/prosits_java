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
        */
        Zoo myZoo = new Zoo("Belvidere", "Tunis");
        Animal lion = new Animal("Félin", "Lion", 5, true);
        Animal chat = new Animal("Carnivore","Chat",2,true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);
        Animal giraffe = new Animal("Giraffidae", "Giraffe", 8, true);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(chat);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(giraffe);

        myZoo.displayZoo();
        //System.out.println(myZoo);
        //System.out.println(myZoo.toString());
    }
}
