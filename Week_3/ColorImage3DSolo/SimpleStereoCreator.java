import comp102x.IO;
import comp102x.Canvas;
import comp102x.ColorImage;
/**
 * Takes 2 images and creates a 3D image
 *
 * @author John Maguire
 * @version 06/20/2018
 */
public class SimpleStereoCreator
{
    private final int CANVAS_WIDTH = 800;
    private final int CANVAS_HEIGHT = 600;
    private final int MARGIN = 10;
    
    private Canvas canvas;
    private ColorImage leftImage;
    private ColorImage rightImage;
    private ColorImage stereoImage;
    
    /**
     * Constructor for SimpleStereoCreator
     */
    public SimpleStereoCreator()
    {
        canvas = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT);
    }
    
    /**
     * Creates the stereo image from left and right images
     */
    public void createStereo()
    {
        leftImage = new ColorImage(); // loading the left image
        rightImage = new ColorImage(); // loading the right image
        
        ColorImage redImage = leftImage.createRedImage();
        ColorImage cyanImage = rightImage.createCyanImage();
        
        stereoImage = redImage.add(cyanImage);
        
        canvas.add(stereoImage, 0, 0);
    }
}
