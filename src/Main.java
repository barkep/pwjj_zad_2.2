public class Main {

    public static void main(String[] args) {
        RownanieKwadratowe rk = new RownanieKwadratowe();
        rk.setA(10);
        rk.setB(100);
        rk.setC(30);
        System.out.println(rk.obliczY(10));
        System.out.println(rk.iloscPierwiastkow());
    }
}
