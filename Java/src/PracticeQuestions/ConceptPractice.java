package PracticeQuestions;

abstract class ConceptPractice {

    public void method1() {
        System.out.println("Hi");
    }
    abstract void methods2();
    int member1;
}

class Childsession extends ConceptPractice {
    @Override
    void methods2() {
        System.out.println("hello");
    }
}

class test{
    public static void main() {
        ConceptPractice cp = new Childsession();
        cp.method1();
        cp.methods2();
    }
}

