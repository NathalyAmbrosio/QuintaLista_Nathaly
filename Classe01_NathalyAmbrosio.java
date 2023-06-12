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

    public Alimento(String nome, int calorias, double preco, int quantidade, String marca, boolean contemLactose,
                    boolean vegano, boolean semGluten, String dataValidade, String descricao) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
        this.quantidade = quantidade;
        this.marca = marca;
        this.contemLactose = contemLactose;
        this.vegano = vegano;
        this.semGluten = semGluten;
        this.dataValidade = dataValidade;
        this.descricao = descricao;
    }

    // Getters e Setters omitidos por brevidade
}

