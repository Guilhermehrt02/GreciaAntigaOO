package greciaAntiga;

public abstract class PolisGrega extends Comunidade{
	private String[] alunos;
	private Educacao educacao;
	public boolean analisar() {
		if(educacao!=null) {
			return educacao.educar(alunos);
		}else {
			return false;
		}
	}
	public String[] getAlunos() {
		return alunos;
	}
	public void setAlunos(String[] alunos) {
		this.alunos = alunos;
	}
	public Educacao getEducacao() {
		return educacao;
	}
	public void setEducacao(Educacao educacao) {
		this.educacao = educacao;
	}
	
}
