/*crie uma classe chamada "alimento" e atribua 10 atributos a ela 
Nathaly Ambrosio
11/06/2023
 */
public class Alimento {
    private String nome;
    private int calorias;
    private double preco;
    private int quantidade;
    private String marca;
    private boolean contemLactose;
    private boolean vegano;
    private boolean semGluten;
    private String dataValidade;
    private String descricao;

    // Construtor
    public Alimento(String nome, String categoria, double preco, int quantidade, String marca, boolean organico,
                    boolean vegano, boolean semGluten, String dataValidade, String descricao) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
        this.quantidade = quantidade;
        this.marca = marca;
        this.organico = contemLactose;
        this.vegano = vegano;
        this.semGluten = semGluten;
        this.dataValidade = dataValidade;
        this.descricao = descricao;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean iscontemLactose() {
        return contemLactose;
    }

    public void setContemLactose(boolean contemLactose) {
        this.contemLactose = contemLactose;
    }

    public boolean isVegano() {
        return vegano;
    }

    public void setVegano(boolean vegano) {
        this.vegano = vegano;
    }

    public boolean isSemGluten() {
        return semGluten;
    }

    public void setSemGluten(boolean semGluten) {
        this.semGluten = semGluten;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
