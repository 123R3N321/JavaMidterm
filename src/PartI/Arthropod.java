package PartI;

import PartI.Animal;

/**
 * Still abstract,
 * extends Animal,
 * adds:
 * exoskeleton (assumed to be bool default true, as all arthropods indeed have an armor)
 * legCount (has to be int then.)
 */
public class Arthropod extends Animal {

    //private
    private boolean exoskeleton = true;
    private int legCount;
    //private ends here

    //protected constructor
    //default do not change exoskeleton status
    public Arthropod(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, int legCount) {
        super(name, scientificName, lifeSpan, isMobile, dietType);
        this.legCount = legCount;
    }

    //overload to allow exoskeleton to be missing
    public Arthropod(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, int legCount, boolean exoskeleton) {
        this(name, scientificName, lifeSpan, isMobile, dietType, legCount);
        this.exoskeleton = exoskeleton;
    }
    //constructor ends here

    //public methods
    //getter-setter pairs, 4 in total
    public boolean isExoskeleton() {
        return exoskeleton;
    }

    public void setExoskeleton(boolean exoskeleton) {
        this.exoskeleton = exoskeleton;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }
    //end of getter-setter pairs

    //snow-balling methods
    @Override
    public void describe() {
        super.describe();
        System.out.print(" [redacted] level, this is an Arthropod.");
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", and " +
                ((exoskeleton) ? "it has an armor." :
                        "although all arthropods are expected to be armored, somehow this poor soul runs naked.") +
                " and it has " +
                Integer.toString(legCount) +
                " legs.";
    }
    //end of snow-balling methods
}