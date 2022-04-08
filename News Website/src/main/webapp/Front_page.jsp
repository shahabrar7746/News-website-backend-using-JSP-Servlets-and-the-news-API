<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage = "error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<style>

/* unvisited link */
a:link {
  color: green;
}

/* visited link */
a:visited {
  color: green;
}

/* mouse over link */
a:hover {
  color: blue;
}

/* selected link */
a:active {
  color: blue;
} 
</style>
<meta charset="ISO-8859-1">
<title>News</title>
</head>
<body>
<%@page import="java.util.*"%>
<form align = "center">
<%


ArrayList<ArrayList> al = (ArrayList<ArrayList>) request.getAttribute("ArrayList");//Stores all arraylist which contains news in the form of String
for(int i = 1;i<al.size();i++){
	ArrayList mainAl = (ArrayList) al.get(i);
	
String header[] = {"Source:","Publishing Date:","News:","Link:"};
	for(int j = 0;j<mainAl.size();j++){
			//use to display fetched from api
			//data is stored in mainAl arraylist
		String temp = "";
		temp = temp.valueOf(mainAl.get(j));
		if(j == 0){
		out.println("<h2>"+ header[j]+temp + "</h2>");
		}if(j == 1){
			out.println("<h4>"+ header[j]+temp + "</h4>");
			}
		if(j == 2){
			out.println("<h1>"+ header[j]+temp + "</h1>");
			}
		if(j == 3){
			
			if(temp.contains("youtube.com/watch?v=")){
				
				String arr[] = new String[2];
				arr = temp.split("=");
				System.out.println(arr[1]);
				out.println("<iframe width=420 height=315 src = https://www.youtube.com/embed/" + arr[1] + "</iframe>");
				
			}else{
			out.println("<p>Link:<a href="+ temp + ">Click here to know more</a></p>");
			}
			}
		
			
		
		
	}
//int k = 9/0; -------------> line used for error page 
	
}







%>
</form>
</body>
</html>