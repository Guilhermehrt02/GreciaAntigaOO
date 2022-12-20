package greciaAntiga;

public class Democracia {
	private Cidadao primeiro;
	private boolean direta;
	public int votos() {
		return primeiro.soma();
	}
	public Cidadao getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(Cidadao primeiro) {
		this.primeiro = primeiro;
	}
	public boolean isDireta() {
		return direta;
	}
	public void setDireta(boolean direta) {
		this.direta = direta;
	}
	
}
