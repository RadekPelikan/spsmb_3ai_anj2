package _21y._11m._22d_25.cviceni.c1;

public class Ctverec extends Usecka {

    public Ctverec(int strana) {
        super(strana);
    }

    @Override
    public void zobraz() {
        for (int i = 0; i < this.delka; i++) {
            super.zobraz();
            System.out.println();
        }
    }
}
