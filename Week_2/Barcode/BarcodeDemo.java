import comp102x.IO;

public class BarcodeDemo
{
    public static void main(String[] args) {
        long value1 = IO.inputBarcode();
        long value2 = IO.inputBarcode();
        
        IO.outputln("The first barcode is " + value1);
        IO.outputln("The second barcode is " + value2);
        
        long addResult = value1 + value2;
        long multResult = value1 * value2;
        
        IO.outputln("Add result is " + addResult);
        IO.outputln("Mult result is " + multResult);
        
        IO.outputBarcode(addResult);
    }
}
