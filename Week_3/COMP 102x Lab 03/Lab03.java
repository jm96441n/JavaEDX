import comp102x.ColorImage;
import comp102x.Canvas;

public class Lab03
{  
    
    public void loadAnImage() 
    {
        // Please write your code after this line
        ColorImage image = new ColorImage();
        Canvas canvas = new Canvas(image.getWidth(), image.getHeight());
        canvas.add(image);
        
    }
    
    public void loadTwoImagesOnTheSameCanvas()
    {
        // Please write your code after this line
        ColorImage image1 = new ColorImage();
        ColorImage image2 = new ColorImage();
        int width = image1.getWidth() * 2;
        int height = image1.getHeight();
        Canvas canvas = new Canvas(width, height);
        canvas.add(image1);
        canvas.add(image2, image1.getWidth(), 0);
    }
    
    public void imageAddition() 
    {    
        // Please write your code after this line
        ColorImage image1 = new ColorImage();
        ColorImage image2 = new ColorImage();
        ColorImage image3 = ColorImage.add(image1, image2);
        int width = (image1.getWidth() * 3) + 20;
        int height = image1.getHeight();
        int image2Offset = image1.getWidth() + 10;
        int image3Offset = image2Offset + image1.getWidth() + 10;
        Canvas canvas = new Canvas(width, height);
        canvas.add(image1);
        canvas.add(image2, image2Offset, 0);
        canvas.add(image3, image3Offset, 0);
    }
   
    public void imageMultiplication() 
    {
        // Please write your code after this line
        ColorImage image1 = new ColorImage();
        ColorImage image2 = new ColorImage();
        ColorImage image3 = ColorImage.multiply(image1, image2);
        int width = (image1.getWidth() * 3) + 20;
        int height = image1.getHeight();
        int image2Offset = image1.getWidth() + 10;
        int image3Offset = image2Offset + image1.getWidth() + 10;
        Canvas canvas = new Canvas(width, height);
        canvas.add(image1);
        canvas.add(image2, image2Offset, 0);
        canvas.add(image3, image3Offset, 0);
    }
    
    public void changeColor()
    {
        ColorImage image = new ColorImage();
        image.increaseRed(40);
        Canvas canvas = new Canvas(image.getWidth(), image.getHeight());
        canvas.add(image);
        
        //image.save();
    }
}
