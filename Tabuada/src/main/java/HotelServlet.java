
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HotelServlet")
public class HotelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HotelServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String noite = request.getParameter("noite");
		
		int no = Integer.parseInt(noite);
		double conta = 0;

		try (PrintWriter out = response.getWriter()) {
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Hotel</title>");
			out.println("</head>");
			out.println("<h1>Hotel"+ "</h1>");
			for (int i = 1; i <= no; i++) {
				conta += (100 / i);
			}
			out.println(conta + "<br />");
			out.println("</body>");
			out.println("</html>");

		}

	}
}
