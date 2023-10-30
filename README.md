# prosits_java
les prosits java
# PROSIT 1

## Instruction 1:
public class ZooManagementt
{
    int nbrCages = 20;
    String zooName ="my zoo";
    public static void main(String[] esprit)
    {
        System.out.println(zooName+" comporte "+nbrCages+" cages.");
        //erreur ici : var(zooName/nbrCages)
    }
}
Rq : impossible d'invoquer une variable non statique dans un contexte statique (main)

###Solution 1:
public class ZooManagementt
{
    static int nbrCages = 20;
    static String zooName ="my zoo";
    public static void main(String[] esprit)
    {
        System.out.println(zooName+" comporte "+nbrCages+" cages.");
    }
}

###Solution 2:
public class ZooManagementt
{
    public static void main(String[] esprit)
    {
        int nbrCages = 20;
        String zooName ="my zoo";
        System.out.println(zooName+" comporte "+nbrCages+" cages.");
    }
}

##Instruction 2-3:
import java.util.Scanner;
public class ZooManagementt{
    public static void main(String[] args)
    {
        //Declaration nb + l'instanciation---> Créer un objet de type Scanner
        Scanner sc=new Scanner(System.in) ;

        System.out.println("Saisir le nombre de cages: ");
        int nbrCages=sc.nextInt();

        System.out.println("Saisir le nom de Zoo: ");
        String zooName=sc.next();

        System.out.println(zooName+" comporte "+nbrCages+" cages.");

        sc.close();
    }
}




