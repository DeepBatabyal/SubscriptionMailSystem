package org.SendMailServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.subscription.sendmail.SendEmail;
import org.subscription.sendmail.SendEmailAdmin;

/**
 * Servlet implementation class SendMailServlet
 */
@WebServlet("/SendMailServlet")
public class SendMailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendMailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("un");
		String password=request.getParameter("pw");
		String recipient=request.getParameter("toun");
		
		// System.out.println(username+" "+password+" "+recipient);
		try{
		SendEmail se = new SendEmail();
		se.sendmail(username, password, recipient);  
		SendEmailAdmin sea=new SendEmailAdmin();
		sea.sendmail(recipient);
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			response.sendRedirect("mailsent.html");
		}
		
		
	}

}
