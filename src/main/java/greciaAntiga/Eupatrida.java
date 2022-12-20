package greciaAntiga;

public class Eupatrida extends Cidadao {
	private String posse;
	
	public int soma() {
		if(getProxima()!=null){
			return 2+getProxima().soma();
		}else {
			return 2;
		} 
	}

	public String getPosse() {
		return posse;
	}

	public void setPosse(String posse) {
		this.posse = posse;
	} 
	
}
