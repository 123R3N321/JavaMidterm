import PartI.*;

import java.util.ArrayList;

/**
 *     Create 5 objects of different classes.
 *     Create an ArrayList<Lifeform> and put those 5 objects in it.
 *     Use a lambda expression to sort them by lifespan and then another lambda expression to sort them by name
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, This is main module, used to test things.");
        Felidae t0 = new Felidae("Felix","Phelixius",100.0,true,"Meat only", true, 99.0, 98.0, "charm you to death", 97.0,true, 96.0);
        /**
         *     public Felidae(
         *     String name,
         *     String scientificName,
         *     double lifeSpan,
         *     boolean isMobile,
         *     String dietType,
         *     boolean vertebrate,
         *     double nervousSystemComplexity,
         *     double gestationPeriod,
         *     String huntingStrategy,
         *     double biteForce,
         *     boolean climbingAbility,
         *     double roarVolume) {
         */

        Animal t1 = new Animal("ageneric name","fake scientific name",120.0,true, "Humans");
        Plant t2 = new Plant("dragonTrap", "Plantae", 10000.0, 0.997, 3.1415926535897932384626433832795);
        Chordate t3 = new Chordate("bgeneric name","Chordata",100.7,true, "Humans",true, 100.0);
        Arthropod t4 = new Arthropod("cgeneric name","fake scientific name",1001.0,true, "Humans", 1001, false);

        ArrayList<Lifeform> arr = new ArrayList<Lifeform>();
        arr.add(t0);
        arr.add(t1);
        arr.add(t2);
        arr.add(t3);
        arr.add(t4);

        arr.sort((a,b)->(Double.compare(a.getLifeSpan(),b.getLifeSpan())));
        for (Lifeform lifeform : arr) {
            System.out.println(lifeform.getLifeSpan()); //sorted corectly by lifespan
        }

        arr.sort((a,b)->(a.getName().compareTo(b.getName())));
        for (Lifeform lifeform : arr) {
            System.out.println(lifeform.getName()); //sorted corectly by name
        }
    }

}