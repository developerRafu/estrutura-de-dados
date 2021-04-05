package Pilha;

public class Pilha {
	private int n = -1;
	private String pilha[] = new String[100];

	public boolean isEmpty() {
		return (n == -1);
	}

	public boolean isFull() {
		return (n == pilha.length);
	}

	public void push(String msg) {
		if (isFull()) {
			System.out.println("Pilha cheia, dê o pop");
		} else {
			n++;
			pilha[n] = msg;
		}
	}

	public String pop() {
		if (isEmpty()) {
			return "Pilha vazia, dê o push";
		} else {
			String retorno = pilha[n];
			pilha[n] = null;
			n--;
			return retorno;
		}
	}

	public String peek() {
		if (isEmpty()) {
			return "Pilha vazia, dê o push";
		} else {
			return pilha[n];
		}
	}
}
