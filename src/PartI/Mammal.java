package PartI;

public abstract class Mammal extends Chordate {
    private boolean warmBlood = true;
    private double gestationPeriod;

    //barebone constructor reuqirements excludes endortherm bool switch
    protected Mammal(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity, double gestationPeriod) {
        super(name, scientificName, lifeSpan, isMobile, dietType, vertebrate, nervousSystemComplexity);
        this.gestationPeriod = gestationPeriod;
    }

    //full-fledged constructor in case user changes the warm blooded status to false (I don see why but, whatev)
    protected Mammal(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity, double gestationPeriod, boolean warmBlood) {
        this(name, scientificName, lifeSpan, isMobile, dietType, vertebrate, nervousSystemComplexity, gestationPeriod);
        this.warmBlood = warmBlood;
    }

    public boolean isWarmBlood() {
        return warmBlood;
    }

    public void setWarmBlood(boolean warmBlood) {
        this.warmBlood = warmBlood;
    }

    public double getGestationPeriod() {
        return gestationPeriod;
    }

    public void setGestationPeriod(double gestationPeriod) {
        this.gestationPeriod = gestationPeriod;
    }

    //snow-balling methods
    @Override
    public void describe() {
        super.describe();
        System.out.print(" At Class level, this is a mammal.");
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", and " +
                ((isWarmBlood()) ? "it is endothermic, to be precise" : "it is ectothermic, precisely speaking") +
                " and it has a gestation period of " +
                Double.toString(gestationPeriod) +
                "time units.";
    }
    //end of snow-balling methods
}