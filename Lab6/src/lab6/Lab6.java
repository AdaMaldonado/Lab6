/*
Ada Maldonado
11-15-2020

This program is to compute the letter grade for the course CISC 3130. The user will put their name and scores for each assignment, 
in which the program will compute the overall grade for the student.
 */

package lab6;
//The Scanner class is to scan the input from the user (interactively) and the PrintStream class is to print the output into a text file.
import java.util.Scanner;
import java.io.PrintStream;

public class Lab6 {

    public static void main(String[] args) throws Exception{
        //The 2 classes are being used for input and output.
        Scanner input = new Scanner(System.in);
        PrintStream output = new PrintStream("output.txt");
        
        //Ask for the emplid from the student to idenitfy.
        System.out.print("Last 4 digits of EMPLID: ");
        String emplid = input.nextLine();
        System.out.println();
        
        //Ask for each score of the student's practice problems.
        System.out.print("Score for Practice Problem 1: ");
        int pp1 = input.nextInt();
        System.out.print("Score for Practice Problem 2: ");
        int pp2 = input.nextInt();
        System.out.print("Score for Practice Problem 3: ");
        int pp3 = input.nextInt();
        System.out.print("Score for Practice Problem 4: ");
        int pp4 = input.nextInt();
        System.out.print("Score for Practice Problem 5: ");
        int pp5 = input.nextInt();
        System.out.print("Score for Practice Problem 6: ");
        int pp6 = input.nextInt();
        System.out.println();
        
        //Ask for each score of the student's lab assignment.
        System.out.print("Score for Lab 1: ");
        int l1 = input.nextInt();
        System.out.print("Score for Lab 2: ");
        int l2 = input.nextInt();
        System.out.print("Score for Lab 3: ");
        int l3 = input.nextInt();
        System.out.print("Score for Lab 4: ");
        int l4 = input.nextInt();
        System.out.println();
        
        //Ask for each score of the midterm exams.
        System.out.print("Score for Midterm 1: ");
        int m1 = input.nextInt();
        System.out.print("Score for Midterm 2: ");
        int m2 = input.nextInt();
        System.out.println();
        
        //Total score for the student.
        int total = pp1 + pp2 + pp3 + pp4 + pp5 + pp6 
                + l1 + l2 + l3 + l4 + m1 + m2;
        
        //This is the max score that the student can reach to currently.
        final int MaxPoints = 59;
        
        //Computes number grade of the student.
        double numberGrade = (double)total/(double)MaxPoints * 100;
        String letterGrade;
        
        //Determines the letter grade according to the grading system of the course.
        if (numberGrade >= 90){
            letterGrade = "A";
        } else if (numberGrade >= 80){
            letterGrade = "B";
        } else if (numberGrade >= 70){
            letterGrade = "C";
        } else if (numberGrade >= 60){
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }//end else
        
        //Shows the student their grade.
        System.out.println("MY9-" + emplid + " letter grade is " + letterGrade);
        
        //Displays the practice problem scores on a file.
        output.println("MY9-" + emplid + " Practice Problem Scores");
        output.println("PP1\tPP2\tPP3\tPP4\tPP5\tPP6");
        output.println(pp1 + "\t" + pp2 + "\t" + pp3 + "\t" + pp4 + "\t" + pp5 + "\t" + pp6);
        
        //Displays the lab scores on a file.
        output.println();       
        output.println("MY9-" + emplid + " Lab Scores");
        output.println("L1\tL2\tL3\tL4");
        output.println(l1 + "\t" + l2 + "\t" + l3 + "\t" + l4);
        
        //Displays the midterm scores on a file.
        output.println();        
        output.println("MY9-" + emplid + " Midterm Scores");
        output.println("M1\tM2");
        output.println(m1 + "\t" + m2);
        output.println();
        
        //Displays the letter grade on a file.
        output.println("MY9-" + emplid + " letter grade is " + letterGrade);
        
    }//end main    
}//end class
