public class Assignment2 {
    
public static void main(String[] args) {
    
//#2 Name and Initials


//1. String Variables with the names

 String firstName = "Mary";

 String middleName = "Elle";

 String lastName ="Marlene";


//2. Use charAt so the code can grab the initials from the strings

 char firstInitial = firstName.charAt(0);

 char middleInitial = middleName.charAt(0);

 char lastInitial = lastName.charAt(0);


//3. System print out Names and Initials 

 System.out.println("Full Name: " + firstName + " " + middleName + " " +
 lastName );

 System.out.println("Initials: " + firstInitial + ". " + middleInitial
 + ". " + lastInitial);

 

}

}
