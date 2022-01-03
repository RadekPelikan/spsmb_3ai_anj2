package _21y._11m._22d_25.cviceni.c1;

public class Usecka {
    public int delka;

    public Usecka(int delka) {
        this.delka = delka;
    }

    public void zobraz() {
        for (int i = 0; i < this.delka; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Ctverec a = new Ctverec(5);
        a.zobraz();
    }
}
