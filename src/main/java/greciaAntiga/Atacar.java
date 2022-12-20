package greciaAntiga;

public class Atacar implements Combate{
	private LigaDelos delos;
	private LigaPeloponeso peloponeso;
	
	public void combater() {
		delos.setNovoTerritorio(true);
		peloponeso.setMuralhaDerrubada(true);
	}

	public LigaDelos getDelos() {
		return delos;
	}

	public void setDelos(LigaDelos delos) {
		this.delos = delos;
	}

	public LigaPeloponeso getPeloponeso() {
		return peloponeso;
	}

	public void setPeloponeso(LigaPeloponeso peloponeso) {
		this.peloponeso = peloponeso;
	}
	
}
