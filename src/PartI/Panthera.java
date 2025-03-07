/**
 * extends Felidae
 * territorySize - double
 * maneColor - String
 * <p>
 * double constructor
 */

package PartI;


public class Panthera extends Felidae {
    private double territorySize;
    private double maneSize;

    public Panthera(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity, double gestationPeriod, String huntingStrategy, double biteForce, boolean climbingAbility, double roarVolume, double territorySize, double maneSize) {
        super(name, scientificName, lifeSpan, isMobile, dietType, vertebrate, nervousSystemComplexity, gestationPeriod, huntingStrategy, biteForce, climbingAbility, roarVolume);
        this.territorySize = territorySize;
        this.maneSize = maneSize;
    }

    public Panthera(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity, double gestationPeriod, String huntingStrategy, double biteForce, boolean climbingAbility, double roarVolume, double territorySize, double maneSize, boolean warmBlood) {
        super(name, scientificName, lifeSpan, isMobile, dietType, vertebrate, nervousSystemComplexity, gestationPeriod, huntingStrategy, biteForce, climbingAbility, roarVolume, warmBlood);
        this.territorySize = territorySize;
        this.maneSize = maneSize;
    }

    public double getTerritorySize() {
        return territorySize;
    }

    public void setTerritorySize(double territorySize) {
        this.territorySize = territorySize;
    }

    public double getManeSize() {
        return maneSize;
    }

    public void setManeSize(double maneSize) {
        this.maneSize = maneSize;
    }

    //snow-balling methods
    @Override
    public void describe() {
        super.describe();
        System.out.print(" At Genus level, this is a Panthera");
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "And " +
                "it has a territory the size of" +
                Double.toString(territorySize) +
                ", and it has a mane size of" +
                maneSize +
                "size units. ";
    }
    //end of snow-balling methods
}