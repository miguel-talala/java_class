package _poo._exvetores.src.entities;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    //construtor
    public Pessoa(String name, int idade, double altura) {
        this.nome = name;
        this.idade = idade;
        this.altura = altura;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    //Metodo para checar idade media.






    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
