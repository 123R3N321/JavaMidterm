package PartI;

/**
 * extends lifeform
 * data members:
 * photosynthesisEfficiency
 * growthRate
 * <p>
 * notes:
 * should still be abstract,
 * snow-ball describe() and getDetails()
 */
public class Plant extends Lifeform {
    //private members:
    private double photosynthesisEfficiency;
    private double growthRate;    //non-specified type, string is easy.
    //private ends here

    //protected constructor, disable incomplete initialization
    //because getDetails() relies on all details being available
    public Plant(String name, String scientificName, double lifeSpan, double photosynthesisEfficiency, double growthRate) {
        super(name, scientificName, lifeSpan);
        this.photosynthesisEfficiency = photosynthesisEfficiency;
        this.growthRate = growthRate;
    }
    //protected constructor end here

    //public methods

    //setter-getter pairs, 4 methods in total
    public double getPhotosynthesisEfficiency() {
        return photosynthesisEfficiency;
    }

    public void setPhotosynthesisEfficiency(double photosynthesisEfficiency) {
        this.photosynthesisEfficiency = photosynthesisEfficiency;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    //getter-setter pairs end here


    //snow-balling methods
    @Override
    public void describe() {
        System.out.print("[redacted] level, this plant is called" + getName() +
                ", " +
                ", with scientific name " +
                getScientificName());//simply print more after this
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", and it has photosynthesis efficiency of " +
                Double.toString(photosynthesisEfficiency) +
                " and it has a growth rate of " +
                Double.toString(growthRate);
    }
}