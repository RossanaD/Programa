import java.util.ArrayList;

public class Sala {

	private String nomeSala;
	private int lotacao;
	private ArrayList<Pessoas> pessoas = new ArrayList<>();
	private int Max = 1;
	
	public Sala(String nomeSala, int lotacao) {
		this.setNomeSala(nomeSala);
		this.setLotacao(lotacao);
	}

	public String toString() {
		return nomeSala;
	}
	
	public void addPessoa(Pessoas p) {
		if(getMax() <= getLotacao()) {
			pessoas.add(p);
			Max++;
		}else {
			throw new IllegalArgumentException("Sala lotada");
		}
	}
	
	public String getNomeSala() {
		return nomeSala;
	}

	public void setNomeSala(String nomeSala) {
		if(nomeSala == null || nomeSala.isEmpty()) {
			throw new IllegalArgumentException("Nome da sala não pode ser vazio");
		}
		this.nomeSala = nomeSala;
	}

	public int getLotacao() {
		return lotacao;
	}

	public void setLotacao(int lotacao) {
		this.lotacao = lotacao;
	}
		
	public int getMax() {
		return Max;
	}

	public String exibir() {
		String str = "";
		for(Pessoas p : pessoas) {
			str += "Nome: "+p.getNome()+" "+p.getSobrenome()+"\n";
		}
		return str;
	}
}
