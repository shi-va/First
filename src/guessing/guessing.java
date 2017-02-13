
package guessing;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author cstuser
 */
public class guessing {
    static Scanner console=new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException 
    {
        int guessednumber;
        int guessednumber1;
        int guessednumber2;
        int guessednumber3;
        int guessednumber4;
        
        Scanner inFile=new Scanner(new FileReader("input.txt"));
        int value=inFile.nextInt();
        inFile.close();
        
        System.out.println("Guess the value in the file:" );
        guessednumber=console.nextInt();
        if  (guessednumber<value)
        {
            System.out.println("The value is greater than "+ guessednumber + ", guess again:" );
        }
        else if (guessednumber>value) 
        {
            System.out.println("The value is less than "+ guessednumber + ", guess again:" );
        }
        else //if (guessednumber==value)  
          {
              System.out.println("Congratulation, you got it!" );
              System.exit(0);
          }
        guessednumber1=console.nextInt();
        if  (guessednumber1<value)
        {
            System.out.println("The value is greater than "+ guessednumber1 + ", guess again:" );
        }
        else if (guessednumber1>value) 
        {
            System.out.println("The value is less than "+ guessednumber1 + ", guess again:" );
        }
        else //if (guessednumber1==value)  
          {
              System.out.println("Congratulation, you got it!" );
              System.exit(0);
          }
        guessednumber2=console.nextInt();
        if  (guessednumber1<value)
        {
            System.out.println("The value is greater than "+ guessednumber2 + ", guess again:" );
        }
        else if (guessednumber2>value) 
        {
            System.out.println("The value is less than "+ guessednumber2 + ", guess again:" );
        }
        else //if (guessednumber2==value)  
          {
              System.out.println("Congratulation, you got it!" );
              System.exit(0);
          }
        guessednumber3=console.nextInt();
        if  (guessednumber3<value)
        {
            System.out.println("The value is greater than "+ guessednumber3 + ", guess again:" );
        }
        else if (guessednumber3>value) 
        {
            System.out.println("The value is less than "+ guessednumber3 + ", guess again:" );
        }
        else //if (guessednumber3==value)  
          {
              System.out.println("Congratulation, you got it!" );
              System.exit(0);
          }
        guessednumber4=console.nextInt();
        if  (guessednumber4<value)
        {
            //System.out.println("The value is greater than "+ guessednumber4 + ", guess again:" );
            System.out.println("You lost" );
        }
        else if (guessednumber4>value) 
        {
           // System.out.println("The value is less than "+ guessednumber4 + ", guess again:" );
            System.out.println("You lost" );
        }
        else //if (guessednumber4==value)  
          {
              System.out.println("Congratulation, you got it!" );
              System.exit(0);
          }
                  
    }
    
    
}
