package greciaAntiga;

public class HomemAdulto extends Cidadao {
	private int idade;
	
	public int soma() {
		if(getProxima()!=null){
			return 1+getProxima().soma();
		}else {
			return 1;
		} 
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
