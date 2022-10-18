package fr.lixtec.form10.j2.tp5;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.krysalis.barcode4j.impl.code39.Code39Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;
import org.krysalis.barcode4j.tools.UnitConv;

/**
 * Servlet implementation class qrcode
 */
@WebServlet("/qrcode")
public class qrcode extends HttpServlet {
	private static final long serialVersionUID = 6838044939512467068L;
	private static final String VUE_FORMULAIRE = "/tp5/qrcodeform.jsp";
	private static final String VUE_QRCODE = "/tp5/test.jsp";
   

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher(VUE_FORMULAIRE).forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		//Create the barcode bean
		Code39Bean bean = new Code39Bean();

		final int dpi = 150;

		//Configure the barcode generator
		bean.setModuleWidth(UnitConv.in2mm(1.0f / dpi)); //makes the narrow bar 
		                                                 //width exactly one pixel
		bean.setWideFactor(3);
		bean.doQuietZone(false);

		//Open output file
		File outputFile = new File("qrcode.png");
		OutputStream out = new FileOutputStream(outputFile);
		try {
		    //Set up the canvas provider for monochrome PNG output 
		    BitmapCanvasProvider canvas = new BitmapCanvasProvider(
		            out, "image/x-png", dpi, BufferedImage.TYPE_BYTE_BINARY, false, 0);
	        String chaine = request.getParameter("nomproduit")+request.getParameter("idproduit");
		    //Generate the barcode
		    bean.generateBarcode(canvas, chaine);
		    //Signal end of generation
		    getServletContext().getRequestDispatcher(VUE_QRCODE).forward(request, response);
		    canvas.finish();
		} finally {
		    out.close();
		}
	}
	
	

}
