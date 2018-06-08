import comp102x.IO;
/**
 * Write a description of class CarSolo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarSolo
{
   private int odometer = 0;
   private String owner = "NoName";
   
   /**
    * Default constructor for Car object
    */
   public CarSolo() {}
   
   /**
    * Constructor for Car obkect with a new owner's name
    * @param name  name of owner
    */
   public CarSolo(String name){
       owner = name;
   }
   
   /**
    * moveCar moves a car forward or backwards by dist units
    * @param dist moving distance
    */
   public void moveCar(int dist) {
       odometer = odometer + Math.abs(dist);
       IO.outputln(owner + "'s car has moved " + dist + " units.");
   }
   
   /**
    * turnCar turns a car by a given degree
    * @param angle turn angle in degrees
    */
   public void turnCar(double angle) {
       IO.outputln(owner + "'s car has turned " + angle + " degrees.");
   }
   
   /**
    * getOdometer gets the odometer reading of a car
    */
   public int getOdometer(){
       return odometer;
   }
}
