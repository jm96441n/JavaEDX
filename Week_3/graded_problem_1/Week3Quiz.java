import comp102x.IO;

public class Week3Quiz
{
    private double x;
    
    public Week3Quiz(int i, double d) {
        x = i + d;
    }
    
    public Week3Quiz(double d, int i) {
        x = i - d;
    }
    
    public static void main(String[] args) {
        Week3Quiz q1 = new Week3Quiz(10.0, 10);
        Week3Quiz q2 = new Week3Quiz(10, 10.0);

        IO.output("\n");
        IO.output(q1.x); // statement 1
        IO.output("\n");
        IO.output(q2.x); // statement 2
    }
}
