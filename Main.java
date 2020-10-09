import java.util.Scanner;
/**
 *This program determines the correct order for two numbers the user inputs and outputs them in ascending order
 * @author Khazina 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create the scanner for user input 
    Scanner input = new Scanner (System.in);

    //Ask user to enter an integer
    System.out.println("Please enter an integer:");

    //Store user input as variable 
    int a = input.nextInt();

    //Ask user to enter a second integer
    System.out.println("Please enter another integer:");

    //Store user input as varible 
    int b = input.nextInt();

    //If statments that decide which order to display users input
    if (a < b){
      System.out.println("Your numbers in ascending order are " + a + (", ") + b);
    }
    if (a > b){
      System.out.println("Your numbers in ascending order are " + b + (", ") + a);
    }
    if (a == b){
      System.out.println("Your numbers in ascending order are " + a + (", ") + b);
    }
  }
}
