import java.util.Scanner;
//Kianna Desilva COP-2880
public class PayRoll {
    
    private String EmployeeName;
    private String IdNum;
    private double HourlyPayRate;
    private double HoursWorked;

    //This is the constructer that holds the name of the employee and the ID
    public PayRoll(String Name, String ID){

        this.EmployeeName = Name;
        this.IdNum = ID;

    }
    /*
     @return EmployeeName returns the employee's name
     */
    public String getEmployeeName()
    {
        return EmployeeName;
    }

    /*
     @return IdNum returns the ID number of the employee
     */
    public String getIDnumber()
    {
        return IdNum;
    }

    // This stores the Pay amount of the employee
  public void setterHourlyRate(double HourlyPay){

       this.HourlyPayRate = HourlyPay;

    }

    /*
     @return HourlyPayRate returns the pay rate
     */
    public double getterHourlyPayRate(){

        return HourlyPayRate;
    }

//This stores the amount of hours worked
    public void setterHoursWorked(double hours){
        
        this.HoursWorked = hours;
    }

    /*
    @return HoursWorked returns the amount of hours worked
     */ 
    public double getterHoursWorked(){

        return HoursWorked;
    }
/*
 @return HoursWorked* HourlyPayRate returns the amount of hours times the pay rate
 */
    public double getterGrossPay(){

        return HoursWorked * HourlyPayRate;
    }

    public static void main(String[] args) {
        String EmployeeName;
        String IdNum;
        double HoursWorked;
        double HourlyRate;
       
        try (Scanner input = new Scanner (System.in)) {
            System.out.println("Please type in your name");
            EmployeeName = input.nextLine();
            //This loop is for when the user types in less than two characters, the user will get an error message
            while(EmployeeName.length() == 2 || EmployeeName.length() == 1){

                System.out.println("Please type more than 2 characters");
                EmployeeName = input.nextLine();
            }

            
            //The loop is for when the user types in less than 5 characters of numbers for the ID 
            for (;;) {
                System.out.println("Please type in your Id Number (5 characters)");
                IdNum= input.nextLine().trim();
                if (IdNum.matches("[0-9]{5}"))
                    break;
                System.out.println("Invalid ID format.");
                System.out.println();
            }
            

            System.out.println("Please type in the amount of hours worked");
            HoursWorked = input.nextDouble();
            //This loop is for when the user types in a number less than 1 hour
            while(HoursWorked < 1){
                System.out.println("Please type in a number greater than 1");
                HoursWorked = input.nextDouble();
            }

            System.out.println("Please type in your hourly pay rate");
            HourlyRate = input.nextDouble();
            //This loop is for when the user types a number less than 0
            while(HourlyRate < 0){
                System.out.println("Please type in an a number that is greater than 0");
                HourlyRate = input.nextDouble();
            }
   input.close();
        }
    
        //An object called pay is created 
        PayRoll pay = new PayRoll(EmployeeName, IdNum);

        //The hourly rate and hours worked gets stored 
        pay.setterHoursWorked(HoursWorked);
        pay.setterHourlyRate(HourlyRate);

        System.out.println("The Gross Pay of Employee: " + EmployeeName + " is $"+ pay.getterGrossPay());

        
      
    }
  
}
