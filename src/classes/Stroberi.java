package classes;

import interfaces.*;

public class Stroberi extends Tanaman implements Perawatan
{
    public Stroberi()
    {
        setMasaHidup(60);
        setBerbuah(150);
        setPerkembangan(35);
    }

    public void berkembang()
    {
        if(getProsesBerbuah() >= getBerbuah())
        {

            setBuah(getBuah() + 1);
            setProsesBerbuah(getProsesBerbuah() - getBerbuah());
        }
        setProsesBerbuah(getProsesBerbuah() + getPerkembangan());
    }

    public void treatment()
    {
        setPerkembangan(getPerkembangan() + 5);   
    }
}
