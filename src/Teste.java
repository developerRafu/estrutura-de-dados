import java.util.Scanner;

public class Teste {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		Lista lista = new Lista();
		while (true) {
			System.out.println("================Lista de pessoas================");
			System.out.println(lista.exibirLista());
			System.out.print("Digite um dos comando para ação:\n" + "Adicionar uma pessoa: add\n"
					+ "Remover uma pessoa: remover\n" + "Fechar aplicação: sair\n" + "Comando: ");
			String in = sc.nextLine().trim().toLowerCase();

			if (in.equals("add")) {
				while (true) {
					System.out.println("=====================Aonde inserir=====================");
					System.out.print("Aonde deseja inserir?\n" + "Meio: meio\n" + "Início: inicio\n" + "Fim: fim\n"
							+ "Sair: sair\n" + "Comando: ");
					in = sc.nextLine().trim().toLowerCase();
					if (in.equals("meio")) {
						Pessoa p = new Pessoa();
						System.out.println("================Adicionar Pessoa================");
						System.out.print("Nome: ");
						p.setNome(sc.nextLine().trim().toLowerCase());
						System.out.print("Idade: ");
						p.setIdade(sc.nextLine().trim().toLowerCase());
						System.out.print("Posição: ");
						int i = sc.nextInt();
						sc.nextLine();
						lista.inserirNoMeio(p, i);
					} else if (in.equals("inicio")) {
						Pessoa p = new Pessoa();
						System.out.println("================Adicionar Pessoa================");
						System.out.print("Nome: ");
						p.setNome(sc.nextLine().trim().toLowerCase());
						System.out.print("Idade: ");
						p.setIdade(sc.nextLine().trim().toLowerCase());
						lista.inserirNoInicio(p);
					} else if (in.equals("fim")) {
						Pessoa p = new Pessoa();
						System.out.println("================Adicionar Pessoa================");
						System.out.print("Nome: ");
						p.setNome(sc.nextLine().trim().toLowerCase());
						System.out.print("Idade: ");
						p.setIdade(sc.nextLine().trim().toLowerCase());
						lista.inserir(p);
					} else if (in.equals("sair")) {
						break;
					} else {
						System.out.println("Comando inválido, tente novamente");
					}
				}
			} else if (in.equals("remover")) {
				System.out.println("================Remover Pessoa================");
				System.out.println(lista.exibirLista());
				System.out.print("Quem você deseja remover? ");
				in = sc.nextLine().trim().toLowerCase();
				System.out.println(lista.remover(in));
			} else if (in.equals("sair")) {
				break;
			} else {
				System.out.println("Comando inválido, tente novamente");
			}
		}
		sc.close();
		System.out.println("Aplicação encerrada");
	}

}
