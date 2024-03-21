//WishMessageServlet.java

package com.biswo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WishMessageClass extends HttpServlet {
	
		//2nd Service method
		public void service(HttpServletRequest req , HttpServletResponse res)throws ServletException ,IOException{
			
			//Get PrintWriter object from the response object
			PrintWriter pw = res.getWriter();
			
			//Set response type content type 
			res.setContentType("text/html");
			
			//Write The B.logic 
				//Get the Local computer time 
			LocalDateTime loc = LocalDateTime.now();
			
			//Get the current hour of today
			int hour = loc.getHour();
			
			//Get the wish message
			
			String wish = null;
			
			if(hour < 12) 
					wish = "Good Morning";
			else if(hour < 16)
					wish = "Good Afternoon";
			else if(hour < 20)
					wish = "Good Evening";
			else 
					wish = "Good Night";
			//Display the generated wish message
			pw.println("<h2 style='color:aqua ; text-align:center'>"+wish+"</h2>");
			
			//Return to the home page using hyperlink of home page
			pw.println("<br><br><a href='page.html'>HomePage</a>");
			pw.close();
			
		}
		//End of service method
}
//End of the class
