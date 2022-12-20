package greciaAntiga;

import java.util.ArrayList;
import java.util.List;

public class Atenas extends PolisGrega {
	private String governante;
	private List<Ateniense> atenienses = new ArrayList<Ateniense>();
	private Democracia democracia = new Democracia();
	public String getGovernante() {
		return governante;
	}
	public void setGovernante(String governante) {
		this.governante = governante;
	}
	public Democracia getDemocracia() {
		return democracia;
	}
	public void setDemocracia(Democracia democracia) {
		this.democracia = democracia;
	}
	public List<Ateniense> getAtenienses() {
		return atenienses;
	}
	public void setAtenienses(List<Ateniense> atenienses) {
		this.atenienses = atenienses;
	}
	
	
}
