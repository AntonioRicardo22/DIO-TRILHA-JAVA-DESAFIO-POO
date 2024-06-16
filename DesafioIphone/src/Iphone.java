import reprodutorMidea.*;
import internet.*;
import aparelhoTelefonico.*;
public class Iphone {
	
	

	public static void main (String[] args) {
		
		System.out.println("-----------------------");
		System.out.println("TELEFONE");
		System.out.println("-----------------------");
			
		Atender atender = new Telefone();
		IniciarCorreioDeVoz correio = new Telefone();
		Ligar ligar = new Telefone();
		
		ligar.ligar();
		atender.atender();
		correio.iniciarCorreioDeVoz();
		
		System.out.println("-----------------------");
		System.out.println("Internet");
		System.out.println("-----------------------");
		 AdicionarNovaAba adicionar = new Internet();
		 AtualizarPagina atualizar = new Internet();
		 ExibirPagina exibir = new Internet();
		 
		 adicionar.adicionarNovaAba();
		 atualizar.atualizarPagina();
		 exibir.exibirPagina();
		 
		 
		System.out.println("-----------------------");
		System.out.println("Mideaaaaa");
		System.out.println("-----------------------");
		Selecionar selecionar =  new Video();
		Reproduzir reproduzir = new Video();
		Pausar pausar = new Video();
		
		selecionar.selecionar();
		reproduzir.reproduzir();
		pausar.pausar();
		System.out.println("-----------------------");
		Selecionar selecionarM =  new Musica();
		Reproduzir reproduzirM = new Musica();
		Pausar pausarM = new Musica();
		
		selecionarM.selecionar();
		reproduzirM.reproduzir();
		pausarM.pausar();
				
	}
	

}
