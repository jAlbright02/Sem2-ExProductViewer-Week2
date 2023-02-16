package ie.atu.ProductV6;

public class Dog extends Animal{

    private boolean vaccination;
    private boolean shedding;
    private boolean neutered;

    public Dog() {

    }

    public boolean isVaccination() {
        return vaccination;
    }

    public void setVaccination(boolean vaccination) {
        this.vaccination = vaccination;
    }

    public boolean getShedding() {
        return shedding;
    }

    public void setShedding(boolean shedding) {
        this.shedding = shedding;
    }

    public boolean getNeutered() {
        return neutered;
    }

    public void setNeutered(boolean neutered) {
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
