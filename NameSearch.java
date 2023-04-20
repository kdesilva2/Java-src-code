import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NameSearch {
public static void main(String[] args)throws IOException {

// This puts all the boys name sinto the arraylist
Scanner blist = new Scanner(new File("BoyNames.txt"));

ArrayList<String> list = new ArrayList<String>();
//This loop adds the names in to the arrays list word by word
while (blist.hasNext()){

    list.add(blist.next());
}
blist.close();

//This puts all the girl names into an arraylist
Scanner glist = new Scanner(new File("GirlNames.txt"));

ArrayList<String> list1 = new ArrayList<String>();
//This loop adds the names in to the arrays list word by word
while (glist.hasNext()){

    list1.add(glist.next());
}
glist.close();
Scanner input = new Scanner(System.in);


 System.out.println("Choose 1 to type in girl or boy name or Choose 2 to type in both.");
int number = input.nextInt();
Scanner input1 = new Scanner(System.in);

switch(number){

case 1:

System.out.println("Please input a Boy Name");
String boy = input.nextLine();

//This only occurs when the user types in 2 characters or less
while(boy.length() <= 2){

    System.out.println("Please type in more than 2 characters for the boy name.");
    boy = input.nextLine();
}

System.out.println("Now type in the Girl name");
String girl = input.nextLine();
//This only occurs when the user types in 2 characters or less
while(girl.length() <= 2){
System.out.println("Please type in more than characters for the girl name.");
girl = input.nextLine();
                      }


//This is to ignorecase of what the user uses lowercases or uppercase
boolean ignorecaseBoy = list.stream().anyMatch(boy::equalsIgnoreCase);
boolean ignorecaseGirl = list1.stream().anyMatch(girl::equalsIgnoreCase);

//This occurs if the user types in  both names that are on the list
if( ignorecaseBoy && ignorecaseGirl){

    System.out.println("Both names were found amongst the popular girl and boy name");
}

//This will only occur if the user types in only a boy name that was on the list
else if (ignorecaseBoy){

System.out.println("The name "+ boy + " was found amongst the popular boy names.");
                        
                        }
//This will onyl occur if the user types in only a girl name that was on the list
 else if (ignorecaseGirl){

System.out.println("The name "+ girl + " was found amongst the popular girl names.");
                                                                                    }

                                                                                    
//This will be only shown if the user didnt type a name that wasnt in any of  the lists
else{
System.out.println("Neither names were found amongst the boy name and girl names");
}
break;


case 2:

System.out.println("Type in both names");
String bol = input1.nextLine();

boolean popularboy= false;
boolean populargirl= false;

//This seperates the string by space
String[] names = bol.split("\\s+");


for (String name : names) {

//This is to ignorecase of what the user uses lowercases or uppercase
    boolean contain = list.stream().anyMatch(name::equalsIgnoreCase);
    boolean contains = list1.stream().anyMatch(name::equalsIgnoreCase);

    if (contain) {
        popularboy = true;
    }
    if (contains) {
        populargirl = true;
    }
}

// This display's appropriate message when the conditions are met
if (popularboy && populargirl) {

    System.out.println("Both names are among the most popular names for boys and girls.");

} else if (popularboy) {
    System.out.println("The chosen boy name is among the most popular names for boys.");

} else if (populargirl) {
    System.out.println("The chosen girl is among the most popular names for girls.");
    //
} else {
    System.out.println("Neither name is among the most popular names for boys or girls.");
}

break;

//This only occurs if the user didnt type in one or two

default:
System.out.println("Please type in 1 or 2. Rerun the program");
break;

}

                                                                                                 
input.close();
input1.close();

  }                                                                                         

}

