import java.util.InputMismatchException;
import java.util.Scanner;
public class FizzBuzz
{
    public static void main(String[] args)
    {
        FizzBuzz fizzbuzz = new FizzBuzz();
        int Fizz = fizzbuzz.Fizz_Buzz(0, "Fizz");
        int Buzz = fizzbuzz.Fizz_Buzz(Fizz, "Buzz");

        for(int z = 1; z <= 100; z++)
        {
            System.out.print(z + " ");
            if (z % Fizz == 0)
            {
                System.out.print("Fizz");
            }
            if (z % Buzz == 0)
            {
                System.out.print("Buzz");
            }
            System.out.print("\n");
            if (z % 10 == 0)
            {
                System.out.print("\n");
            }
        }
    }

    public int Fizz_Buzz(int F, String buzzfizz)
    {
        Scanner key = new Scanner(System.in);
        int z = 0;
        System.out.print("Enter " + buzzfizz + " number. (1-100) - ");
        do
        {
            try
            {
                z = key.nextInt();
                if (z < 1)
                {
                    System.out.println("Number is out of range.");
                }
                else if (z == F)
                {
                    System.out.println("Fizz and Buzz numbers should be different.");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("That's not a number...");
            }
        }while(z < 1 || z > 100 || z == F);
        return z;
    }
}
