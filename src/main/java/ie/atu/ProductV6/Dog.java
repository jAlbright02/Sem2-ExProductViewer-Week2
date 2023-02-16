package ie.atu.ProductV6;

public class Dog extends Animal{

    boolean vaccination;
    private String shedding;
    private String neutered;

    public Dog() {

    }

    public boolean isVaccination() {
        return vaccination;
    }

    public void setVaccination(boolean vaccination) {
        this.vaccination = vaccination;
    }

    public String getShedding() {
        return shedding;
    }

    public void setShedding(String shedding) {
        this.shedding = shedding;
    }

    public String getNeutered() {
        return neutered;
    }

    public void setNeutered(String neutered) {
        this.neutered = neutered;
    }

    @Override
    public String toString() {
        return super.toString() +
                "vaccination=" + vaccination +
                ", shedding='" + shedding + '\'' +
                ", neutered='" + neutered + '\'' +
                '}';
    }
}
