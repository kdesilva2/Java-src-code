public class Car{
    
    
//This holds the year of the car
private int year = 2020;

//This holds the Name of the car model
private String makCar =" Tesla";

//This holds the car speed
private int carSpeed;

//The constructor that stores the yearModel and Car name
public Car(int yearModel, String makeCar){

    this.year = yearModel;
    this.makCar = makeCar;
    this.carSpeed = 0;
}

/*
 @return makCar  
 */

public String getMakCar(){

    return makCar;
}

/*
 @return year returns the year assigned
 */
public int getYear(){

return year;

}

// When it is called the speed of the car increases
public void setAccelerate(){

    carSpeed += 5;
}

//When it is called the speed of the car decreases
public void setBrake(){

    carSpeed -= 5;
}

/*
 @return carSpeed returns the current speed
 */
public int getCurrentSpeed(){

return carSpeed;
}
//Everytime a loop is iterated it adds 5 or subtracts 5 from the current Speed
    public static void main(String[] args) {
        
         Car myCar = new Car(2020, "Tesla");
        
        for(int i = 1; i <= 5; i++){

           myCar.setAccelerate();
           System.out.println(myCar.getCurrentSpeed());
           
        }

        System.out.println("The "+ myCar.makCar + " will now be pressing the brakes.");

        for (int i = 1; i <= 5; i++){

            myCar.setBrake();
            System.out.println(myCar.getCurrentSpeed());
        }
        
    }


}
