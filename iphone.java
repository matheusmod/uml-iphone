public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String numeroTelefone;

    // Construtor
    public iPhone(String modelo, String numeroTelefone) {
        this.modelo = modelo;
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void reproduzirMusica(String musica) {
        // Implementação da reprodução de música
        System.out.println("Reproduzindo música: " + musica);
    }

    @Override
    public void fazerLigacao(String numero) {
        // Implementação da realização de chamada telefônica
        System.out.println("Chamando o número: " + numero);
    }

    // Métodos da interface NavegadorInternet
    @Override
    public void navegarInternet() {
        // Implementação da navegação na internet
        System.out.println("Navegando na internet");
    }
}
