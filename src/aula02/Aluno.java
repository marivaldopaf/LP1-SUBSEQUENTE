package aula02;

public class Aluno {
    String nome;
    Integer idade = 0;
    String matricula = "0";

    //Método construtor vazio - padrão
    public Aluno(){
        this.nome = "funalo";
        System.out.println("Chamou o construtor vazio\n");
    }
    //Podemos ter vários métodos construtores
    public Aluno(String n){
        this.nome = n;

    }
    //Podemos ter vários métodos construtores
    public Aluno(String nome, int idade, String matricula){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;

    }

    //Funções (métodos) normais
    //Todo método normal, tem: retorno - nome - parâmetros
    //Chamamos isso de assinatura do método
    public void imprimirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Matrícula: " + this.matricula);
    }

}
