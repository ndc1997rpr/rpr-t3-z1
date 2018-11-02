package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj{

    private String broj;
    private int mobilnaMreza;

    public MobilniBroj(int mobilnaMreza, String broj){
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    @Override
    public String ispisi(){
        String ispis = "";
        ispis = "0" + mobilnaMreza + "/" + broj ;
        return ispis;
    }

    @Override
    public int hashCode(){
        return ispisi().hashCode();
    }

}
