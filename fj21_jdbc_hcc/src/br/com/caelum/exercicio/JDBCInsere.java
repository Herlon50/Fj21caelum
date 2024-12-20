package br.com.caelum.exercicio;
import java.util.calendar;
import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.caelum.jdbc.ConnectionFactory;

public class JDBCInsere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


Connection con = new ConnectionFactory().getConnection();

// cria um preparedStatement
String sql = "insert into contatos" +
" (nome,email,endereco,dataNascimento)" +
" values (?,?,?,?)";

PreparedStatement stmt = con.prepareStatement(sql);

// preenche os valores
stmt.setString(1, "Caelum");
stmt.setString(2, "contato@caelum.com.br");
stmt.setString(3, "R. Vergueiro 3185 cj57");
stmt.setDate(4, new java.sql.Date(


// executa
stmt.execute();
stmt.close();
System.out.println("Gravado!");
con.close();
}

		
	}


