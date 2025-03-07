package PartI;

/**
 * Note we revert back to non-default for
 * 'canFly' field as not all birdies fly!
 *
 * note: all birds have spine. Go check with prof
 */
public class Bird extends Chordate {
    private boolean canFly; //birds may or may not fly, look at kiwi and penguin!
    private double wingSpan;

    public Bird(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity, boolean canFly, double wingSpan) {
        super(name, scientificName, lifeSpan, isMobile, dietType, vertebrate, nervousSystemComplexity);
        this.canFly = canFly;
        this.wingSpan = wingSpan;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    //snow-balling methods
    @Override
    public void describe() {
        super.describe();
        System.out.print(" [redacted] level, this is a bird.");
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", and " +
                ((isCanFly()) ? "it takes to the wind!" : "it unfortunately cannot fly") +
                " and it has a wing span of " +
                Double.toString(wingSpan) +
                " length units.";
    }
    //end of snow-balling methods
}