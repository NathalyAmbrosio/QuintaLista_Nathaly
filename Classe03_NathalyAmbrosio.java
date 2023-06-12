/* Crie uma classe "casa" que tenha 10 atributos e 6 métodos
Nathaly Ambrosio
11/06/2023
 */
public class Casa {
    private boolean possuiPiscina;
    private boolean possuiVaranda;
    private String tipoPiso;
    private boolean possuiLareira;
    private int numeroVagasGaragem;
    private double areaTerreno;
    private boolean possuiChurrasqueira;
    private String sistemaSeguranca;
    private String endereco;
    private int numeroQuartos;
    
    // Construtor
    public Casa(String endereco, int numeroQuartos) {
        this.endereco = endereco;
        this.numeroQuartos = numeroQuartos;
    }
    
    // Métodos de acesso (getters) para alguns atributos
    
    public boolean isPossuiPiscina() {
        return possuiPiscina;
    }
    
    public boolean isPossuiVaranda() {
        return possuiVaranda;
    }
    
    public String getTipoPiso() {
        return tipoPiso;
    }
    
    public boolean isPossuiLareira() {
        return possuiLareira;
    }
    
    // Métodos de ação (outros métodos)
    
    public double calcularValorVenda() {
        // Lógica para calcular o valor de venda da casa
        return 500.0; // Valor de exemplo, substitua pela lógica real
    }
    
    public double calcularValorAluguel() {
        // Lógica para calcular o valor do aluguel da casa
        return 1256.0; // Valor de exemplo, substitua pela lógica real
    }
    
    public boolean verificarPiscina() {
        return possuiPiscina;
    }
    
    public boolean verificarVaranda() {
        return possuiVaranda;
    }
    
    public String verificarSeguranca() {
        return sistemaSeguranca;
    }
    
    // Método main
    public static void main(String[] args) {
        // Criando um objeto da classe Casa
        Casa minhaCasa = new Casa("Rua das Flores, 123", 3);
        
        // Atribuindo valores aos atributos
        minhaCasa.possuiPiscina = true;
        minhaCasa.possuiVaranda = true;
        minhaCasa.tipoPiso = "Porcelanato";
        minhaCasa.possuiLareira = false;
        minhaCasa.numeroVagasGaragem = 2;
        minhaCasa.areaTerreno = 300.0;
        minhaCasa.possuiChurrasqueira = true;
        minhaCasa.sistemaSeguranca = "Alarme";
        
        // Chamando os métodos da classe
        double valorVenda = minhaCasa.calcularValorVenda();
        double valorAluguel = minhaCasa.calcularValorAluguel();
        boolean temPiscina = minhaCasa.verificarPiscina();
        boolean temVaranda = minhaCasa.verificarVaranda();
        String sistemaSeguranca = minhaCasa.verificarSeguranca();
        
        // Exibindo os resultados
        System.out.println("Valor de Venda: " + valorVenda);
        System.out.println("Valor de Aluguel: " + valorAluguel);
        System.out.println("Possui Piscina: " + temPiscina);
        System.out.println("Possui Varanda: " + temVaranda);
        System.out.println("Sistema de Segurança: " + sistemaSeguranca);
    }
}
