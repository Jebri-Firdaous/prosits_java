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
        Zoo myZoo = new Zoo("Belvidere", "Tunis",2);
        Animal lion = new Animal("Félin", "Lion", 5, true);
        Animal chat = new Animal("Carnivore","Chat",2,true);
        Animal elephant = new Animal("Elephant", "Elephant", 10, true);
        Animal giraffe = new Animal("Giraffe", "Giraffe", 8, true);
        Animal chat_n = new Animal("Carnivore","Chat",2,true);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(chat);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(giraffe);

        myZoo.displayZoo();
        /*myZoo.displayAnimalZoo();
        myZoo.addAnimal(chat_n);*/
/*
        int search= myZoo.searchAnimal(chat_n);
        if (search != -1) {
            System.out.println("L'animal a été trouvé à l'indice : " + search);
        } else {
            System.out.println("L'animal n'a pas été trouvé dans le zoo.");
        }
        myZoo.removeAnimal(lion);

*/

        //System.out.println(myZoo);
        //System.out.println(myZoo.toString());
    }
}
