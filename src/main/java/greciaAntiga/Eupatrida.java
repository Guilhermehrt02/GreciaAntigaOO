package greciaAntiga;

public class Eupatrida extends Cidadao {
	private String posse;
	
	public int soma() {
		if(getProxima()!=null){
			return 1+getProxima().soma();
		}else {
			return 1;
		} 
	}

	public String getPosse() {
		return posse;
	}

	public void setPosse(String posse) {
		this.posse = posse;
	} 
	
}
