package min.and.max;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class MinAndMax
{
    
    public static void main(String[] args)
    {   
int num = 0;
int max = input.nextInt(); 
int min = input.nextInt();

do {
    String userInputString;
        userInputString = JOptionPane.showInputDialog("Enter integers followed by a space to find a minimum and maximum: (The input ends if you enter 0)");
Scanner scan;
    scan = new Scanner(System.in);
String userInput = scan.nextLine();
    int parseInt = Integer.parseInt(userInput);
} while (num != 0); 

     
    if (num > max)
    max = num;
 while (num !=0) 
    
    
    if (num < min)
        min = num;

JOptionPane.showConfirmDialog(null, "Would you like to enter more numbers?");

 System.out.println("Maximum is " + max + "Minimum is" + min);

     
  }
}

 
    

