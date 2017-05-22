package sevlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.MemberVo;

@WebServlet("/04")
public class _04Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost( request, response );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberVo vo2 = new MemberVo();
		vo2.setNo( 2L );
		vo2.setEmail( "kickscar2@gmail.com" );
		request.setAttribute( "vo2", vo2 );

		MemberVo vo3 = new MemberVo();
		vo3.setNo( 3L );
		vo3.setEmail( "kickscar3@gmail.com" );
		request.setAttribute( "vo3", vo3 );
		request.getSession( true ).setAttribute( "vo3", vo3 );

		MemberVo vo4 = new MemberVo();
		vo4.setNo( 4L );
		vo4.setEmail( "kickscar3@gmail.com" );
		request.getServletContext().setAttribute( "vo4", vo4 );
		
		request.getRequestDispatcher( "/view/04.jsp" ).forward( request, response );
	}
}
