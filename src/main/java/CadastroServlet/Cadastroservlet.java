package CadastroServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cadastroservlet
 */
@WebServlet(urlPatterns="/cadastro")
public class Cadastroservlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //O valor do campo de entrada é recuperado como uma string e armazenado na variável modelo
		//esse código está extraindo informações de um formulário HTML submetido pelo cliente
		//Ele coleta essas informações como strings e, no caso do "ano de fabricação", converte-o em um número inteiro. 
        String modelo = request.getParameter("modelo");
        String marca = request.getParameter("marca");
        Integer anoFabricacao = Integer.parseInt(request.getParameter("anoFabricacao")); 

        //está criando uma instância da classe Carro e definindo seus atributos com os valores obtidos anteriormente
        //Isso significa que você está criando um novo carro(objeto) em memória que pode ser usado para armazenar informações sobre um veículo.
        //Esses valores são coletados anteriormente a partir dos parâmetros da solicitação HTTP e estão sendo usados 
        //para definir as características do objeto carro. 
        Carro carro = new Carro();
        carro.setModelo(modelo);
        carro.setMarca(marca);
        carro.setAnoFabricacao(anoFabricacao);

 
        PrintWriter out = response.getWriter();

        // O código que você forneceu está gerando uma página HTML como resposta a uma solicitação HTTP. 
        //você gera páginas dinâmicas com informações específicas com base nos dados do sistema ou nas entradas do usuário. 
        //a página está exibindo uma mensagem de sucesso de cadastro e os detalhes do carro cadastrado.
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