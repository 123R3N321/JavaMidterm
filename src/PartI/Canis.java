/**
 * extends canidae
 * howLoudness, double
 * endurance, double
 */
package PartI;

public class Canis extends Canidae {
    private double howLoudness;    //do not default init
    private double endurance;  //assumed double

    //double constructor
    public Canis(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity, double gestationPeriod, String huntingStrategy, double biteForce, boolean packInstinct, double olfactorySensitivity, double howLoudness, double endurance) {
        super(name, scientificName, lifeSpan, isMobile, dietType, vertebrate, nervousSystemComplexity, gestationPeriod, huntingStrategy, biteForce, packInstinct, olfactorySensitivity);
        this.howLoudness = howLoudness;
        this.endurance = endurance;
    }

    //the second one allows warmBlood to be adjusted
    public Canis(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity, double gestationPeriod, String huntingStrategy, double biteForce, boolean packInstinct, double olfactorySensitivity, double howLoudness, double endurance, boolean warmBlood) {
        super(name, scientificName, lifeSpan, isMobile, dietType, vertebrate, nervousSystemComplexity, gestationPeriod, huntingStrategy, biteForce, packInstinct, olfactorySensitivity, warmBlood);
        this.howLoudness = howLoudness;
        this.endurance = endurance;
    }

    public double getHowLoudness() {
        return howLoudness;
    }

    public void setHowLoudness(double howLoudness) {
        this.howLoudness = howLoudness;
    }

    public double getEndurance() {
        return endurance;
    }

    public void setEndurance(double endurance) {
        this.endurance = endurance;
    }

    //snow-balling methods
    @Override
    public void describe() {
        super.describe();
        System.out.print(" At Genus level, this is a canis.");
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " And " +
                "their loudness is rated at" +
                Double.toString(howLoudness) +
                ", and it has an endurance of" +
                Double.toString(endurance) +
                "whatever units.";
    }
    //end of snow-balling methods
}