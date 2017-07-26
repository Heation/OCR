package OCR;

import java.io.File;


import net.sourceforge.tess4j.*;  
  
public class Train {  
  
    public static void main(String[] args) {  
    	//File imageFile = new File("d:\\test1.jpg");
    	File imageFile = new File("tessdataku/test1.jpg");
    	ITesseract instance = new Tesseract();

    	//In case you don't have your own tessdata, let it also be extracted for you
    	//��������ʹ��classpathĿ¼�µ�ѵ������
    	
    	//instance.setLanguage("chi_sim");//���Ŀ�ʶ�����ֱȽ�׼ȷ
    	instance.setLanguage("chi_sim");
    	//Set the tessdata path
    	//instance.setDatapath("d:\\Tesseract-OCR\\tessdata");
    	instance.setDatapath("tessdataku/Tesseract-OCR/tessdata");
    	try {
    	    String result = instance.doOCR(imageFile);
    	    System.out.println(result);
    	} catch (TesseractException e) {
    	    System.err.println(e.getMessage());
    	}
    }
}  