/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author BHUSHAN
 */
@WebServlet(urlPatterns = {"/CalculatorServlet"})
public class CalculatorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculatorServlet</title>");
            out.println("</head>");
            out.println("<body>");
            double n1=Double.parseDouble(request.getParameter("txt1"));
            double n2=Double.parseDouble(request.getParameter("txt2"));
            double result =0;
            String opr =request.getParameter("opr");
            if (opr.equals("+"))result=n1+n2;
            if (opr.equals("-"))result=n1-n2;
            if (opr.equals("*"))result=n1*n2;
            if (opr.equals("/"))result=n1/n2;
            out.println("<h1>Result="+result+"</h1>");
      
            out.println("</body>");
            out.println("</html>");
        }
    }

    
}
