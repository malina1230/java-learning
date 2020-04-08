import java.util.Scanner;

public class Zadanie
{
    public static void main (String args[])
    {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        System.out.print("c = ");
        c = scanner.nextInt();

        if(a < b + c || b < a + c || c < a + b)
        {
            System.out.println("Z tych boków można zbudować trójkąt.");
        }
        else
            System.out.println("Nie można zbudować trójkąta.");
    }
}
