package HW26_BC09.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import HW26_BC09.entity.Product;

@WebServlet(name = "productsController", urlPatterns = {"/products"})
public class ProductController extends HttpServlet{
	List<Product> productList = new ArrayList<Product>();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("products.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String productName = req.getParameter("name_product");
		int quantity = Integer.parseInt(req.getParameter("quantity"));
		double price = Double.parseDouble(req.getParameter("cost"));
		
		Product product = new Product(productName, quantity, price);
		productList.add(product);
		
		req.setAttribute("productListTable", productList); // Set productListTable <-- productList
		req.getRequestDispatcher("products.jsp").forward(req, resp);
		
	}
}
