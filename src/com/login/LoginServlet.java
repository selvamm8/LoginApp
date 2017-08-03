package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userID = request.getParameter("userId");
		String userPwd = request.getParameter("password");

		if (userID == null || userID.equals("") || userPwd == null || userPwd.equals("")) {
			request.setAttribute("loginError", "Please Check userId and Password entered");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}

		try {
			System.out.println("Welcome to LoginServlet ");
			System.out.println("User  " + userID);
			System.out.println("userPwd " + userPwd);

			if (userPwd.equalsIgnoreCase("selvam123" ))
				request.setAttribute("message", "Welcome u a are succesfully logged in");
			else
				request.setAttribute("message", "Incorrect login please try again");

			request.getRequestDispatcher("login.jsp").forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("loginError", e.getMessage());
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
	}

}
