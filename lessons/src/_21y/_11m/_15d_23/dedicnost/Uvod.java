package _21y._11m._15d_23.dedicnost;
//Dědičnost - možnost přidat k bázové třídě,
// základní třídě, rodičovské třídě, supertřídě, rodiči, předkovi
// další vlastnosti a odvodit tak další (zděděnou) třídu, resp.
// potomka, resp. dceřinnou třídu.
public class Uvod {

    public static void main(String[] args) {
        Block a = new Block(2, 4, 6);
        System.out.println(a.getDiagonal());
    }
}
