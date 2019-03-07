package zan12;

import java.io.IOException;
import java.io.InputStream;

public class DopZadanie1 {

	public static void main(String[] args) {
		
		InputStream stream = new MyInputStream();
		try {
		
		} finally {
		    try {
		        if(stream != null) {
		            stream.close();
		        }
		    } catch(IOException e) {
		       
		    }
		}
	}

}
