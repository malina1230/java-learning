import java.util.Scanner;

public class Main
{
    public static void main (String args[])
    {
        int a = 10;
         if (a < 10)
         {
             System.out.println("4<5");
         }
         else if (a == 10)
         {
             System.out.println("a = 10");
         }
         else
         {
             System.out.println("a > 10");
         }

         int b = 6;

         switch (b)
         {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
             default:
                 System.out.println("default");
         }

         int c = 9;
         int d;
         d = c < 10 ? -1 : 1;    //jeżeli c < 10 to przypisz d wartość -1, w przeciwnym razie -1
        System.out.println(d);

        for(int i = 0; i < 10; i++)
        {
            System.out.print(i + " ");
            if(i == 5)
            {
                break;
            }
        }

        for(int i = 0; i < 10; i++)
        {
            if(i % 2 == 0) continue;
            System.out.println(i + " ");
        }

        Scanner scanner = new Scanner(System.in);
        String name;
        name = scanner.next();

        System.out.println(name);
    }
}
