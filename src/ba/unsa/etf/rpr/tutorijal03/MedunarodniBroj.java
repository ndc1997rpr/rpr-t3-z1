package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj{

    private String drzava;
    private String broj;

    public MedunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }

    @Override
    public String ispisi(){
        String ispis = "";
        ispis = "0" + drzava + "/" + broj;
        return ispis;
    }

    @Override
    public int hashCode(){
        return  ispisi().hashCode();
    }


}

