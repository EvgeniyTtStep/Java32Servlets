package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("data", "some data text from session");
        req.getRequestDispatcher("session-ex.jsp").forward(req, resp);


        Cookie cookie = new Cookie("cookieName", "cookieValue");
        cookie.setMaxAge(30);
        resp.addCookie(cookie);

    }
}
