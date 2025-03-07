package PartI;

/**
 * predationSuccessRate assumed double
 * wingLoad assumed double
 * <p>
 * single constructor (Nice!)
 */
public class Accipitridae extends Raptor {
    private double predationSuccessRate;
    private double wingLoad;

    public Accipitridae(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity, boolean canFly, double wingSpan, double talonStrength, double visionRange, double predationSuccessRate, double wingLoad) {
        super(name, scientificName, lifeSpan, isMobile, dietType, vertebrate, nervousSystemComplexity, canFly, wingSpan, talonStrength, visionRange);
        this.predationSuccessRate = predationSuccessRate;
        this.wingLoad = wingLoad;
    }

    public double getPredationSuccessRate() {
        return predationSuccessRate;
    }

    public void setPredationSuccessRate(double predationSuccessRate) {
        this.predationSuccessRate = predationSuccessRate;
    }

    public double getWingLoad() {
        return wingLoad;
    }

    public void setWingLoad(double wingLoad) {
        this.wingLoad = wingLoad;
    }

    //snow-balling methods
    @Override
    public void describe() {
        super.describe();
        System.out.print(" At Famiy level, this is an Accipitridae.");
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "And it has a predation success rate of " +
                Double.toString(predationSuccessRate) +
                ", and it has a wing load of " +
                Double.toString(wingLoad) +
                " weight units.";
    }
    //end of snow-balling methods

}