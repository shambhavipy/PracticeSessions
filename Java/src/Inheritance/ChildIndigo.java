package Inheritance;

public class ChildIndigo extends ParentAirCraft {

    public static void main(String[] args) {

        ChildIndigo c = new ChildIndigo();
        c.engine();
        c.safetyGuidelines();
        c.Aircraftcolor();

    }

    public void Aircraftcolor() {
        System.out.println("Blue & while is the body color");
    }

}