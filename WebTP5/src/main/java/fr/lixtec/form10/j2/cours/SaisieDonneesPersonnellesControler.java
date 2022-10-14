package fr.lixtec.form10.j2.cours;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/donnees-perso")
public class SaisieDonneesPersonnellesControler extends HttpServlet
{
    private static final long serialVersionUID = 6838044939512467068L;
    private static final String VUE_FORMULAIRE = "/cours/saisieDonneesPersonnelles.jsp";
    private static final String VUE_RECAP = "/cours/recapDonneesPersonnelles.jsp";

    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        getServletContext().getRequestDispatcher(VUE_FORMULAIRE).forward(req, resp);
    }
    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        HttpSession session = req.getSession();
        session.setAttribute("nom", req.getParameter("nom"));
        session.setAttribute("prenom", req.getParameter("prenom"));
        session.setAttribute("adresse", req.getParameter("adresse"));
        getServletContext().getRequestDispatcher(VUE_RECAP).forward(req, resp);
    }
}