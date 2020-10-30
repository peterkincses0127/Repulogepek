public class UtasSzallitoRepulo extends Repulogep implements IPassenger{


    public UtasSzallitoRepulo(int azonosito, int tankMeret) {
        super(azonosito, tankMeret);
    }

    @Override
    public int utasokSzama() {
        return 166;
    }
}
