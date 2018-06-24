import comp102x.IO;
import comp102x.ColorImage;
import comp102x.Canvas;

public class Car2
{
    private String owner = "NoName";
    private ColorImage carImage = new ColorImage("Car1.png");
    private double gasMileage = 10.0; // Liters for every 100km
    private double gasInTank = 10.0;

    public Car2(){}
    
    public Car2(String nameOfOwner)
    {
        owner = nameOfOwner;
        carImage = new ColorImage();
    }
    
    public Car2(String nameOfOwner, double newGasMileage)
    {
        owner = nameOfOwner;
        carImage = new ColorImage();
        gasMileage = newGasMileage;
    }
    
    public void moveForward(int dist)
    {
        // Change the x position of the car from current x position plus distance
        carImage.setX(carImage.getX() + dist);
        // Update the amount of gas in tank
        double gasUsed =  dist / 100.0 * gasMileage;
        gasInTank = gasInTank - gasUsed;
        IO.outputln("Amount of gas used: " +  gasUsed + ", gas remained: "+ gasInTank);
    }
    
    public void makeTurn(int angle)
    {
        // Change the orientation of the car from current orientation plus angle
        carImage.setRotation(carImage.getRotation() + angle);
    }
    
    public void addGas(double gasToAdd)
    {
        gasInTank = gasInTank + gasToAdd;
    }
    
    public void Car2Demo()
    {
        Canvas canvas = new Canvas();
        canvas.add(carImage,200,200);
    }
}
