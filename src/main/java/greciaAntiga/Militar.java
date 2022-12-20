package greciaAntiga;

public class Militar implements Educacao{
	private String capitao;
	public boolean educar(String[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println("aluno "+(i+1)+" apto para guerra!");
		}
		return true;
	}
	public String getCapitao() {
		return capitao;
	}
	public void setCapitao(String capitao) {
		this.capitao = capitao;
	}
	
}
