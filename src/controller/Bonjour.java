package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Bonjour
 */

public class Bonjour extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Bonjour() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");

		out.println("<!DOCTYPE html>");
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Bonjour " + prenom + " " + nom + "</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<BIG>Bonjour " + prenom + " " + nom + "</BIG>");
		out.println("<A HREF=\"index.html\">Retour</a>");
		out.println("</BODY></HTML>");
	}

}