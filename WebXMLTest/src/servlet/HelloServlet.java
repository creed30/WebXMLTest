package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7162336215500290074L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws IOException, ServletException
		    {
				try {
		        response.setContentType("text/html");
		        PrintWriter out = response.getWriter();
		        out.println("<html>");
		        out.println("<head>");
		        out.println("<title>Hello World!</title>");
		        out.println("</head>");
		        out.println("<body>");
		        out.println("<h1>Hello World!</h1>");
		        out.println("</body>");
		        out.println("</html>");
				}
				
		        catch (IOException ioe) {
		        	ioe.printStackTrace();
		        }
		        
		    }
}
