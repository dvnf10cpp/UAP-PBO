package classes;

import interfaces.*;

public class Persik extends Tanaman implements Perawatan
{
    public Persik()
    {
        super(); 
        setMasaHidup(180);
        setBerbuah(250);
        setPerkembangan(15);   
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
        setPerkembangan(getPerkembangan() + 2.5);      
    }
}
