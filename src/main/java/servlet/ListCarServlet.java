package servlet;

import Model.Car;
import Dao.CarDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/find-all-cars")
public class ListCarServlet extends HttpServlet{
    @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Car> cars = new CarDao().findAllCars();

        request.setAttribute("cars", cars);

        request.getRequestDispatcher("dashboard.jsp").forward(request, response);

        }
    }

