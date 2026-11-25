import java.util.ArrayList;
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
}
