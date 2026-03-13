package Qspiders;

public class CopyContructor {
    int i;
    int j;
    CopyContructor(int i, int j) {
        this.i=i;
        this.j=j;
    }
    CopyContructor(CopyContructor copyContructor) {
        this.i = copyContructor.i;
        this.j = copyContructor.j;
    }


    public static void main(String[] args) {
        CopyContructor cc = new CopyContructor(10,20);
        CopyContructor cc1 = new CopyContructor(cc);
        System.out.println(cc.i+ " "+ cc.j);
        System.out.println(cc1.i+ " "+cc1.j);
    }
}
