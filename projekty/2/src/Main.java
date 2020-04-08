/**
 * Created by Tomasz on 19.03.2020
 */

//Klasa Main


public class Main
{
    // Typy liczbowe
    //

    byte b = 127;  // byte przechowuje od -128 do 127 tylko int
    short s = 32767; // short przechowuje od -32768 do 32767
    int i = -2147483648; // int od -2147483648 do 2147483647
    long l = 9223372036854775807l; // ważne że long zawsze kończymy charem "l"
    float f = 3.444444f; // kończymy f zakres -3,4*10^38 do 3,4*10^38
    double d = 3.777654545656345645; // nie trzeba kończyć charem

    //Typy znakowe
    //
    char c = 'a'; // tylko jedna litera(reprezentowane w unicode)
    String string = "Dowolny tekst"; // typ piszemy dużą literą


    public static void main (String[] args)
    {
        int wynik, wynik1, wynik2, wynik3, wynik4;
        int l1 = 56;
        int l2 = 16;
        byte b1 = 127;
        wynik = l1 + l2;
        wynik1 = l1 - l2;
        wynik2 = l1 * l2;
        wynik3 = l1 / l2;
        wynik4 = l1 % l2;
        System.out.println("Wynik dodawania = " + wynik);
        System.out.println("Wynik odejmowania = " + wynik1);
        System.out.println("Wynik mnożenia = " + wynik2);
        System.out.println("Wynik dzielenia = " + wynik3);
        System.out.println("Wynik modulo = " + wynik4);
        wynik4++;;
        System.out.println(("Inkrementacja: " + wynik4));
        wynik4--;
        System.out.println(("Dekrementacja: " + wynik4));
        b1++; // Inkrementacja maksymalnej wartości dla byte
                // spowoduje zatoczenie pętli i zwróci wartość -128
        System.out.println(b1);
    }
}
