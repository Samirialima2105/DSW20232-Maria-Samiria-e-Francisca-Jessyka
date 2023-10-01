package JogoServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class jogoservlet
 */
@WebServlet(urlPatterns="/jogo")
//é usada em classes Servlet em Java para especificar as configurações de mapeamento do Servlet,
//ou seja, para indicar a URL ou URLs às quais o Servlet deve responder.
public class Jogoservlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// recebe informações sobre a solicitação (por meio do objeto HttpServletRequest)
		//e permite que o Servlet processe a solicitação e gere uma resposta (por meio do objeto HttpServletResponse).
		
        int numero1 = Integer.parseInt(request.getParameter("numero1")); 
        int numero2 = Integer.parseInt(request.getParameter("numero2"));
        int numero3 = Integer.parseInt(request.getParameter("numero3"));
        int numero4 = Integer.parseInt(request.getParameter("numero4"));
        int numero5 = Integer.parseInt(request.getParameter("numero5"));
//está realizando a conversão de valores de entrada fornecidos como strings em valores inteiros.
      
        boolean par1 = numero1 % 2 == 0;
        boolean par2 = numero2 % 2 == 0;
        boolean par3 = numero3 % 2 == 0;
        boolean par4 = numero4 % 2 == 0;
        boolean par5 = numero5 % 2 == 0;
//Se o resultado for igual a zero, isso significa que numero2 é divisível por 2 e, portanto, é um número par. Nesse caso, par2 será true,
//indicando que numero2 é par. Caso contrário, se o resultado não for zero, par2 será false, indicando que numero2 é ímpar.
        
        PrintWriter out = response.getWriter();
//serve para criar um objeto PrintWriter que permite escrever dados, como HTML na resposta HTTP que será enviada ao cliente. 
        // Escreva a página HTML de resposta
        
        
        //está criando dinamicamente uma página HTML como resposta a uma solicitação HTTP
        //este código cria dinamicamente uma página HTML que exibe os resultados de um jogo, mostrando quais números são pares
        //e quais são ímpares, com base nas condições definidas. 
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
