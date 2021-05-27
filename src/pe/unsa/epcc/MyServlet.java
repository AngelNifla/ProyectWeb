package pe.unsa.epcc;

import java.io.IOException;
import java.util.ArrayList;
//import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String yourName = request.getParameter("yourName");
		
		List<Person> persons = new ArrayList<>();
		Person person = new Person();
		person.setName(yourName);
		person.setAge("17");
		
		persons.add(person);
		
		person.setName("Jose");
		person.setAge("20");
		
		persons.add(person);
		
		request.setAttribute("person", person);
		request.setAttribute("persons", persons);
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("home.jsp");
				dispatcher.forward(request, response);
				
		

		 
		/*
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Hola "+ yourName + "</h1>");
		writer.close();		
		*/
		}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
