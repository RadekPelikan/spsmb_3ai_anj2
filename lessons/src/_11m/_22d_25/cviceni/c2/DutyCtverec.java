package _11m._22d_25.cviceni.c2;

import _11m._22d_25.cviceni.c1.Usecka;

public class DutyCtverec extends Usecka {
    public DutyCtverec(int strana) {
        super(strana);
    }

    @Override
    public void zobraz() {
        super.zobraz();
        System.out.println();
        for (int i = 0; i < delka - 2; i++) {
            for (int j = 0; j < delka; j++) {
                System.out.print(j == 0 || j == delka - 1 ? '*' : ' ');
            }
            System.out.println();
        }
        super.zobraz();
    }

    public static void main(String[] args) {
        DutyCtverec a = new DutyCtverec(4);
        a.zobraz();
    }
}
