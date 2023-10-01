package JogoServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/jogo")

public class Jogoservlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        int numero1 = Integer.parseInt(request.getParameter("numero1")); 
        int numero2 = Integer.parseInt(request.getParameter("numero2"));
        int numero3 = Integer.parseInt(request.getParameter("numero3"));
        int numero4 = Integer.parseInt(request.getParameter("numero4"));
        int numero5 = Integer.parseInt(request.getParameter("numero5"));
      
        boolean par1 = numero1 % 2 == 0;
        boolean par2 = numero2 % 2 == 0;
        boolean par3 = numero3 % 2 == 0;
        boolean par4 = numero4 % 2 == 0;
        boolean par5 = numero5 % 2 == 0;
        
        PrintWriter out = response.getWriter();
        out.write("<!DOCTYPE html>\n"
        	    + "<html>\n"
        	    + "<head>\n"
        	    + "<link rel=\"stylesheet\"  href=\"style.css\">"
        	    + "<title>Resultados do Jogo</title>\n"
        	    + "</head>\n"
        	    + "<body>\n"
        	    + "<h1>Resultados do Jogo</h1>\n"
        	    + "<p>Números Pares: ");
        	if (par1) {
        	    out.write(numero1 + " ");
        	}
        	if (par2) {
        	    out.write(numero2 + " ");
        	}
        	if (par3) {
        	    out.write(numero3 + " ");
        	}
        	if (par4) {
        	    out.write(numero4 + " ");
        	}
        	if (par5) {
        	    out.write(numero5 + " ");
        	}
        	out.write("</p>\n"
        	    + "<p>Números Ímpares: ");
        	if (!par1) {
        	    out.write(numero1 + " ");
        	}
        	if (!par2) {
        	    out.write(numero2 + " ");
        	}
        	if (!par3) {
        	    out.write(numero3 + " ");
        	}
        	if (!par4) {
        	    out.write(numero4 + " ");
        	}
        	if (!par5) {
        	    out.write(numero5 + " ");
        	}
        	out.write("</p>\n"
        	    + "<a href='index.html'>Voltar para a página inicial</a>\n"
        	    + "</body>\n"
        	    + "</html>");
	}

}
