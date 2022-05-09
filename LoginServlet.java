

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoguinServlet
 */
@WebServlet("/login")
public class LoguinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoguinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String id = request.getParameter("id");
	    String password = request.getParameter("password");
	        
	    System.out.println(id);
        System.out.println(password);     
        
        if(Utility.isNullOrEmpty(id)) {
        	
        	
        	System.out.println(id);
        	request.setAttribute("id", "IDは必須です");
        	request.setAttribute("password", "PASSは必須です");
        	request.getRequestDispatcher("/login.jsp").forward(request, response);
        	
        	
        	
        }else if(id.equals("axiz") && password.equals("axizuser") || id.equals("technocore") && password.equals("techno-pass")){
        	
        	request.setAttribute("id", id);
            request.setAttribute("password", password);
        	request.getRequestDispatcher("/result.jsp").forward(request, response);
        	
        	
        }else{
        
        
        	request.setAttribute("mati", "ng");
        	//request.setAttribute("password", "ng");
        	request.getRequestDispatcher("/login.jsp").forward(request, response);
        	
        	
        }
        
        
        
        

	}

}
