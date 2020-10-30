public class CsomagSzallitoRepulo extends Repulogep implements IFreighter{
    public CsomagSzallitoRepulo(int azonosito, int tankMeret) {
        super(azonosito, tankMeret);
    }

    @Override
    public double csomagokSulya() {
        return 155;
    }
}
