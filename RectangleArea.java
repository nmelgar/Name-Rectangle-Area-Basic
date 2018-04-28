/*
* This program gets the area of a rectangle
*/
import java.util.Scanner;
    
public class RectangleArea {
      
    /** 
    *The program starts in the main function
    *@param args the command line arguments
    */
    
    public static void main (String[] args){
        
        //print out the welcome message
        System.out.println();
        System.out.println("This program calculates the area of a rectangle");
        
        // prompt to enter the user name
        System.out.println("\nPlease enter your name:");
        
        // create an input file for the console
        Scanner inFile;
        inFile = new Scanner(System.in);
        
        // read the value  of the next line typed in the console
        String name = inFile.nextLine();
        
        // prompt to enter the size of the length
        System.out.println("\nEnter the length");
        
        // get the value entered for the lenght
        double rectangleLength = inFile.nextDouble();
            
        // prompt to enter the size of the width
        System.out.println("\nEnter the width");
        
        // get the value entered for the width
        double rectangleWidth = inFile.nextDouble();
        
        // get the result of width times length
        double rectangleFinal = rectangleWidth * rectangleLength;
        
        // display area of the rectangle on M2
        System.out.println("\n**********************************************"
                          + "****************************");
        System.out.println("\t" + name
                          + ", The area is: " + rectangleFinal
                          + " M2");
        System.out.println("**********************************************"
                          + "****************************\n");
    }
}