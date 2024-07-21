/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;

/**
 *
 * @author Thabelo
 */
import java.util.Scanner;
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner user_input=new Scanner(System.in);
        int marks;
        marks=user_input.nextByte();
        if(marks<30){
            System.out.println("Level 1 - Not Achieved");
        }
        else if (marks<40){ 
            System.out.println("Level 2 - Elementary Achievement");
        }
        else if (marks<50){
            System.out.println("Level 3 - Moderate Achievement");
        }
        else if (marks<60){
            System.out.println("Level 4 - Adequate Achievement");
        }
        else if(marks<70){
            System.out.println("Level 5 - Substantial Achievement");
        }
        else if(marks<80){
            System.out.println("Level 6 - Meritorious Achievement");
        }
        else{ 
            System.out.println("Level 7 - Outstanding Achievement");
        }
        // TODO code application logic here
    }
    
}
