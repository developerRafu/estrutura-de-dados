package Fila;

import java.util.Scanner;

public class MainFila {

	public static void main(String[] args) {
		Fila fila = new Fila();
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				System.out.print("Comandos:\n"
						+ "inserir: inserir\n"
						+ "remover: remover\n"
						+ "sair: sair\n"
						+ "entrada: ");
				String in = sc.nextLine().trim().toLowerCase();
				if(in.equals("inserir")) {
					System.out.println("====================Inserir texto====================");
					System.out.print("Entrada:");
					String insert = sc.nextLine().trim().toLowerCase();
					fila.inserir(insert);
				}else if (in.equals("remover")) {
					System.out.println(fila.remove());
				}else if(in.equals("sair")) {
					break;
				}else {
					System.out.println("Comando inválido, tente novamente");
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Saindo...");
	}

}
