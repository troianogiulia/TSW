package it.unisa.control;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.unisa.model.ProdottoBean;
import it.unisa.model.ProdottoDao;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProdottoDao dao = new ProdottoDao();
		
		ArrayList<ArrayList<ProdottoBean>> categorie = new ArrayList<>();
		String redirectedPage = request.getParameter("page");
		
		try {
			ArrayList<ProdottoBean> al = dao.doRetrieveByCategoria("Alimentazione");
			ArrayList<ProdottoBean> Acc = dao.doRetrieveByCategoria("Accessori");
			ArrayList<ProdottoBean> Elet = dao.doRetrieveByCategoria("Elettronica");
			ArrayList<ProdottoBean> Gio = dao.doRetrieveByCategoria("Gioielli");
			ArrayList<ProdottoBean> Giochi = dao.doRetrieveByCategoria("Giochi e Giocattoli");
			
			categorie.add(al);
			categorie.add(Acc);
			categorie.add(Elet);
			categorie.add(Gio);
			categorie.add(Giochi);

			request.getSession().setAttribute("categorie", categorie);
			

			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/" + redirectedPage);
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
