import java.util.ArrayList;

public class EspacoCafe {

	private String nomeCafe;
	private int lotacaoCafe;
	private ArrayList<Pessoas> pessoa = new ArrayList<>();
	private int Max = 1;
	
	public EspacoCafe(String nomeCafe, int lotacaoCafe) {
		this.setNomeCafe(nomeCafe);
		this.setLotacaoCafe(lotacaoCafe);
	}
	
	public int getMax() {
		return Max;
	}
	
	public String toString() {
		return nomeCafe;
	}
	
	public void addPessoa(Pessoas p) {
		if(getMax() <= getLotacaoCafe()) {
			pessoa.add(p);
			Max++;
		}else {
			throw new IllegalArgumentException("Espaço Café lotado");
		}
	}
	
	public String getNomeCafe() {
		return nomeCafe;
	}

	public void setNomeCafe(String nomeCafe) {
		if(nomeCafe == null || nomeCafe.isEmpty()) {
			throw new IllegalArgumentException("Nome do espaço café não pode ser vazio");
		}
		this.nomeCafe = nomeCafe;
	}

	public int getLotacaoCafe() {
		return lotacaoCafe;
	}

	public void setLotacaoCafe(int lotacaoCafe) {
		this.lotacaoCafe = lotacaoCafe;
	}
	
	public String exibir() {
		String str = "";
		for(Pessoas p : pessoa) {
			str += "Nome: "+p.getNome()+" "+p.getSobrenome()+"\n";
		}
		return str;
	}
}
