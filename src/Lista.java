import java.util.ArrayList;
import java.util.List;

public class Lista {

	private List<Pessoa> listaDePessoas = new ArrayList<>();

	public void inserir(Pessoa p) {
		listaDePessoas.add(p);
	}

	public String remover(String nome) {
		Pessoa p = new Pessoa();
		for (int i = 0; i < listaDePessoas.size(); i++) {
			p.setNome(listaDePessoas.get(i).getNome());
			if (p.getNome().equals(nome)) {
				listaDePessoas.remove(i);
				return "Pessoa removida";
			}
		}
		return "Pessoa não existe";
	}

	public void inserirNoInicio(Pessoa p) {
		List<Pessoa> listaNova = new ArrayList<>();
		listaNova.add(p);
		listaNova.addAll(this.listaDePessoas);
		this.listaDePessoas = listaNova;
	}

	public void inserirNoMeio(Pessoa p, int index) {
		try {
		List<Pessoa> listaNova = new ArrayList<>();
		for(int i=0; i<listaDePessoas.size();i++) {
			if(i==index) {
				listaNova.add(p);
			}
			listaNova.add(listaDePessoas.get(i));
		}
		listaDePessoas = listaNova;
		}catch (Exception e) {
			System.out.println("Lista  muito curta");
		}
	}

	public String exibirLista() {
		String exibir = "";
		for (int i = 0; i < listaDePessoas.size(); i++) {
			exibir = exibir + "" + listaDePessoas.get(i).toString() +"\n";
		}
		exibir = exibir.trim();
		return exibir;
	}
}
