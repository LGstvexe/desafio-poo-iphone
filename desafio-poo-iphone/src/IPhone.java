public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	// Reprodutor Musical
	public void tocar() {
		System.out.println("TOCANDO MUSICA");
	}

	public void pausar() {
		System.out.println("MUSICA PAUSADA");
	}

	public String selecionarMusica(String musica) {
		return "MUSICA " + musica + " SELECIONADA.";
	}

	// Aparelho Telefonico

	public void atender() {
		System.out.println("ATENDER LIGAÇÃO");
	}

	public void iniciarCorreioVoz() {
		System.out.println("CORREIO DE VOZ INICIADO");
	}

	public String ligar(String numero) {
		return "LIGANDO PARA O NÚMERO: " + numero;
	}

	// Navegador da Internet

	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA");
	}

	public void adicionarNovaAba() {
		System.out.println("NOVA ABA ABERTA");
	}

	public String exibirPagina(String url) {
		return "EXIBINDO A PÁGINA DO URL: " + url;
	}

}
