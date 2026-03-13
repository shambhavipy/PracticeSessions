package Qspiders.Encapsulation;

public class TestE {
    public static void main() {
        gsE encap = new gsE(10,20);
        System.out.println(encap.getI());
        System.out.println(encap.getJ());
        encap.setI(100);
        encap.setJ(200);
        System.out.println(encap.getI());
        System.out.println(encap.getJ());
    }
}
