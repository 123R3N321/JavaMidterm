import PartI.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, This is main module");
        Felidae testThing = new Felidae("Felix","Phelixius",100.0,true,"Meat only", true, 99.0, 98.0, "charm you to death", 97.0,true, 96.0);
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
        testThing.describe();
        System.out.println("\nHello, This is test module--------------\n");
        System.out.println(testThing.getDetails());
    }

}
