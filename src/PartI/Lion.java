/**
 * extends Panthera
 * pridesize - double
 * maneColor - String
 * <p>
 * double constructor
 */

package PartI;


public class Lion extends Panthera {
    private double prideSize;   //wtf is this attribute
    private String maneColor;

    public Lion(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity, double gestationPeriod, String huntingStrategy, double biteForce, boolean climbingAbility, double roarVolume, double territorySize, double maneSize, double prideSize, String maneColor) {
        super(name, scientificName, lifeSpan, isMobile, dietType, vertebrate, nervousSystemComplexity, gestationPeriod, huntingStrategy, biteForce, climbingAbility, roarVolume, territorySize, maneSize);
        this.prideSize = prideSize;
        this.maneColor = maneColor;
    }

    public Lion(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity, double gestationPeriod, String huntingStrategy, double biteForce, boolean climbingAbility, double roarVolume, double territorySize, double maneSize, double prideSize, String maneColor, boolean warmBlood) {
        super(name, scientificName, lifeSpan, isMobile, dietType, vertebrate, nervousSystemComplexity, gestationPeriod, huntingStrategy, biteForce, climbingAbility, roarVolume, territorySize, maneSize, warmBlood);
        this.prideSize = prideSize;
        this.maneColor = maneColor;
    }

    public double getPrideSize() {
        return prideSize;
    }

    public void setPrideSize(double territorySize) {
        this.prideSize = prideSize;
    }

    public String getManeColor() {
        return maneColor;
    }

    public void setManeColor(String maneColor) {
        this.maneColor = maneColor;
    }

    //snow-balling methods
    @Override
    public void describe() {
        super.describe();
        System.out.print(" At Species level, this is a lion");
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "And " +
                "it has a pride the size of" +
                Double.toString(prideSize) +
                ", and it has a mane color of" +
                maneColor +
                " which looks good.";
    }
    //end of snow-balling methods
}