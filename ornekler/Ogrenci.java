package ornekler;

public class Ogrenci implements Insan,Sporcu {

    @Override
    public String konus() {
        return "İnsan konuşuyor.";
    }

    @Override
    public String kos() {
        return "Sporcu koşuyor.";
    }
}
