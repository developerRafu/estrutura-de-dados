package Pilha;

import java.util.Scanner;

public class MainPilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Comandos:\n" + "empilhar: push\n" + "desempilhar: pop\n" + "olhar o ultimo: peek\n"
					+ "sair: out\n" + "entrada: ");
			String in = sc.nextLine().toLowerCase().trim();
			if (in.equals("push")) {
				System.out.println("======================================================");
				System.out.print("insira um texto: ");
				String entrar = sc.nextLine().trim().toLowerCase(); 
				pilha.push(entrar);
			} else if (in.equals("pop")) {
				System.out.println("Pop: "+pilha.pop());
			} else if (in.equals("peek")) {
				System.out.println("Peek: "+pilha.peek());
			} else if (in.equals("out")) {
				break;
			} else {
				System.out.println("==================Comando inválido, tente novamente==================");
			}
			System.out.println("======================================================");
		}
		sc.close();
		System.out.println("Saindo..");
	}
}
