/**
 * extends Carnivore
 * climbingAbility  assumed to be bool
 * roarVolume
 */
package PartI;
public class Felidae extends Carnivore {
    private boolean climbingAbility;    //do not default init
    private double roarVolume;  //assumed double

    //double constructor
    public Felidae(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity, double gestationPeriod, String huntingStrategy, double biteForce, boolean climbingAbility, double roarVolume) {
        super(name, scientificName, lifeSpan, isMobile, dietType, vertebrate, nervousSystemComplexity, gestationPeriod, huntingStrategy, biteForce);
        this.climbingAbility = climbingAbility;
        this.roarVolume = roarVolume;
    }

    //the second one allows warmBlood to be adjusted
    public Felidae(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity, double gestationPeriod, String huntingStrategy, double biteForce, boolean climbingAbility, double roarVolume, boolean warmBlood) {
        super(name, scientificName, lifeSpan, isMobile, dietType, vertebrate, nervousSystemComplexity, gestationPeriod, huntingStrategy, biteForce,warmBlood);
        this.climbingAbility = climbingAbility;
        this.roarVolume = roarVolume;
    }

    public boolean isClimbingAbility() {
        return climbingAbility;
    }
    public void setClimbingAbility(boolean climbingAbility) {
        this.climbingAbility = climbingAbility;
    }
    public double getRoarVolume() {
        return roarVolume;
    }
    public void setRoarVolume(double roarVolume) {
        this.roarVolume = roarVolume;
    }
    //snow-balling methods
    @Override
    public void describe() {
        super.describe();
        System.out.print(" At Family level, this is a felidae.");
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", and " +
                ((climbingAbility)?"you will not be safe hiding in a tree":"you better hide in a tree") +
                ", and it has a roaring volume of" +
                Double.toString(roarVolume) +
                "volume units.";
    }
    //end of snow-balling methods
}