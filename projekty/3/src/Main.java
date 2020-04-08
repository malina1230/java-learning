public class Main {
    public static void main (String[] args)
    {
        int tab [] = new int[5];
        tab[0] = 6;
        tab[1] = 9;
        tab[2] = 2;
        tab[3] = 6;
        tab[4] = 4;

        for(int i = 0; i < tab.length; i++)
        {
            System.out.println("Dla pozycji " + i + " wartosc wynosi: " + tab[i]);
        }
        for(int i : tab)
        {
            System.out.println(i);
        }
        int n = 10;
        while(n > 0)
        {
            System.out.println("coś" + n);
            n--;
        }
        do {
            System.out.println("asd");
            n++;
        }
        while(n<5);
        {
            System.out.println("koniec");
        }

        int table[][] = {{2, 3, 4}, {1, 3, 5}};
        for(int i = 0; i < table.length; i++)
        {
            for(int j = 0; j < table[i].length; j++)
            {
                System.out.println(table[i][j]);
            }
        }
        for(int a = 5; a > 0; a--)
        {
            for(int p = 5; p < 10; p++) {
                System.out.println("Zmienna a: " + a + " Zmienna p: " + p);
            }
        }
    }
}
