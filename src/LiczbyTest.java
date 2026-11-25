import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LiczbyTest {

    @Test
    void sredniaTestJezeliZeroElementowWTablicy() {
        Liczby liczby = new Liczby(0,1,2);
        Assertions.assertEquals(0,liczby.srednia());
    }
    @Test
    void sredniaTestJezeliWszystkieElementyRowne(){
        Liczby liczby= new Liczby(new ArrayList<>(List.of(5,5,5)));
        Assertions.assertEquals(5,liczby.srednia());
    }
    @Test
    void sredniaTestJezeliWynikCalkowity(){
        Liczby liczby = new Liczby(new ArrayList<>(List.of(2,4)));
        Assertions.assertEquals(3,liczby.srednia());
    }
    @Test
    void sredniaTestJezeliWynikRzeczywisty(){
        Liczby liczby = new Liczby(new ArrayList<>(List.of(2,5)));
        Assertions.assertEquals(3.5,liczby.srednia());
    }
    @Test
    void medianaTestJezeliParzystaDlugoscTablicy(){
        Liczby liczby = new Liczby(new ArrayList<>(List.of(1,2,0,4)));
        Assertions.assertEquals(1.5,liczby.mediana());

    }
    @Test
    void medianaTestJezliNieParzystaDlugoscTablicy(){
        Liczby liczby = new Liczby(new ArrayList<>(List.of(1,2,0,4,5)));
        Assertions.assertEquals(2,liczby.mediana());
    }
    @Test
    void medianaTestJezliPustaTablicy(){
        Liczby liczby = new Liczby(new ArrayList<>(List.of()));
        Assertions.assertEquals(0,liczby.mediana());
    }
}