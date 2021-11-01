package ru.ibs;
import java.io.*;
public class App2
{
    public static void main( String[] args )
    {

        try(BufferedReader reader = new BufferedReader(new FileReader(args[0])))
        {
            // читаем посимвольно
            String text;
            while((text=reader.readLine())!=null){
                if ((Integer.parseInt(text) % 3 == 0) && (Integer.parseInt(text) % 5 == 0))
                    System.out.print("FizzBuzz"+ "\n");
                else
                if (Integer.parseInt(text) % 3 == 0)
                System.out.print("Fizz" + "\n");
                else
                if (Integer.parseInt(text) % 5 == 0)
                    System.out.print("Buzz" + "\n");
                else

                    System.out.print(text+ "\n");
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}