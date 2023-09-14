package lab02.ex3;

public class Main {
    public static void main(String[] args) {
        ElectricLamp electricLamp = new ElectricLamp();
        SwitchButton switchButton = new SwitchButton();

        // Connect the switch button to the lamp
        switchButton.connectToLamp(electricLamp);
        for (int i = 0; i < 10; i++) {
            switchButton.switchOn();
            switchButton.switchOff();
        }
    }
}
