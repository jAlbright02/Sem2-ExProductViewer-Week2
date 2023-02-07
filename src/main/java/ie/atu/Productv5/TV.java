package ie.atu.Productv5;

public class TV extends Product {

    private int screenSize;
    private String manufacture;

    public TV() {
        super();
        screenSize = 0;
        manufacture = "";
        count++;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {return super.toString() + " by " + manufacture + "\nScreen size is " + screenSize +  "\"\n";}
}
