/**
 * extends mammal (double constructor inheritance)
 * ruminationTime
 * herdBehavior
 */
package PartI;

abstract public class Herbivore extends Mammal {
    private double ruminationTime; //assumed to be double
    private String herdBehavior;   //assumed string, some kind of description

    //double protected constructor
    //first the version that does not set endotherm status
    protected Herbivore(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity, double gestationPeriod, double ruminationTime, String herdBehavior) {
        super(name, scientificName, lifeSpan, isMobile, dietType, vertebrate, nervousSystemComplexity, gestationPeriod);
        this.ruminationTime = ruminationTime;
        this.herdBehavior = herdBehavior;
    }

    //then the constructor that adjusts endotherm/ectotherm
    protected Herbivore(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity, double gestationPeriod, double ruminationTime, String herdBehavior,boolean warmBlood) {
        super(name, scientificName, lifeSpan, isMobile, dietType, vertebrate, nervousSystemComplexity, gestationPeriod, warmBlood);
        this.ruminationTime = ruminationTime;
        this.herdBehavior = herdBehavior;
    }

    public double getRuminationTime() {
        return ruminationTime;
    }
    public void setRuminationTime(double ruminationTime) {
        this.ruminationTime = ruminationTime;
    }
    public String getHerdBehavior() {
        return herdBehavior;
    }
    public void setHerdBehavior(String herdBehavior) {
        this.herdBehavior = herdBehavior;
    }

    //snow-balling methods
    @Override
    public void describe() {
        super.describe();
        System.out.print(" At Order level, this is a herbivore.");
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", and " +
                "it has a rumination time of " +
                Double.toString(ruminationTime) +
                " time units, and it has a herd behavior of" +
                herdBehavior;
    }
    //end of snow-balling methods
}