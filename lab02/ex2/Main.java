package lab02.ex2;

public class Main {
    public static void main(String[] args) {
        Temperature temp = new Temperature(25.0);

        System.out.println("FTemp: " + temp.getFTemp() + "°F");
        System.out.println("KTemp: " +temp.getKTemp() + "K");
    }
}
