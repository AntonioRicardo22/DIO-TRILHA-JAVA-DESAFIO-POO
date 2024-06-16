package aparelhoTelefonico;

public class Telefone implements IniciarCorreioDeVoz , Atender , Ligar {

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciandooo correio de voooz");
	}

	@Override
	public void ligar() {
		System.out.println("Ligandoooooooo");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendeeu: EM CHAMADA!");
	}

	

}
