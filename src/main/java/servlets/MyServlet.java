package servlets;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class MyServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String vendor = request.getParameter("vendor");
        String desc = request.getParameter("desc");

        Car car = new Car(name, vendor, desc);

//        request.setAttribute("name", name);
//        request.setAttribute("vendor", vendor);
//        request.setAttribute("desc", desc);

        request.setAttribute("car", car);

        request.getRequestDispatcher("car-show.jsp").forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        //response.setHeader("Accept", "");
        out.println("<h1>Hello from servlet</h1>");

        String name = request.getParameter("name");
        out.println("<h2>" + name + "</h2>");


        String login = request.getParameter("login");
        String password = request.getParameter("password");

        out.println("<h2> Login = " + login + "</h2>");
        out.println("<h2> Password = " + password + "</h2>");
    }
}
