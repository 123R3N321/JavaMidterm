/**
 * extends canis
 * packLeadershipScore, double
 * howlFrequency, double
 */
package PartI;

public class Wolf extends Canis {
    private double packLeadershipScore;    //do not default init
    private double howlFrequency;  //assumed double

    //double constructor
    public Wolf(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity, double gestationPeriod, String huntingStrategy, double biteForce, boolean packInstinct, double olfactorySensitivity, double howLoudness, double endurance, double packLeadershipScore, double howlFrequency) {
        super(name, scientificName, lifeSpan, isMobile, dietType, vertebrate, nervousSystemComplexity, gestationPeriod, huntingStrategy, biteForce, packInstinct, olfactorySensitivity, packLeadershipScore, howlFrequency);
        this.packLeadershipScore = packLeadershipScore;
        this.howlFrequency = howlFrequency;
    }

    //the second one allows warmBlood to be adjusted
    public Wolf(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity, double gestationPeriod, String huntingStrategy, double biteForce, boolean packInstinct, double olfactorySensitivity, double howLoudness, double endurance, double packLeadershipScore, double howlFrequency, boolean warmBlood) {
        super(name, scientificName, lifeSpan, isMobile, dietType, vertebrate, nervousSystemComplexity, gestationPeriod, huntingStrategy, biteForce, packInstinct, olfactorySensitivity, packLeadershipScore, howlFrequency, warmBlood);
        this.packLeadershipScore = packLeadershipScore;
        this.howlFrequency = howlFrequency;
    }

    public double getPackLeadershipScore() {
        return packLeadershipScore;
    }

    public void setPackLeadershipScore(double packLeadershipScore) {
        this.packLeadershipScore = packLeadershipScore;
    }

    public double getHowlFrequency() {
        return howlFrequency;
    }

    public void setHowlFrequency(double howlFrequency) {
        this.howlFrequency = howlFrequency;
    }

    //snow-balling methods
    @Override
    public void describe() {
        super.describe();
        System.out.print(" At Species level, this is a wolf.");
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " And " +
                "its leadership is scored at" +
                Double.toString(packLeadershipScore) +
                ", and it has a howling frequecny of" +
                Double.toString(howlFrequency) +
                "frequency units.";
    }
    //end of snow-balling methods
}