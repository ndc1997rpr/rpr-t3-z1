package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Imenik {

    private HashMap<String, TelefonskiBroj> mapa;


    public void dodaj(String ime, TelefonskiBroj broj){
        mapa.put(ime, broj);
    }

    public String dajBroj(String ime){
        return mapa.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj){
        Iterator it = mapa.entrySet().iterator();
        while(it.hasNext()){
            HashMap.Entry<String, TelefonskiBroj> pair = (HashMap.Entry<String, TelefonskiBroj>) it.next();

            if(pair.getValue().ispisi() == broj.ispisi()) {
                    return pair.getKey();

            }

        }
        return "";
    }

    public String naSlovo(char s){
        String ispis = "";
        Iterator it = mapa.entrySet().iterator();
        int i = 1;
        while(it.hasNext()){
            HashMap.Entry<String, TelefonskiBroj> pair = (HashMap.Entry<String, TelefonskiBroj>) it.next();

            if(pair.getKey().charAt(0) == s) {
                i++;
                ispis = i + "." + " " + pair.getKey() + " " + pair.getValue().ispisi() + "\n";
            }

        }

        return ispis;
    }

    public Set<String> izGrada(FiksniBroj.Grad g){

        Set<String> s = new TreeSet<String>();
        Iterator it = mapa.entrySet().iterator();
        while(it.hasNext()){
            HashMap.Entry<String, TelefonskiBroj> pair = (HashMap.Entry<String, TelefonskiBroj>) it.next();
            if(pair.getValue() instanceof FiksniBroj && ((FiksniBroj) pair.getValue()).getGrad() == g){
                s.add(pair.getKey());
            }
        }
        return s;
    }



}
