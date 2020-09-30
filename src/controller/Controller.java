package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.JavaBeans;

@WebServlet(urlPatterns = { "/Controller", "/insert", "/update1", "/update2", "/delete" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	JavaBeans cliente = new JavaBeans();

	DAO dao = new DAO();

	public Controller() {
		super();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();

		if (action.equals("/insert")) {
			novoCliente(request, response);
		} else if (action.contentEquals("/update1")) {
			editarCliente(request, response);
		} else if (action.contentEquals("/update2")) {
			editarCliente2(request, response);
		} else if (action.contentEquals("/delete")) {
			excluirCliente(request, response);
		}
	}


	protected void novoCliente(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nomecliente = request.getParameter("nomecliente");
		String cpf = request.getParameter("cpf");
		String sexo = request.getParameter("sexo");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		String tipo = request.getParameter("tipo");
		String logradouro = request.getParameter("logradouro");
		String numero = request.getParameter("numero");
		String complemento = request.getParameter("complemento");
		String bairro = request.getParameter("bairro");
		String cep = request.getParameter("cep");
		String nomeusuario = request.getParameter("nomeusuario");
		String senha = request.getParameter("senha");

		cliente.setNomecliente(nomecliente);
		cliente.setCpf(cpf);
		cliente.setSexo(sexo);
		cliente.setEmail(email);
		cliente.setTelefone(telefone);
		cliente.setTipo(tipo);
		cliente.setLogradouro(logradouro);
		cliente.setNumero(numero);
		cliente.setComplemento(complemento);
		cliente.setBairro(bairro);
		cliente.setCep(cep);
		cliente.setNomeusuario(nomeusuario);
		cliente.setSenha(senha);

		dao.novoCliente(cliente);

		response.sendRedirect("index.jsp");

	}


	protected void editarCliente(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idcliente = request.getParameter("idcliente");
		cliente.setIdcliente(idcliente);

		dao.listarCliente(cliente);

		request.setAttribute("idcliente", cliente.getIdcliente());
		request.setAttribute("nomecliente", cliente.getNomecliente());
		request.setAttribute("cpf", cliente.getCpf());
		request.setAttribute("sexo", cliente.getSexo());
		request.setAttribute("email", cliente.getEmail());
		request.setAttribute("telefone", cliente.getTelefone());
		request.setAttribute("tipo", cliente.getTipo());
		request.setAttribute("logradouro", cliente.getLogradouro());
		request.setAttribute("numero", cliente.getNumero());
		request.setAttribute("complemento", cliente.getComplemento());
		request.setAttribute("bairro", cliente.getBairro());
		request.setAttribute("cep", cliente.getCep());
		request.setAttribute("nomeusuario", cliente.getNomeusuario());
		request.setAttribute("senha", cliente.getSenha());


		RequestDispatcher rd = request.getRequestDispatcher("editar.jsp");
		rd.forward(request, response);
	}


	protected void editarCliente2(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		cliente.setIdcliente(request.getParameter("idcliente"));
		cliente.setNomecliente(request.getParameter("nomecliente"));
		cliente.setCpf(request.getParameter("cpf"));
		cliente.setSexo(request.getParameter("sexo"));
		cliente.setEmail(request.getParameter("email"));
		cliente.setTelefone(request.getParameter("telefone"));
		cliente.setTipo(request.getParameter("tipo"));
		cliente.setLogradouro(request.getParameter("logradouro"));
		cliente.setNumero(request.getParameter("numero"));
		cliente.setComplemento(request.getParameter("complemento"));
		cliente.setBairro(request.getParameter("bairro"));
		cliente.setCep(request.getParameter("cep"));
		cliente.setNomeusuario(request.getParameter("nomeusuario"));
		cliente.setSenha(request.getParameter("senha"));

		dao.alterarCliente(cliente);

		response.sendRedirect("index.jsp");

	}


	protected void excluirCliente(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idcliente = request.getParameter("idcliente");


		cliente.setIdcliente(idcliente);
		dao.deletarCliente(cliente);
		response.sendRedirect("index.jsp");
	}

}
