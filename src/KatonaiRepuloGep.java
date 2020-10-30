public class KatonaiRepuloGep extends Repulogep implements IFreighter, IPassenger{
    public KatonaiRepuloGep(int azonosito, int tankMeret) {
        super(azonosito, tankMeret);
    }

    @Override
    public double csomagokSulya() {
        return 155;
    }

    @Override
    public int utasokSzama() {
        return 15;
    }
}
