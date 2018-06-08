import comp102x.IO;

public class Lab02
{
    
    public static void multiply()
    {
        // Please write your code after this line
        // Get the first integer
        IO.output("Enter an integer, x: ");
        int value1 = IO.inputInteger();
        
        // Get the second integer
        IO.output("Enter an integer, y: ");
        int value2 = IO.inputInteger();
        
        // Multiply them together
        int product = value1 * value2;
        
        // Output answer to user
        IO.outputln("Answer: " + product);
    }
    
    public static void calculateTriangleArea()
    {
        // Please write your code after this line
        // Get width of the triangle
        IO.output("Enter the width of the triangle: ");
        double width = IO.inputDouble();
        
        // Get height of the triangle
        IO.output("Enter the height of the triangle: ");
        double height = IO.inputDouble();
        
        // Calculate the area
        double area = (width * height) / 2.0;
        
        // Output answer to user
        IO.outputln("The triangle area = " + area);
    }
    
    public static void solveQuadraticEquation()
    {
        // Please write your code after this line
        // Get a, b, and c
        IO.output("Enter a: ");
        double a = IO.inputDouble();
        
        IO.output("Enter b: ");
        double b = IO.inputDouble();
        
        IO.output("Enter c: ");
        double c = IO.inputDouble();
        
        // Solve both roots
        double solution1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/(2 * a);
        double solution2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c))/(2 * a);
        
        // Print solutions
        IO.outputln("First solution for x = " + solution1);
        IO.outputln("Second solution for x = " + solution2);
        
    }
}
