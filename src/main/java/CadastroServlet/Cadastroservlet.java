package CadastroServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/cadastro")
public class Cadastroservlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
        String modelo = request.getParameter("modelo");
        String marca = request.getParameter("marca");
        Integer anoFabricacao = Integer.parseInt(request.getParameter("anoFabricacao")); 
		
        Carro carro = new Carro();
        carro.setModelo(modelo);
        carro.setMarca(marca);
        carro.setAnoFabricacao(anoFabricacao);

 
        PrintWriter out = response.getWriter();
        out.write("<html>"
		+ "<head>"
		+ "<meta charset=\"ISO-8859-1\">"
		+ "<title>Pagina inicial</title>"
		+ "<link rel=\"stylesheet\"  href=\"style.css\">"
		+ "</head>"
		+ "<body>"
		+ "<a href=\"index.html\">Home</a><br>"
		+ "<h1>Cadastrado com sucesso!</h1>"
		+ "<ul>"
        + "<li>Modelo: " + carro.getModelo() + "</li>"
        + "<li>Marca: " + carro.getMarca() + "</li>"
        + "<li>Ano de Fabricação: " + carro.getAnoFabricacao() + "</li>"
        + "</ul>"
		+ "</body>"
		+ "</html>"
		);
	}
	}
