package fr.lixtec.form10.j2.exo6;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exo6/individu")
public class IndividuControler extends HttpServlet
{
    private static final long serialVersionUID = 121020222049L;
    private static final String VUE_FORMULAIRE = "/exo6/formulaire-individu.jsp";
    private static final String VUE_RECAP = "/exo6/recap-individu.jsp";

    @EJB IndividuServiceBean individuService;
    
    
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
        Individu individu = new Individu();
        individu.setNom(req.getParameter("nom"));
        individu.setPrenom(req.getParameter("prenom"));
        individu.setAdresse(req.getParameter("adresse"));
        individuService.persist(individu);
        req.setAttribute("individus", individuService.getIndividus());
        getServletContext().getRequestDispatcher(VUE_RECAP).forward(req, resp);
    }
}