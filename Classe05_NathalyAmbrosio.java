/* Crie uma classe "piso de madeira" que tenha no mínimo 10 atributos e 10 métodos
Nathaly Ambrosio
11/06/2023
 */
public class PisoDeMadeira {
    private String tipoMadeira;
    private double espessura;
    private String cor;
    private boolean resistenteAgua;
    private boolean antiDerrapante;
    private boolean possuiAcabamento;
    private boolean resistenteRiscos;
    private boolean ecologicamenteCorreto;
    private boolean facilInstalacao;
    private double precoMetroQuadrado;

    // Construtor
    public PisoDeMadeira(String tipoMadeira, double espessura, String cor, double precoMetroQuadrado) {
        this.tipoMadeira = tipoMadeira;
        this.espessura = espessura;
        this.cor = cor;
        this.precoMetroQuadrado = precoMetroQuadrado;
    }

    // Métodos de acesso (getters e setters) para alguns atributos

    public String getTipoMadeira() {
        return tipoMadeira;
    }

    public void setTipoMadeira(String tipoMadeira) {
        this.tipoMadeira = tipoMadeira;
    }

    public double getEspessura() {
        return espessura;
    }

    public void setEspessura(double espessura) {
        this.espessura = espessura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Métodos de ação (outros métodos)

    public void aplicarAcabamento() {
        if (!possuiAcabamento) {
            System.out.println("Acabamento aplicado no piso de madeira.");
            possuiAcabamento = true;
        } else {
            System.out.println("O piso de madeira já possui acabamento.");
        }
    }

    public void limparPiso() {
        System.out.println("Piso de madeira limpo.");
    }

    public void ajustarEspessura(double novaEspessura) {
        System.out.println("Espessura do piso de madeira ajustada para: " + novaEspessura + " mm");
        espessura = novaEspessura;
    }

    public double calcularPrecoTotal(double area) {
        return precoMetroQuadrado * area;
    }

    // Método main
    public static void main(String[] args) {
        // Criando um objeto da classe PisoDeMadeira
        PisoDeMadeira piso = new PisoDeMadeira("Camaru", 40.0, "Cerne castanho-claro-amarelado", 150.0);

        // Chamando os métodos da classe
        piso.aplicarAcabamento();
        piso.limparPiso();
        piso.ajustarEspessura(25.0);

        // Exibindo os resultados
        System.out.println("Tipo de Madeira: " + piso.getTipoMadeira());
        System.out.println("Espessura: " + piso.getEspessura());
        System.out.println("Cor: " + piso.getCor());
        double precoTotal = piso.calcularPrecoTotal(80.0);
        System.out.println("Preço Total: " + precoTotal);
    }
}
