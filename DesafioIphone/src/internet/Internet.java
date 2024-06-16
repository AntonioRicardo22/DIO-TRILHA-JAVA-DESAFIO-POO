package internet;

public class Internet implements AdicionarNovaAba, AtualizarPagina, ExibirPagina {

	@Override
	public void exibirPagina() {
		System.out.println("Exbindooo conteúdo da páginaaa");	
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Carregandooo a páginaaa");	
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando e abrindo uma nova páginaaa");
		
	}

}
