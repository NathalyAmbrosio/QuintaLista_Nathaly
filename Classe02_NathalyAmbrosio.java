/*Crie uma classe que tenha 5 metodos
Nathaly ambrosio
11/06/2023
 */
public class Cinto {
    private String cor;
    private int tamanho;
    private boolean fivelaAutomatica;

    // Construtor
    public Cinto(String cor, int tamanho, boolean fivelaAutomatica) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.fivelaAutomatica = fivelaAutomatica;
    }

    // Método para ajustar o tamanho do cinto
    public void ajustarTamanho(int novoTamanho) {
        this.tamanho = novoTamanho;
    }

    // Método para trocar a cor do cinto
    public void trocarCor(String novaCor) {
        this.cor = novaCor;
    }

    // Método para ativar a fivela automática
    public void ativarFivelaAutomatica() {
        this.fivelaAutomatica = true;
    }

    // Método para desativar a fivela automática
    public void desativarFivelaAutomatica() {
        this.fivelaAutomatica = false;
    }

    // Método para exibir informações do cinto
    public void exibirInformacoes() {
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Fivela automática: " + (fivelaAutomatica ? "Sim" : "Não"));
    }

    // Método main
    public static void main(String[] args) {
        // Criando um objeto da classe Cinto
        Cinto mySinto = new Cinto("Verde", 100, true);

        // Ajustando o tamanho do cinto
        mySinto.ajustarTamanho(105);

        // Trocando a cor do cinto
        mySinto.trocarCor("Preto");

        // Desativando a fivela automática
        mySinto.ativarFivelaAutomatica();

        // Exibindo informações do cinto
        mySinto.exibirInformacoes();
    }
}
