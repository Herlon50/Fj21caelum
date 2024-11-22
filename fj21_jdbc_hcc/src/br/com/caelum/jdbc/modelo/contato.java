package br.com.caelum.jdbc.modelo;
public class contato {
	
	private Long id;
	private String nome;
	private String email;
	private String endereco;
	private Calendar dataNascimento;
	// métodos get e set para id, nome, email, endereco e dataNascimento
	public String getNome() {
	return this.nome;
	}
	public void setNome(String novo) {
	this.nome = novo;
	}
	public String getEmail() {
	return this.email;
	}
	public void setEmail(String novo) {
	this.email = novo;
	}
	public String getEndereco() {
	return this.endereco;
	}
	public void setEndereco(String novo) {
	this.endereco = novo;
	}
	public Long getId() {
	return this.id;
	}
	public void setId(Long novo) {
	this.id = novo;
	}
	public Calendar getDataNascimento() {
	return this.dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
	this.dataNascimento = dataNascimento;
	
	String sql = "insert into contatos " +
			"(nome,email,endereco,dataNascimento) " +
			"values (?,?,?,?)";
	stmt.setString(1, "Caelum");
	stmt.setString(2, "contato@caelum.com.br");
	stmt.setString(3, "R. Vergueiro 3185 cj57");
	
	}
}
