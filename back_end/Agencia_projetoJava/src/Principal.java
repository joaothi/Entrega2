import java.util.Date;
import java.util.Scanner;

public class Principal {

	public static void main(String args[]) {

		ClienteDAO ClienteDAO = new ClienteDAO();

		System.out.println("===== Agenda =====");
		System.out.println("1 - Cadastro de contato");
		System.out.println("2 - Excluir contato");
		System.out.println("3 - Atualizar contato");
		System.out.println("4 - Mostrar contatos");
		System.out.println("5 - Buscar por ID");
		System.out.println("6 - Sair");
		System.out.println("Selecione uma opção");

		Scanner entrada = new Scanner(System.in);
		int opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Digite o nome");
			String nome = entrada.next();
			System.out.println("Digite a idade");
			int idade = entrada.nextInt();

			Cliente Cliente = new Cliente();
			Cliente.setNome(nome);
			Cliente.setIdade(idade);
			Cliente.setEndereco(endereco);
			Cliente.setCpf(cpf);

			contatoDAO.save(contato);
			break;

		case 2:
			System.out.println("Digite o código");
			int IdCliente = entrada.nextInt();

			contatoDAO.removeByid(codigo);
			break;

		case 3:
			System.out.println("Digite o Id do Cliente");
			int IdCliente1 = entrada.nextInt();
			System.out.println("Digite o novo nome");
			String novoNome = entrada.next();
			System.out.println("Digite a nova idade");
			int novaIdade = entrada.nextInt();
			System.out.println("Digite o novo Endereço");
			String novoEndereco = entrada.next();
			System.out.println("Digite o novo Cpf");
			String novoCpf = entrada.next();


			CLiente Cliente1 = new CLiente();
			Cliente1.setIdCliente(codigo2);
			Cliente1.setNome(novoNome);
			Cliente1.setIdade(novaIdade);
			Cliente1.setEndereco(novoEndereco);
			Cliente1.setCpf(novoCpf);
			contatoDAO.update(contato1);
			break;

		case 4:

			for (Contato c : contatoDAO.getContatos()) {

				System.out.println("NOME: " + c.getNome());
				System.out.println("IDADE: " + c.getIdade());
				System.out.println("ENDEREÇO: " + c.getEndereco());
				System.out.println("CPF: " + c.getCpf());
				System.out.println("----------------------------------- ");
			}
			break;

		

		case 6:
			System.out.println("PROGRAMA ENCERRADO");
			break;

		}

	}

}