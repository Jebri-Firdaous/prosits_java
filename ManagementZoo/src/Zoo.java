public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int NB_CAGES = 25;
    int nbAnimaux;
    int nbrCages;
    public Zoo() {}
    public Zoo(String name, String city,int nbrCages) {
        this.animals = new Animal[NB_CAGES]; // Initialisation du tableau d'animaux avec une taille maximale de 25
        this.name = name;
        this.city = city;
        this.nbrCages=nbrCages;
        this.nbAnimaux = 0;

    }
    public void displayZoo()
    {
        System.out.println("Zoo: " + name + ", cité: " + city+", nombre d'animaux: "+nbAnimaux);
    }
    @Override
    public String toString() {
        return "Zoo: " + name + ", cité: " + city+",Nombre de cages" + nbrCages;
    }
    public boolean addAnimal(Animal animal) {
        if (nbAnimaux < nbrCages) {
            animals[nbAnimaux] = animal;
            nbAnimaux++;
            return true;
        } else {
            System.out.println("Le zoo est plein. Impossible d'ajouter plus d'animaux.");
            return false;
        }
    }
    public void displayAnimalZoo(){
        for(int i=0;i<NB_CAGES;i++){
            if (animals[i]!=null)
            {
                System.out.println("animal["+i+"]=Family: "+animals[i].family+" ,name:"+animals[i].name+", age:"+animals[i].age+" ,isMammal:"+animals[i].isMammal);
            }
        }

        }
}
