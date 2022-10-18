package fr.lixtec.form10.j2.tp7;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShoppingController
 */
@WebServlet("/panier")
public class PanierController extends HttpServlet implements ShoppingInterface{
	private static final long serialVersionUID = 6838044939512467068L;
	private static final String VUE_SHOPPING = "/tp5/shopping.jsp";
	private static final String VUE_QRCODE = "/tp5/panier.jsp";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PanierController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher(VUE_SHOPPING).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		doGet(request, response);
	}

	@Override
	public void addProductToCart(Produit product) {
		// TODO Auto-generated method stub 
		//Sert à ajouter le produit choisi sur la page de choix 
		
		
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		//Sert à push les infos sur la base de données
	}

}
