public class Calculator {

    public int topla(int... deger) {
        int topla = 0;
        for (int arg : deger) {
            topla += arg;
        }
        return topla;
    }

    public int cikar(int x, int y) {
        int hsp = x - y;
        return hsp;
    }

    public int carpma(int... deger) {
        int hsp2 = 1;
        for (int arg2 : deger) {
            hsp2 *= arg2;
        }
        return hsp2;
    }

    public double bolme(int bolunen, int bolen) {
        double hsp3 = bolunen / bolen;
        return hsp3;
    }

}
