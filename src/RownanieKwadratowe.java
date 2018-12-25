public class RownanieKwadratowe {

    private int a;
    private int b;
    private int c;


    void setC(int c) {
        this.c = c;
    }

    void setA(int a) {
        this.a = a;
    }

    void setB(int b) {
        this.b = b;
    }

    int obliczY(int x) {
        return (a * ((int) Math.pow(x, 2))) + (b * x) + c;
    }

    int iloscPierwiastkow() {
        int d = (int) Math.pow(this.b, 2) - (4 * this.a * this.c);
        if (d < 0) {
            return 0;
        } else if (d == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}
