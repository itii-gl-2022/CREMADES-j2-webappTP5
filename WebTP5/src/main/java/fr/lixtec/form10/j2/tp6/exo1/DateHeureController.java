package fr.lixtec.form10.j2.tp6.exo1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/date-heure")
public class DateHeureController extends HttpServlet
{
    private static final long serialVersionUID = 6838044939512467068L;
    private static final String VUE_HEURESERV = "/date-heure";
    private static final String VUE_DATEHEURE = "/date-heure";

    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        getServletContext().getRequestDispatcher(VUE_HEURESERV).forward(req, resp);
    }
    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        HttpSession session = req.getSession();
        getServletContext().getRequestDispatcher(VUE_DATEHEURE).forward(req, resp);
    }
}