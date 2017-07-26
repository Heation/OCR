package OCR;

import java.io.File;  
import net.sourceforge.tess4j.*;  
  
public class TesseractExample {  
  
    public static void main(String[] args) {  
        File imageFile = new File("tessdataku/test1.jpg");  
        ITesseract instance = new Tesseract();  // JNA Interface Mapping  
        // ITesseract instance = new Tesseract1(); // JNA Direct Mapping  
  
        try {  
            String result = instance.doOCR(imageFile);  
            System.out.println(result);  
        } catch (TesseractException e) {  
            System.err.println(e.getMessage());  
        }  
    }  
}  