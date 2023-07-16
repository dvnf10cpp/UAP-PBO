package classes;

public abstract class Tanaman 
{
    private int masaHidup;    
    private int lamaHidup;
    private int berbuah;
    private int buah;
    private double perkembangan;
    private double prosesBerbuah;

    public Tanaman()
    {
        setLamaHidup(0);
        setProsesBerbuah(0);
        setBuah(0);
    }

    public abstract void berkembang();

    public void tambahLamaHidup()
    {
        setLamaHidup(getLamaHidup() + 1);
    }

    public String status()
    {
        return (lamaHidup >= masaHidup ? "Mati" : "Hidup");
    }

    public boolean isAlive()
    {
        return status().equals("Hidup");
    }

    public String toString()
    {
        return String.format(
            "Masa Hidup      : %d\n" + 
            "Lama Hidup      : %d\n" + 
            "Buah Dihasilkan : %d buah %s\n" + 
            "Status          : %s",
            getMasaHidup(), getLamaHidup(), getBuah(), this.getClass().getName(),status() 
        );
    }

    public int getMasaHidup() {
        return masaHidup;
    }

    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }

    public int getBerbuah() {
        return berbuah;
    }

    public void setBerbuah(int berbuah) {
        this.berbuah = berbuah;
    }

    public int getBuah() {
        return buah;
    }

    public void setBuah(int buah) {
        this.buah = buah;
    }

    public double getPerkembangan() {
        return perkembangan;
    }

    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }

    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }
}
