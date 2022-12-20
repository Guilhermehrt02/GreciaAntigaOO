package greciaAntiga;

public abstract class Liga {
	private Combate combate;
	public void chamarCombater() {
		combate.combater();
	}
	public Combate getCombate() {
		return combate;
	}
	public void setCombate(Combate combate) {
		this.combate = combate;
	}
	
}
