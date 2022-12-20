package greciaAntiga;

public class App {

	public static void main(String[] args) {
		Esparciata e = new Esparciata();
		e.setExperienciaGuerra(10);
		e.setNome("Joao");
		e.setRei("Pedro");
		Escravo es = new Escravo();
		es.setDono("Pedro");
		es.setFilosofo(false);
		es.setNome("Carlos");
		//padrão cadeia de responsabilidade
		Eupatrida c1 = new Eupatrida();
		c1.setPosse("escravos");
		c1.setNome("Guilherme");
		Eupatrida c2 = new Eupatrida();
		c2.setPosse("castelo");
		c2.setNome("Fernando");
		HomemAdulto c3 = new HomemAdulto();
		c3.setIdade(25);
		c3.setNome("Leonardo");
		c2.setProxima(c3);
		c1.setProxima(c2);
		Democracia dem = new Democracia();
		dem.setDireta(true);
		dem.setPrimeiro(c1);
		System.out.println("--Contagem de votos na democracia ateniense--\n");
		System.out.println("Total de votos: "+dem.votos());
		
		//padrão estratégia
		PolisGrega p = new Atenas();
		p.setEconomia("comercio maritmo");
		p.setLocalizacao("Africa");
		p.setEducacao(new Cientifica());
		p.setAlunos(new String[10]);
		System.out.println("\n--Resultado da educação dos alunos--\n");
		System.out.println("\nAlunos formados= "+p.analisar());
		
		
		//padrão mediador
		Atacar a = new Atacar();
		Defender d = new Defender();
		LigaDelos delos = new LigaDelos();
		delos.setSede("Atenas");
		LigaPeloponeso peloponeso = new LigaPeloponeso();
		String[] al = {"Corinto", "Elida"};
		peloponeso.setAliados(al);
		delos.setCombate(a);
		a.setDelos(delos);
		a.setPeloponeso(peloponeso);
		delos.ataca();
		System.out.println("\n--Guerra do Peloponeso--\n");
		System.out.println("Liga de Delos ataca");
		System.out.println("Liga de Delos possui novo territorio= "
							+delos.isNovoTerritorio());
		System.out.println("Liga do Peloponeso possui a muralha derrubada= "
							+peloponeso.isMuralhaDerrubada());

	}

}
