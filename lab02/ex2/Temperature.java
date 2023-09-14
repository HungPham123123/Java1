package lab02.ex2;

public class Temperature {
    private double cTemp;

    public Temperature() {
        this.cTemp = 0.0;
    }

    public Temperature(double c) {
        this.cTemp = c;
    }

    public double getCtemp() {
        return cTemp;
    }

    public void setCtemp(double c) {
        this.cTemp = c;
    }

    public double getFTemp() {
        return (cTemp * 9 / 5) + 32;
    }

    public double getKTemp() {
        return cTemp + 273.15;
    }
}
