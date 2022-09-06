import java.util.Date;
import java.util.List;

public class Cliente {

	private int idCliente;
	private String Nome;
	private int Idade;
	private String Endereco;
	private String Cpf;

	public int getIdCliente() {
		return idCliente;

	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;

	}

	public String getNome() {
		return Nome;

	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		this.Idade = idade;
	}
	
	
	public String getCpf() {
		return Cpf;

	}

	public void setCpf(String Cpf) {
		this.Cpf = Cpf;
	}
	
	
	
	public String getEndereco() {
		return Endereco;

	}

	public void setEndereco(String Endereco) {
		this.Endereco = Endereco;
	}

	public void add(List<Cliente> cliente) {
		// TODO Auto-generated method stub
		
	}

	
}