package ru.ibs;
import java.io.*;
public class App2
{
    public static void main( String[] args ) {
        App2 app2 = new App2();

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.print(app2.converter(text));
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }



    public  String converter(String text) {
        if ((Integer.parseInt(text) % 3 == 0) && (Integer.parseInt(text) % 5 == 0))
            return "FizzBuzz" + "\n";
        else if (Integer.parseInt(text) % 3 == 0)
            return "Fizz" + "\n";
        else if (Integer.parseInt(text) % 5 == 0)
            return "Buzz" + "\n";
        else
            return text + "\n";
    }

}