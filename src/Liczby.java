import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Liczby {
    ArrayList<Integer> liczby;

    public Liczby(int ile,int poczatek, int koniec){

        liczby = new ArrayList<>();
        Random random = new Random();
        for (int i =0;i <ile;i++){
            liczby.add(random.nextInt(poczatek, koniec+1));
        }
    }

    public Liczby(ArrayList<Integer> liczby){
        this.liczby=liczby;
    }

    public double srednia(){
        if(liczby.size()==0){
            return 0;
        }
        int wynik=0;
        for(int i=0; i < liczby.size();i++){
            wynik= wynik+ liczby.get(i);
        }

        return wynik/(double)liczby.size();
    }
        public double mediana(){
        if(liczby.size()==0){
            return 0; //skibidi
        }
            Collections.sort(liczby);
            if(liczby.size()%2==0){
                int srodek = liczby.size()/2;
                return (double)(liczby.get(srodek)+liczby.get(srodek-1))/2;
            }else{
                return liczby.get(liczby.size()/2);
            }
        }
        private int ileRazyWystapilo(int element){
            int ile =0;
            for (int i = 0; i < liczby.size(); i++) {
                if(liczby.get(i)==element){
                    ile++;
                }
            }
            return ile;
        }
        public ArrayList<Integer> Listadominanta(){
            ArrayList<Integer> dominanty = new ArrayList<>();
            int najwiecejRazy=0;
            HashSet<Integer>liczbyBezPowtorzen = new HashSet<>(liczby);
           for (Integer element: liczbyBezPowtorzen){
                if(najwiecejRazy<ileRazyWystapilo(element)){
                    najwiecejRazy=ileRazyWystapilo(element);
                    dominanty.clear();
                    dominanty.add(element);
                }
           }

            return dominanty;
        }
}
