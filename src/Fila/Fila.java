package Fila;

public class Fila {
	private String[] fila;
	private String ultimo;
	private String primeiro;

	public Fila() {
		fila = new String[10];
		ultimo = null;
		primeiro = null;
	}

	public boolean isEmpty() {
		return fila[0] == null;
	}

	public boolean isFull() {
		return fila[9] != null;
	}

	public boolean inserir(String txt) {
		if(isFull()) {
			System.out.println("====================Fila cheia====================");
			return false;
		}else {
			if(isEmpty()) {
				primeiro=txt;
				fila[0] = txt;
			}else {
			for(int i=0; i<10;i++) {
				if(fila[i] == null) {
					fila[i] = txt;
					return true;
				}
			}
			}
		}
		return false;
	}
	public String remove() {
		String item = null;
		if(isEmpty()) {
			return "====================Fila vazia====================";
		}else {
			item = fila[0];
			fila[0] = null;
			for(int i=0; i<10;i++) {
				if(i!=0) {
					fila[i-1] = fila[i];
				}
				if(fila[i]==null) {
					ultimo = fila[i];
				}
			}
		}
		return item;
	}
}
