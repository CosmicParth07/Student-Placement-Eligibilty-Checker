
public abstract class PlacementCriteria {

    protected String companyName;
    protected double minimumCgpa;
    protected double minimumTenth;
    protected double minimumTwelfth;
    protected int maximumBacklogs;

    public abstract boolean checkEligibility(Student student);

    public abstract void displayCriteria();
}
