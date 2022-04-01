package loginlogout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public login() {
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        request.getRequestDispatcher("li.html").include(request, response);  
          
        String username=request.getParameter("username");  
        String password=request.getParameter("password");  
          
        if(password.equals("admin123")){  
        out.print("Welcome, "+username);  
        HttpSession session=request.getSession();  
        session.setAttribute("username",username);  
        }  
        else{  
            out.print("Sorry, username or password error!");  
            request.getRequestDispatcher("index.html").include(request, response);  
        }  
        out.close();  
    }  
	}
