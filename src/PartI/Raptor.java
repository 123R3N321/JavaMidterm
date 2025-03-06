/**
 * extends bird
 * talonStrength (double assumed)
 * visionRange (double assumed)
 * single constructor
 */
package PartI;

public abstract class Raptor extends Bird{
    private double talonStrength;
    private double visionRange;

    protected Raptor(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity, boolean canFly, double wingSpan, double talonStrength, double visionRange) {
        super(name, scientificName, lifeSpan, isMobile, dietType, vertebrate, nervousSystemComplexity, canFly, wingSpan);
        this.talonStrength = talonStrength;
        this.visionRange = visionRange;
    }

    public double getTalonStrength() {
        return talonStrength;
    }
    public void setTalonStrength(double talonStrength) {
        this.talonStrength = talonStrength;
    }
    public double getVisionRange() {
        return visionRange;
    }
    public void setVisionRange(double visionRange) {
        this.visionRange = visionRange;
    }

    //snow-balling methods
    @Override
    public void describe() {
        super.describe();
        System.out.print(" At Order level, this is a raptor.");
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", and it has a talon strength of " +
                Double.toString(talonStrength) +
                " strength units, and it has a vision range of " +
                Double.toString(visionRange) +
                " length units.";
    }
    //end of snow-balling methods
}