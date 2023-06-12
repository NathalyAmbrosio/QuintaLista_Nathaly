/* Crie uma classe "vovoh" que tenha um metodo construtor
Nathaly Ambrosio
11/06/2023
 */
public class Vovoh {
    private String nome;
    private int idade;

    public Vovoh(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void saudacao() {
        System.out.println("Oi boy, sou a Vovoh " + this.nome + " e tenho " + this.idade + " anos!");
    }

    public static void main(String[] args) {
        Vovoh vovoh = new Vovoh("Nathaly Ambrosio", 99);
        vovoh.saudacao();
    }
}

