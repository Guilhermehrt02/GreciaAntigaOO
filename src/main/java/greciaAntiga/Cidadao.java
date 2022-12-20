package greciaAntiga;

public abstract class Cidadao extends Ateniense{
	private Cidadao proxima;
	public abstract int soma();
	public Cidadao getProxima() {
		return proxima;
	}
	public void setProxima(Cidadao proxima) {
		this.proxima = proxima;
	}
	
}
