
public class Pessoas {

	private String nome;
	private String sobrenome;
	private Sala sala;
	private EspacoCafe cafe;
	
	public Pessoas(String nome, String sobrenome) {	
		this.setNome(nome);
		this.setSobrenome(sobrenome);
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public EspacoCafe getCafe() {
		return cafe;
	}

	public void setCafe(EspacoCafe cafe) {
		this.cafe = cafe;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("Nome não pode ser vazio");
		}
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		if(sobrenome == null || sobrenome.isEmpty()) {
			throw new IllegalArgumentException("Sobrenome não pode ser vazio");
		}
		this.sobrenome = sobrenome;
	}
	
	public String exibir() {
		String str = "Nome: "+getNome()+" "+getSobrenome()
		+"\nSala: "+this.sala.getNomeSala()+"\nCafé: "+this.cafe.getNomeCafe()+"\n";
		return str;
	}
	
	public String toString() {
		return "Nome: "+getNome()+" "+getSobrenome();
	}
}
