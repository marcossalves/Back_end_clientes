package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3307/dbapnoramic2?userTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "senac@senac";

	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		return con;

	}


	public void novoCliente(JavaBeans cliente) {

		String create = "insert into clientes (nomecliente,cpf,sexo,email,telefone,tipo,logradouro,numero,complemento,bairro,cep,nomeusuario,senha) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {

			Connection con = conectar();

			PreparedStatement pst = con.prepareStatement(create);


			pst.setString(1, cliente.getNomecliente());
			pst.setString(2, cliente.getCpf());
			pst.setString(3, cliente.getSexo());
			pst.setString(4, cliente.getEmail());
			pst.setString(5, cliente.getTelefone());
			pst.setString(6, cliente.getTipo());
			pst.setString(7, cliente.getLogradouro());
			pst.setString(8, cliente.getNumero());
			pst.setString(9, cliente.getComplemento());
			pst.setString(10, cliente.getBairro());
			pst.setString(11, cliente.getCep());
			pst.setString(12, cliente.getNomeusuario());
			pst.setString(13, cliente.getSenha());

			pst.executeUpdate();
 
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}


	public ArrayList<JavaBeans> listarClientes() {

		ArrayList<JavaBeans> clientes = new ArrayList<>();

		String read = "select * from clientes";
		try {

			Connection con = conectar();

			PreparedStatement pst = con.prepareStatement(read);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {

				String idcliente = rs.getString(1);
				String nomecliente = rs.getString(2);
				String cpf = rs.getString(3);
				String sexo = rs.getString(4);
				String email = rs.getString(5);
				String telefone = rs.getString(6);
				String tipo = rs.getString(7);
				String logradouro = rs.getString(8);
				String numero = rs.getString(9);
				String complemento = rs.getString(10);
				String bairro = rs.getString(11);
				String cep = rs.getString(12);
				String nomeusuario = rs.getString(13);
				String senha = rs.getString(14);

				clientes.add(new JavaBeans(idcliente, nomecliente, cpf, sexo, email, telefone, tipo, logradouro, numero,
						complemento, bairro, cep, nomeusuario, senha));
			}

			return clientes;
		
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}


	public void listarCliente(JavaBeans cliente) {

		String update1 = "select * from clientes where idcliente=?";
		try {

			Connection con = conectar();

			PreparedStatement pst = con.prepareStatement(update1);

			pst.setString(1, cliente.getIdcliente());

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {

				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				System.out.println(rs.getString(6));
				System.out.println(rs.getString(7));
				System.out.println(rs.getString(8));
				System.out.println(rs.getString(9));
				System.out.println(rs.getString(10));
				System.out.println(rs.getString(11));
				System.out.println(rs.getString(12));
				System.out.println(rs.getString(13));
				System.out.println(rs.getString(14));

				cliente.setIdcliente(rs.getString(1));
				cliente.setNomecliente(rs.getString(2));
				cliente.setCpf(rs.getString(3));
				cliente.setSexo(rs.getString(4));
				cliente.setEmail(rs.getString(5));
				cliente.setTelefone(rs.getString(6));
				cliente.setTipo(rs.getString(7));
				cliente.setLogradouro(rs.getString(8));
				cliente.setNumero(rs.getString(9));
				cliente.setComplemento(rs.getString(10));
				cliente.setBairro(rs.getString(11));
				cliente.setCep(rs.getString(12));
				cliente.setNomeusuario(rs.getString(13));
				cliente.setSenha(rs.getString(14));
				con.close();
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}


	public void alterarCliente(JavaBeans cliente) {


		String update2 = "update clientes set nomecliente=?,cpf=?,sexo=?,email=?,telefone=?,tipo=?,logradouro=?,numero=?,complemento=?,bairro=?,cep=?,nomeusuario=?,senha=? where idcliente=?";
		try {
			

						Connection con = conectar();

						PreparedStatement pst = con.prepareStatement(update2);

						pst.setString(1, cliente.getNomecliente());
						pst.setString(2, cliente.getCpf());
						pst.setString(3, cliente.getSexo());
						pst.setString(4, cliente.getEmail());
						pst.setString(5, cliente.getTelefone());
						pst.setString(6, cliente.getTipo());
						pst.setString(7, cliente.getLogradouro());
						pst.setString(8, cliente.getNumero());
						pst.setString(9, cliente.getComplemento());
						pst.setString(10, cliente.getBairro());
						pst.setString(11, cliente.getCep());
						pst.setString(12, cliente.getNomeusuario());
						pst.setString(13, cliente.getSenha());
						pst.setString(14, cliente.getIdcliente());

						pst.executeUpdate();

						con.close();

		} catch (Exception e) {
			System.out.println(e);
			
			
		}

	}


	public void deletarCliente(JavaBeans cliente) {

		String delete = "delete from clientes where idcliente=?";
		try {

			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(delete);

			pst.setString(1, cliente.getIdcliente()); //(4)

			pst.executeUpdate(); //(5)
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}


