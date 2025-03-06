/**
 * extends mammal (double constructor inheritance)
 * huntingStrategy
 * biteForce
 */
package PartI;

abstract public class Carnivore extends Mammal {
    private String huntingStrategy; //assumed to be string
    private double biteForce;   //assumed double

    //double protected constructor
    //first the version that does not set endotherm status
    protected Carnivore(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity, double gestationPeriod, String huntingStrategy, double biteForce) {
        super(name, scientificName, lifeSpan, isMobile, dietType, vertebrate, nervousSystemComplexity, gestationPeriod);
        this.huntingStrategy = huntingStrategy;
        this.biteForce = biteForce;
    }

    //then the constructor that adjusts endotherm/ectotherm
    protected Carnivore(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity, double gestationPeriod, String huntingStrategy, double biteForce, boolean warmBlood) {
        super(name, scientificName, lifeSpan, isMobile, dietType, vertebrate, nervousSystemComplexity, gestationPeriod, warmBlood);
        this.huntingStrategy = huntingStrategy;
        this.biteForce = biteForce;
    }

    public String getHuntingStrategy() {
        return huntingStrategy;
    }
    public void setHuntingStrategy(String huntingStrategy) {
        this.huntingStrategy = huntingStrategy;
    }

    public double getBiteForce() {
        return biteForce;
    }
    public void setBiteForce(double biteForce) {
        this.biteForce = biteForce;
    }

    //snow-balling methods
    @Override
    public void describe() {
        super.describe();
        System.out.print(" At Order level, this is a carnivore.");
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", and " +
                "it has a hunting strategy of " +
                huntingStrategy +
                ", and it has a biting force of" +
                Double.toString(biteForce) +
                "force units.";
    }
    //end of snow-balling methods
}