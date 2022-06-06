package controller;

import model.Customer;
import model.Order;
import model.Product;
import service.CustomerService;
import service.CustometServiceImpl;
import service.OderServiceImpl;
import service.OrderService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "OrderServlet", urlPatterns = "/orders")
public class OrderServlet extends HttpServlet {
    CustomerService customerService = new CustometServiceImpl();
    OrderService orderService = new OderServiceImpl();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "view":
                View(request, response);
                break;
            default:
                showList(request, response);

        }
    }

    private void View(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Order order = orderService.findById(id);
        RequestDispatcher dispatcher = null;
        if (order != null) {
            request.setAttribute("st", order);
            dispatcher = request.getRequestDispatcher("order/view.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("order/list.jsp");
        List<Order> orders = orderService.findAll();
        request.setAttribute("ds", orders);
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":

        }
    }
}
