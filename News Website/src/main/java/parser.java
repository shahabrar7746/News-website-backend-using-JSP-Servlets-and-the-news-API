
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class parser {
public ArrayList<ArrayList>  parser(String API_response) throws IOException {
	/*
	 * below is the location of folder where our file is stored for offline use
	 * in text file format
	 */
	
	ArrayList<String> al = new ArrayList();
	
	String container = "";
	
	//below folder will be used to arrange data in appropiate manner for reading and for file_reader
	//file for getting important data from file 
	for(int i = 0;i<API_response.length();i++) {
		
		/*
		 * if a line contain any colon,opening or a closing bracket then it will jump on next start from 
		 * there if does not then it will contiunue on that line only. 
		 */
		
		//NOTE : THIS METHOD WILL BE CALLED FROM WIKIPEDIA_API  CLASS FILE
		String temp = "";
		temp = temp.valueOf(API_response.charAt(i));

		if(API_response.charAt(i) == ',' | API_response.charAt(i) == '{' | API_response.charAt(i) == '}' | API_response.charAt(i) == '[' | API_response.charAt(i) == ']') {
			if(API_response.charAt(i) == ',') {
				al.add(container);
				container = "";
		al.add(temp);
		}else {
			al.add(container);
			al.add(temp);
			container = "";
		}
		}else {
			if(API_response.charAt(i) == ',' | API_response.charAt(i) == '{' | API_response.charAt(i) == '}' | API_response.charAt(i) == '[' | API_response.charAt(i) == ']') {
al.add(container);
al.add(temp);
container = "";
			
			}else {
				container = container + temp;
			}
			
		}
		
	}
	/*
	 * this wil further continue to file_reader file for reading and getting a important data
	 * from file
	 */
	file_reader fr = new file_reader();
	 return fr.file_reader(al);
	//this will take String as a parameter for calling important method from File_Reader class file
}
}
