package greciaAntiga;

public class Defender implements Combate{
	private LigaDelos delos;
	private LigaPeloponeso peloponeso;
	
	public void combater() {
		delos.setNovoTerritorio(false);
		peloponeso.setMuralhaDerrubada(false);
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
