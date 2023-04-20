import java.util.Scanner;

public class Assignment4 {
   
    public static void main(String[] args) {


//1. This ask's the user to input and set the variables for the three scores
Scanner test = new Scanner(System.in);

System.out.println("Please enter a test score (1)");
int test1 = test.nextInt();

System.out.println("Please enter a test score (2)");
int test2 = test.nextInt();

System.out.println("Please enter a test score (3)");
int test3= test.nextInt();


test.close();

//This int variable is the test scores average
int testavg = (test1 + test2 + test3)/3;

// This if statement is only executed if the user types in numbers gives the average between 1-100
if( testavg >= 1 && testavg <= 100){

    System.out.println("The average is: " + testavg);

    //2. Use the If statement to show the output of the student's grade

if (testavg <= 100){

    //if the student ranges to 100-90 its an A
        if(testavg >= 90){
            System.out.println("The average grade is an A.");
        }
    //If the studetn ranges around 89-90 its a B
        else if(testavg >= 80){
        System.out.println("The average grade is a B.");
        }
    // It the student ranges around 79-70 its a C
        else if(testavg >= 70){
            System.out.println("The average grade is a C.");
        }
    // if the student ranges from 69-70 its a D
        else if(testavg >= 60){
            System.out.println("The average grade is a D.");
        }
    //If the studeent ranges around 59 and below its a F
        else if(testavg < 60) {
            System.out.println("The average grade is a F. ");
        }
        }
}
// This statement only occurs if the testavg is not between 1-100
    else{

        System.out.println("You must type in the appropriate number for the test scores to get the average.");
    }

}


}


