import java.util.Scanner;
public class Main
{
   public static int getRandomDiceNumber(int sides)
   {
      return (int) (Math.random() * sides) + 1;
   }

   public static void main(String[] args)
   {
    int sides = 6;
    int i = 100; // Большое значение чтобы смогли проверить на ошибки при выводе
    System.out.println("Start");
    if (sides == 2) //Что мы делаем, если кидаем монетку
    {
        System.out.println("Throw coin");
        i = getRandomDiceNumber(sides);
        if (i == 1) 
            {System.out.println("Heads");}
        else 
            {System.out.println("Tails");}
        
    }
    else{
        System.out.println("Roll the dice");
        i = getRandomDiceNumber(sides);
        System.out.println("Your answer is " + i);
    }
   }
}
