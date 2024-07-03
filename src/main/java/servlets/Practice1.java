package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Practice1 extends HttpServlet {

    //Завдання 2:
    //Створіть сервлет, що вираховує максимум із трьох чисел. Користувач вводить числові значення в
    //різні текстові поля. Сервлет повинен відобразити всі числа, а також показати максимальне
    //значення в спеціальному відформатованому полі.
    //Завдання 3:
    //Додайте до другого завдання можливість підрахунку мінімального і середнього арифметичного
    //значення із трьох чисел. Вибір дій (максимум, мінімум, середнє арифметичне) повинен відбуватися
    //через радіокнопку.
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int num3 = Integer.parseInt(req.getParameter("num3"));
        int res = 0;

        String operation = req.getParameter("operation");

        switch (operation) {
            case "max":
                res = Math.max(Math.max(num1, num2), num3);
                break;
            case "min":
                res = Math.min(Math.min(num1, num2), num3);
                break;
            case "avg":
                res = Math.round((float) (num1 + num2 + num3) / 3);
                break;
        }

        req.setAttribute("res", res);


        req.getRequestDispatcher("practice-jstl.jsp").forward(req, resp);

    }

}
