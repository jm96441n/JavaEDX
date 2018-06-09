import comp102x.IO;
/**
 * Write a description of class IronMan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IronMan
{
    private String id = "?";
    
    public IronMan() {
        id = "defaultID";
    }
    
    public IronMan(String newID) {
        id = newID;
    }
    
    private void dance() {
        IO.outputln("You must be joking +_+");
    }
    
    public void cleanSlateProtocol() {
        IO.outputln("3...2...1...Boom!");
    }
    
    public void setID(String givenID) {
        id = givenID;
    }
    
    public String getName() {
        // ("Mark " + id) concatenates "Mark " and id to form a character string
        return "Mark " + id;
    }
    
    public static void main(String[] args) {
        // construct and IronMan using the default constructor
        IronMan defaultIronMan = new IronMan();
        String name = defaultIronMan.getName();
        IO.outputln("This is: " + name);
        
        IronMan mark42 = new IronMan("42");
        IO.outputln("This is: " + mark42.getName());
        mark42.dance();
        mark42.cleanSlateProtocol();
    }
}
