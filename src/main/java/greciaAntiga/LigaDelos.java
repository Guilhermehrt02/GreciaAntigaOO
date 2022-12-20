package greciaAntiga;

public class LigaDelos extends Liga{
	private String sede;
	private boolean novoTerritorio;
	private Atenas atenas = new Atenas();
	private Esparta esparta = new Esparta();
	public void ataca() {
		chamarCombater();
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public boolean isNovoTerritorio() {
		return novoTerritorio;
	}
	public void setNovoTerritorio(boolean novoTerritorio) {
		this.novoTerritorio = novoTerritorio;
	}
	public Atenas getAtenas() {
		return atenas;
	}
	public void setAtenas(Atenas atenas) {
		this.atenas = atenas;
	}
	public Esparta getEsparta() {
		return esparta;
	}
	public void setEsparta(Esparta esparta) {
		this.esparta = esparta;
	}
	
}
