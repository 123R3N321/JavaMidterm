/**
 * extends bird
 * songComplexity (double assumed)
 * beakType (string assumed)
 * single constructor
 */
package PartI;

public class Passerine extends Bird{
    private double songComplexity;
    private String beakType;

    public Passerine(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType, boolean vertebrate, double nervousSystemComplexity, boolean canFly, double wingSpan, double songComplexity, String beakType) {
        super(name, scientificName, lifeSpan, isMobile, dietType, vertebrate, nervousSystemComplexity, canFly, wingSpan);
        this.songComplexity = songComplexity;
        this.beakType = beakType;
    }

    public double getSongComplexity() {
        return songComplexity;
    }
    public void setSongComplexity(double songComplexity) {
        this.songComplexity = songComplexity;
    }
    public String getBeakType() {
        return beakType;
    }
    public void setBeakType(String beakType) {
        this.beakType = beakType;
    }

    //snow-balling methods
    @Override
    public void describe() {
        super.describe();
        System.out.print(" [redacted] level, this is a Passerine.");
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", and it has a song complexity of " +
                Double.toString(songComplexity) +
                " complexity units, and it has a beak type of " +
                beakType;
    }
    //end of snow-balling methods
}