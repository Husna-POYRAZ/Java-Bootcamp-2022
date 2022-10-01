public class BaseKrediManager {
    public double hesapla(double tutar) {
        return tutar * 1.18;
    }
    public final void mesaj() {
        System.out.println("Bu method overriding edilemez.");
    }
}
