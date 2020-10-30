import java.util.ArrayList;

public class Repulogepek {
    public Repulogepek() {
        CsomagSzallitoRepulo csr = new CsomagSzallitoRepulo(1,200);
        UtasSzallitoRepulo uszr = new UtasSzallitoRepulo(2,300);
        KatonaiRepuloGep krg = new KatonaiRepuloGep(3,400);
        ArrayList<Repulogep> repulogepArrayList = new ArrayList<>();
        repulogepArrayList.add(csr);
        repulogepArrayList.add(uszr);
        repulogepArrayList.add(krg);

        int max = 0;
        for (int i = 1; i < repulogepArrayList.size(); i++) {

            if (max < repulogepArrayList.get(i).getTankMeret()){
                max = repulogepArrayList.get(i).getTankMeret();
            }

        }
        System.out.println("A lenagyobb tankméret: "+ max);
    }

    public static void main(String[] args) {
        Repulogepek asd = new Repulogepek();

    }
}
