import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Q31ReadWriteReverseOrder {

	public static void main(String[] args) throws IOException{
		
		try {
			  String sLine;
			  String sPath = "C:\\Users\\sindh\\Downloads\\eclipse-jee-2019-12-R-win32-x86_64\\eclipse\\desktop\\Java progs\\Java Hackathon\\src\\Readfile.txt";
			  FileReader  oFR = new FileReader(sPath);
		      BufferedReader input = new BufferedReader(oFR);
		      ArrayList list = new ArrayList();
		      while ((sLine = input.readLine()) != null) {
		        list.add(sLine);
		      }
		      input.close();

		      Collections.reverse(list);

		      String sTarget = "C:\\Users\\sindh\\Downloads\\eclipse-jee-2019-12-R-win32-x86_64\\eclipse\\desktop\\Java progs\\Java Hackathon\\src\\WriteFile.txt";
		      FileWriter oFW = new FileWriter(sTarget);
		      BufferedWriter oBW = new BufferedWriter(oFW);
			  PrintWriter output = new PrintWriter(oBW);
		    
			  for (Iterator i = list.iterator(); i.hasNext();) {
		        output.println((String) i.next());
		      }
		      output.close();
		    } catch (IOException e) {
		      System.err.println(e);
		    }	
		}
}
