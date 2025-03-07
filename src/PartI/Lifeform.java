package PartI;

/**
 * Abstract class
 * common attri: name, scientificName, lifespan
 * Abstract method: describe()
 * Concrete method: getDetails()
 * <p>
 * notes:
 * must implement comparable to allow sorting
 */
public abstract class Lifeform{
    //private all data members
    private String name;
    private String scientificName;
    private double lifeSpan;    //type not specified. Use double.
    //private ends here

    //protected constructors, since this is abstract class
    protected Lifeform() {
    }  //leave empty constructor for modability

    protected Lifeform(String name, String scientificName, double lifeSpan) {
        this();
        this.name = name;
        this.scientificName = scientificName;
        this.lifeSpan = lifeSpan;
    }

    //protected ends here


    //public methods
//    //implement comparable
//    public int compareTo(Lifeform a) {
//        return Double.compare(this.lifeSpan, a.lifeSpan);
//    }


    //getter-setter pairs, 6 methods in total
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public double getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(double lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    //abstract method, implied NOT for Lifeform data members
    public abstract void describe();

    //non-specified getter, I just did some arbitrary thing here.
    public String getDetails() {
        return "Common name: " + this.name + "\tScientific Name: " + this.scientificName;
    }

    //public methods end here

}