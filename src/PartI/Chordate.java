package PartI;


/**
 * Still abstract,
 * extends Animal,
 * adds:
 * vertebrate (assumed to be bool, as not all chordates have a spine)
 * nervousSystemComplexity (assumed double)
 */
public class Chordate extends Animal {

    //private
    private boolean vertebrate;
    private double nervousSystemComplexity;
    //private ends here

    //protected constructor
    public Chordate(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity) {
        super(name, scientificName, lifeSpan, isMobile, dietType);
        this.vertebrate = vertebrate;
        this.nervousSystemComplexity = nervousSystemComplexity;
    }
    //constructor ends here

    //public methods
    //getter-setter pairs, 4 in total
    public boolean isVertebrate() {
        return vertebrate;
    }

    public void setVertebrate(boolean vertebrate) {
        this.vertebrate = vertebrate;
    }

    public double getNervousSystemComplexity() {
        return nervousSystemComplexity;
    }

    public void setNervousSystemComplexity(double nervousSystemComplexity) {
        this.nervousSystemComplexity = nervousSystemComplexity;
    }
    //end of getter-setter pairs

    //snow-balling methods
    @Override
    public void describe() {
        super.describe();
        System.out.print(" [redacted] level, this is a chordate.");
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", and " +
                ((vertebrate) ? "it has a spine" : "it is spineless") +
                " and it has a nervous system complexity of " +
                Double.toString(nervousSystemComplexity);
    }
    //end of snow-balling methods
}