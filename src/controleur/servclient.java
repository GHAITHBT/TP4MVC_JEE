package controleur;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modele.clientbean;

/**
 * Servlet implementation class servclient
 */
@WebServlet("/servclient")
public class servclient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servclient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("T1").length()>0 && request.getParameter("T2").length()>0
				&& request.getParameter("T3").length()>0
				&& request.getParameter("T4").length()>0
				&& request.getParameter("T5").length()>0) {
			clientbean client=new clientbean(request.getParameter("T1"),request.getParameter("T2"),request.getParameter("T3"),request.getParameter("T4"),request.getParameter("T5"));
			HttpSession session = request.getSession();
			session.setAttribute("client",client);
			session.setMaxInactiveInterval(300);}
			String jsp="indexjsp2.jsp";
			RequestDispatcher dispatcher=request.getRequestDispatcher(jsp);
			dispatcher.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
