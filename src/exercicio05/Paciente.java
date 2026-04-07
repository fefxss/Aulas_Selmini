package exercicio05;

public class Paciente {
    private String nome;
    private double altura;

    //CONSTRUTOR
    public Paciente(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;

    }



}
