package PracticeQuestions;

public class useOfThis {
    String name;
    int age;
    static int num;

    public boolean SetNameAndAge(String sdnkjfn, int dfjkgef) {
        this.name = sdnkjfn;
        this.age = dfjkgef;

        return false;
    }

    public void PrintNameAndAge() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
