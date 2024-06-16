package reprodutorMidea;

public class Video implements Reproduzir, Pausar, Selecionar{

	@Override
	public void reproduzir() {
		System.out.println("Reproduzindo o videooo!! ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pausar() {
		System.out.println("Video Pausado!");
	}

	@Override
	public void selecionar() {	
		System.out.println("Selecionando Video no YouTube");
		
	}

}
