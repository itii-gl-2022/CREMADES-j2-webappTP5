package fr.lixtec.form10.j2.exo5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/inscription")
public class InscriptionServlet extends HttpServlet
{
    private static final long serialVersionUID = 7446985734933559486L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title> A very simple inscription servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<form action=\"./inscription\"  method=\"post\" >");
        out.println("nom: <input type=\"text\" name=\"nom\" required=\"true\"/>");
        out.println("prenom: <input type=\"text\" name=\"prenom\" required=\"true\"/>");
        out.println("<input type=\"submit\" value=\"Suivant\"/>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String nom =  request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String adresse = request.getParameter("adresse");
        
        if (request.getSession().getAttribute("nom")==null && nom!=null) {
            request.getSession().setAttribute("nom", nom);
        }

        if (request.getSession().getAttribute("prenom")==null && prenom!=null) {
            request.getSession().setAttribute("prenom", prenom);
        }

        if (request.getSession().getAttribute("adresse")==null && adresse!=null) {
            request.getSession().setAttribute("adresse", adresse);
        }
        
        if (request.getSession().getAttribute("nom")==null)
        {
            out.println("<html>");
            out.println("<head>");
            out.println("<title> A very simple inscription servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form action=\"./inscription\"  method=\"post\" >");
            out.println("nom: <input type=\"text\" name=\"nom\" required=\"true\"/>");
            out.println("prenom: <input type=\"text\" name=\"prenom\" required=\"true\"/>");
            out.println("<input type=\"submit\" value=\"Suivant\"/>");
            out.println("</form>");
            out.println("</body>");
        }
        else if (request.getSession().getAttribute("adresse")==null)
        {
            out.println("<html>");
            out.println("<head>");
            out.println("<title> A very simple inscription servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form action=\"./inscription\"  method=\"post\" >");
            out.println("adresse: <textarea name=\"adresse\"></textarea>");
            out.println("<input type=\"submit\" value=\"Suivant\"/>");
            out.println("</form>");
            out.println("</body>");
        }
        else 
        {
            out.println("<html>");
            out.println("<head>");
            out.println("<title> A very simple inscription servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("nom: "+request.getSession().getAttribute("nom"));
            out.println("prenom: "+request.getSession().getAttribute("prenom"));
            out.println("adresse: "+request.getSession().getAttribute("adresse"));
            out.println("</body>"); 
        }
        out.println("</html>");
        out.close();
    }
}