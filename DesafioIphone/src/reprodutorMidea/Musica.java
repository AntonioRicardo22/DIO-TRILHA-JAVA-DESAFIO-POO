package reprodutorMidea;

public class Musica implements Reproduzir , Pausar , Selecionar{

	@Override
	public void reproduzir() {
		System.out.println("Tocando Musicaaaaaa!! ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pausar() {
		System.out.println("Múscia Pausada");
		
	}

	@Override
	public void selecionar() {
		System.out.println("Musica Selecionada MPB");
		
	}
	
	

}
