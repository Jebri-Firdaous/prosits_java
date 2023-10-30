public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int NB_CAGES = 25;
    int nbAnimaux;
    public Zoo() {}
    public Zoo(String name, String city) {
        this.animals = new Animal[NB_CAGES]; // Initialisation du tableau d'animaux avec une taille maximale de 25
        this.name = name;
        this.city = city;
        this.nbAnimaux = 0;

    }
    public void displayZoo()
    {
        System.out.println("Zoo: " + name + ", cité: " + city+", nombre d'animaux: "+nbAnimaux);
    }
    @Override
    public String toString() {
        return "Zoo: " + name + ", cité: " + city;
    }
    public boolean addAnimal(Animal animal) {
        if (nbAnimaux < NB_CAGES) {
            animals[nbAnimaux] = animal;
            nbAnimaux++;
            return true;
        } else {
            System.out.println("Le zoo est plein. Impossible d'ajouter plus d'animaux.");
            return false;
        }
    }
}
