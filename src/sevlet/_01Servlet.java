package sevlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( "/01" )
public class _01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost( request, response );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iVal = 10;
		float fVal = 3.14f;
		boolean bVal = true;
		String sVal = "Hello World";
		Object nullVal = null;
		
		request.setAttribute( "iValue", iVal );
		request.setAttribute( "fValue", fVal );
		request.setAttribute( "bValue", bVal );
		request.setAttribute( "sValue", sVal );
		request.setAttribute( "nullValue", nullVal );
		
		
		request.getRequestDispatcher( "/view/01.jsp" ).forward( request, response );
	}
}
