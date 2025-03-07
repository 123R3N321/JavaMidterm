package PartI;

/**
 * extends lifeform
 * data members:
 *  isMobile
 *  dietType
 *
 * notes:
 * should still be abstract,
 * snow-ball describe() and getDetails()
 */
public class Animal extends Lifeform {
    //private members:
    private boolean isMobile;
    private String dietType;    //non-specified type, string is easy.
    //private ends here

    //protected constructor, disable incomplete initialization
    //because getDetails() relies on all details being available
    public Animal(String name, String scientificName, double lifeSpan, boolean isMobile, String dietType) {
        super(name, scientificName, lifeSpan);
        this.isMobile = isMobile;
        this.dietType = dietType;
    }
    //protected constructor end here

    //public methods

    //setter-getter pairs, 4 methods in total
    public boolean isMobile() {
        return isMobile;
    }
    public void setMobile(boolean mobile) {
        isMobile = mobile;
    }

    public String getDietType() {
        return dietType;
    }
    public void setDietType(String dietType) {
        this.dietType = dietType;
    }
    //getter-setter pairs end here


    //snow-balling methods
    @Override
    public void describe() {
        System.out.print("At kingdom level, this animal is called" + getName() +
                ", " +
                ", with scientific name " +
                getScientificName());//simply print more after this
    }

    @Override
    public String getDetails() {
        return super.getDetails()+", and "+
                ((isMobile)?"it is mobile":"it is immobile")+
                " and it eats "+
                dietType;
    }
}