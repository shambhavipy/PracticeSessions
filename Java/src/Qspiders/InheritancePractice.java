package Qspiders;

public class InheritancePractice {
    void eat() {
        System.out.println("Animal eating");
    }

    public static void main() {
        Dog d = new Dog();
        d.bark();
        d.eat();
        cat c = new cat();
        c.sound();
        c.eat();
        BabyDog bd = new BabyDog();
        bd.weep();
        bd.eat();
        bd.bark();
    }

}

class Dog extends InheritancePractice {
    void bark() {
        System.out.println("Bhau bhau");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("Weeping");
    }
}

class cat extends InheritancePractice {
    void sound() {
        System.out.println("Meowwww");
    }
}


