public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int NB_CAGES = 25;
    int nbAnimaux;
    int nbrCages;
    int nbTotal;
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
        System.out.println("Zoo: " + name + ", cité: " + city+", nombre d'animaux: "+nbAnimaux+", nombre de cages: "+nbrCages);
    }
    @Override
    public String toString() {
        return "Zoo: " + name + ", cité: " + city+", Nombre de cages" + nbrCages;
    }
    public boolean addAnimal(Animal animal) {

        if (searchAnimal(animal) == -1) {
            if (isZooFull()==false) {
                animals[nbAnimaux] = animal;
                nbAnimaux++;
                nbTotal++;
                return true;
            } else {
                System.out.println("Nombre maximal");
                return false;
            }
        } else {
            System.out.println("Animal existe déjà");
            return false;
        }
    }
    public boolean isZooFull(){
    /*    if(nbAnimaux < NB_CAGES)
            return false;
        return true;

     */
        return (nbAnimaux == NB_CAGES);
    }
    public void displayAnimalZoo(){
        for(int i=0;i<NB_CAGES;i++){
            if (animals[i]!=null)
            {
                System.out.println("animal["+i+"]=Family: "+animals[i].family+" ,name:"+animals[i].name+", age:"+animals[i].age+" ,isMammal:"+animals[i].isMammal);
            }
        }

    }
    public int searchAnimal(Animal animal) {

        for (int i=0;i<nbrCages;i++)
        {
            if (animals[i]!=null && animals[i].name==animal.name)
                return i;
        }

        return -1;
    }
    public boolean removeAnimal(Animal animal){
        int pos = searchAnimal(animal);
        if(pos != -1){
            for(int j=pos; j<nbAnimaux-1 ; j++){
                animals[j] = animals[j+1];
            }
            nbAnimaux--;
            animals[nbAnimaux]=null;
            System.out.println("delete avec succes");
            return true;
        }
        return false;
    }
}
