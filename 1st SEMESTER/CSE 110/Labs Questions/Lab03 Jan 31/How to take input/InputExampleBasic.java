// Scanner is only required for taking input
// do not write scanner in a program where 
// there is no input
import java.util.Scanner;
public class InputExampleBasic1
{  
    public static void main (String[] args)
    {   
        // you can use any other meaningful 
        // variable name instead of "keyboard"
        Scanner keyboard; 
        keyboard = new Scanner ( System.in );
        // "System.in" is default input device for 
        // our computer system
        
        System.out.println("Please enter an integer number"); //prompt
        int x; 
        x = keyboard.nextInt();    // flowchart equivalent is READ x 
        
        System.out.println(x);
    }
}