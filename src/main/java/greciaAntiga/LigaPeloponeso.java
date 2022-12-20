package greciaAntiga;

public class LigaPeloponeso extends Liga{
	private String[] aliados;
	private boolean muralhaDerrubada;
	private Esparta esparta = new Esparta();
	public void defende() {
		chamarCombater();
	}
	public String[] getAliados() {
		return aliados;
	}
	public void setAliados(String[] aliados) {
		this.aliados = aliados;
	}
	public boolean isMuralhaDerrubada() {
		return muralhaDerrubada;
	}
	public void setMuralhaDerrubada(boolean muralhaDerrubada) {
		this.muralhaDerrubada = muralhaDerrubada;
	}
	public Esparta getEsparta() {
		return esparta;
	}
	public void setEsparta(Esparta esparta) {
		this.esparta = esparta;
	}
	
}
