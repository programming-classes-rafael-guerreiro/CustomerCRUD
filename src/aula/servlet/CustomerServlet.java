package aula.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter writer = resp.getWriter();
		
		writer.println("<!DOCTYPE html>");
		writer.println("<html lang=\"en\">");
		writer.println("<head>");
		writer.println("<title>Customer</title>");
		writer.println("</head>");
		writer.println("<body>");

		int min = 5000;
		int max = 20000;

		int random = (int) (Math.random() * (max - min)) + min;

		for (int index = 0; index < random; index++)
			writer.println("<p id=\"id" + index + "\" class=\"class" + index + "\">Customer " + index + "</p>");

		writer.println("</body>");
		writer.println("</html>");
	}

}
