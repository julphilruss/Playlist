import java.util.ArrayList;
public class Song
{
    public String Kuenstler;
    public String Titel;
    public float Dauer; //in sec

    public Song(String Kuenstler, String Titel, float Dauer)
    {
        this.Kuenstler = Kuenstler;
        this.Titel = Titel;
        this.Dauer = Dauer;
    }
    
    public String getTitel() {
        return Titel;
    }
    
    public String getKuenstler() {
        return Kuenstler;
    }
    
    public float getDauer() {
        return Dauer;
    }
    
    public String all() {
        return Titel + " von " + Kuenstler+ " (Dauer in Min: " + Dauer / 60+")";
    }
}
