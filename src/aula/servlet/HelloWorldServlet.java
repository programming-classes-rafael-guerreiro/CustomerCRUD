package aula.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

	private static int reqNumber = 0;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		//String user = req.getParameter("user_id");
		String user = "1'; drop table tabela;";
		
		String sql = "select * from tabela where user_id = '" + user + "';";

		PrintWriter writer = resp.getWriter();

		writer.println("<!DOCTYPE html>");
		writer.println("<html lang=\"en\">");
		writer.println("<head>");
		writer.println("<title>Hello Servlet</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>Hello Servlet! number: " + reqNumber++ + "</h1>");
		writer.println("</body>");
		writer.println("</html>");
	}

}
