package classes;

import interfaces.*;

public class Tomat extends Tanaman implements Perawatan
{
    public Tomat()
    {
        super(); 
        setMasaHidup(100);
        setBerbuah(100);
        setPerkembangan(25);
    }

    public void berkembang()
    {
        setProsesBerbuah(getProsesBerbuah() + getPerkembangan());
        if(getProsesBerbuah() >= getBerbuah())
        {
            setBuah(getBuah() + 1);
            setProsesBerbuah(getProsesBerbuah() - getBerbuah());
            return;
        }       
    }

    public void treatment()
    {
        setPerkembangan(getPerkembangan() + 0.05);   
    }
}
