
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class file_reader {
public ArrayList<ArrayList> file_reader(ArrayList<String> al) throws FileNotFoundException {
//	for(int i = 0;i<al.size();i++) {
//		System.out.println(al.get(i));
//	}
//	
	//NOTE : EXISTING FILE WILL ALREADY HAVE PARSED DATA 
	String img_address = "";//This variable will store img address which will further use for img processing for img_viewer class file
	String arr[] = new String[3];
	boolean isNew = true;
	ArrayList<ArrayList> parentAl = new ArrayList();
	ArrayList<String> childAl = new ArrayList();
	for(int j = 0;j<al.size();j++) {//this loop will read all the data from file to get important data like name,description and img address
		String temp = al.get(j);
		if(isNew) {
			childAl = new ArrayList();
			isNew = false;
		}
	
		if(temp.contains("published_date")) {
		for(int i = 0;i<temp.length();i++) {
			if(temp.charAt(i) == ':') {
				childAl.add(temp.substring(i+2, temp.length()-1));
				isNew = false;
				break;
			}
		}
		}if(temp.contains("title")) {
			for(int i = 0;i<temp.length();i++) {
				if(temp.charAt(i) == ':') {
					childAl.add(temp.substring(i+2, temp.length()-1));
					isNew = false;
				break;
				}
			}
		}
		
		if(temp.contains("link")  ) {
			
			for(int i = 0;i<temp.length();i++) {
				if(temp.charAt(i) == ':') {
				
					childAl.add(temp.substring(i+2, temp.length()-1));
					isNew = true;
					parentAl.add(childAl);
				
					break;
				}
			}
			
		}
		}
	
	return parentAl;	
}
}

