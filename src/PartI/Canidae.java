/**
 * extends Carnivore
 * packInstinct  assumed to be bool, do not default init
 * olfactorySensitivity
 */
package PartI;

public class Canidae extends Carnivore {
    private boolean packInstinct;    //do not default init
    private double olfactorySensitivity;  //assumed double

    //double constructor
    public Canidae(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity, double gestationPeriod, String huntingStrategy, double biteForce, boolean packInstinct, double olfactorySensitivity) {
        super(name, scientificName, lifeSpan, isMobile, dietType, vertebrate, nervousSystemComplexity, gestationPeriod, huntingStrategy, biteForce);
        this.packInstinct = packInstinct;
        this.olfactorySensitivity = olfactorySensitivity;
    }

    //the second one allows warmBlood to be adjusted
    public Canidae(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity, double gestationPeriod, String huntingStrategy, double biteForce, boolean packInstinct, double olfactorySensitivity, boolean warmBlood) {
        super(name, scientificName, lifeSpan, isMobile, dietType, vertebrate, nervousSystemComplexity, gestationPeriod, huntingStrategy, biteForce);
        this.packInstinct = packInstinct;
        this.olfactorySensitivity = olfactorySensitivity;
    }

    public boolean isPackInstinct() {
        return packInstinct;
    }

    public void setPackInstinct(boolean packInstinct) {
        this.packInstinct = packInstinct;
    }

    public double getOlfactorySensitivity() {
        return olfactorySensitivity;
    }

    public void setOlfactorySensitivity(double olfactorySensitivity) {
        this.olfactorySensitivity = olfactorySensitivity;
    }

    //snow-balling methods
    @Override
    public void describe() {
        super.describe();
        System.out.print(" At Family level, this is a canidae.");
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " And " +
                ((packInstinct) ? "they pack up in gangs" : "they are solitary warriors") +
                ", and it has an olfactory sensitivity of" +
                Double.toString(olfactorySensitivity) +
                "whatever units.";
    }
    //end of snow-balling methods
}