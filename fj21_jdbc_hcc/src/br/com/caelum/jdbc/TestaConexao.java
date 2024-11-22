package br.com.caelum.jdbc;
import java.sql.Connection;
import java.sql.SQLException;
public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta!");
		connection.close();
		
		String sql = "insert into contatos " +
				"(nome,email,endereco, dataNascimento)" +
				" values (?,?,?,?)";
		
		stmt.setString(1, "Caelum");
		stmt.setString(2, "contato@caelum.com.br");
		stmt.setString(3, "R. Vergueiro 3185 cj57");

		java.sql.Date dataParaGravar = new java.sql.Date(
				Calendar.getInstance().getTimeInMillis());
				stmt.setDate(4, dataParaGravar);




