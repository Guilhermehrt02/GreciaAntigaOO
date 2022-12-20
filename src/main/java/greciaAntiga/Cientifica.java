package greciaAntiga;

public class Cientifica implements Educacao{
	private String cientista;
	
	public boolean educar(String[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println("aluno "+(i+1)+" inteligente!");
		}
		return true;
	}

	public String getCientista() {
		return cientista;
	}

	public void setCientista(String cientista) {
		this.cientista = cientista;
	}
	
}
