package PartI;

/**
 * be careful: the number of wings is a whole number!
 * use integer!
 * <p>
 * assume metamorphosis stage is just a descriptor (name/ a description)
 * <p>
 * and now we have double-super constructor calls!
 */
abstract public class Insect extends Arthropod {
    private int wingCount;  //the number of wings is discrete!
    private String metamorphosisStage;  //assumed to be the name/description of the stage

    //first, assumed exoskeleton constructor
    protected Insect(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, int legCount, int wingCount, String metamorphosisStage) {
        super(name, scientificName, lifeSpan, isMobile, dietType, legCount);
        this.wingCount = wingCount;
        this.metamorphosisStage = metamorphosisStage;
    }
    //next, the overloaded constructor that allows exo to be missing
    //note that we just call the other constructor and not setter!
    protected Insect(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, int legCount, boolean exoskeleton, int wingCount, String metamorphosisStage) {
        super(name, scientificName, lifeSpan, isMobile, dietType, legCount, exoskeleton);
        this.wingCount = wingCount;
        this.metamorphosisStage = metamorphosisStage;
    }

    public int getWingCount() {
        return wingCount;
    }
    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }
    public String getMetamorphosisStage() {
        return metamorphosisStage;
    }
    public void setMetamorphosisStage(String metamorphosisStage) {
        this.metamorphosisStage = metamorphosisStage;
    }
    //snow-balling methods
    @Override
    public void describe() {
        super.describe();
        System.out.print(" At Class level, this is an insect.");
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", and " +
                ((0==wingCount) ? "it has "+Integer.toString(wingCount)+" wings":
                        "it doesn't have any wing") +
                " and it is currently at the metamorphosis stage of " +
                metamorphosisStage;
    }
    //end of snow-balling methods
}