public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String numeroTelefone;
    private boolean emChamada;
    private String musicaAtual;
    private String paginaAtual;

    public iPhone(String modelo, String numeroTelefone) {
        this.modelo = modelo;
        this.numeroTelefone = numeroTelefone;
    }

    // Métodos da interface ReprodutorMusical
    @Override
    public void reproduzirMusica(String musica) {
        // Implementação da reprodução de música
        System.out.println("Reproduzindo música: " + musica);
        this.musicaAtual = musica;
    }

    @Override
    public void tocar() {
        // Implementação do método tocar
        if (musicaAtual != null) {
            System.out.println("Tocando música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada para tocar.");
        }
    }

    @Override
    public void pausar() {
        // Implementação do método pausar
        if (musicaAtual != null) {
            System.out.println("Pausando música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada para pausar.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        // Implementação do método selecionarMusica
        System.out.println("Selecionando música: " + musica);
        this.musicaAtual = musica;
    }

    // Métodos da interface AparelhoTelefonico
    @Override
    public void fazerLigacao(String numero) {
        // Implementação da realização de chamada telefônica
        System.out.println("Chamando o número: " + numero);
        this.emChamada = true;
    }

    @Override
    public void atenderChamada() {
        // Implementação do método atenderChamada
        if (emChamada) {
            System.out.println("Chamada atendida");
            emChamada = false;
        } else {
            System.out.println("Nenhuma chamada para atender.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação do método iniciarCorreioVoz
        if (emChamada) {
            System.out.println("Iniciando correio de voz...");
            emChamada = false;
        } else {
            System.out.println("Nenhuma chamada em andamento para iniciar o correio de voz.");
        }
    }

    // Métodos da interface NavegadorInternet
    @Override
    public void navegarInternet() {
        // Implementação da navegação na internet
        System.out.println("Navegando na internet");
    }

    @Override
    public void adicionarPagina(String pagina) {
        // Implementação do método adicionarPagina
        System.out.println("Adicionando página: " + pagina);
        this.paginaAtual = pagina;
    }

    @Override
    public void exibirPagina(String pagina) {
        // Implementação do método exibirPagina
        if (paginaAtual != null && paginaAtual.equals(pagina)) {
            System.out.println("Exibindo página: " + paginaAtual);
        } else {
            System.out.println("Página não encontrada.");
        }
    }

    @Override
    public void atualizarPagina(String pagina) {
        // Implementação do método atualizarPagina
        if (paginaAtual != null && paginaAtual.equals(pagina)) {
            System.out.println("Atualizando página: " + paginaAtual);
        } else {
            System.out.println("Página não encontrada.");
        }
    }
}
