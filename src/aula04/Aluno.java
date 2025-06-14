package aula04;

public class Aluno {
    Integer id;
    String nome;
    Integer idade;
    Matricula matricula;



    //MÉTODOS CONSTRUTORES
    //tem dois objetivos
        //1º  criar a instância 9objeto)
        //2º aplicar algum comportamento
    // sua assinatura é diferente ( não tem retorno)
        //eo nome é sempre igual ao da classe    
    public Aluno(){
        System.out.println("\nChamou construtor!");
        nome = "fulano";    
    }

    //CONSTRUTOR SEM PARÂMETROS
    public Aluno(String nome){
        this.nome = nome;
    }
    //CONSTRUTOR COM PARÂMETROS
    public Aluno(int id, String nome, int idade, Matricula matricula){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;

    }

    
  
    //Assinatura do método tem...
    //Proteção + retorno + nome + parâmetros "0 ou N's"
    public void imprimirDados(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Matrícula Código: "+ matricula.numero);
        System.out.println("Matrícula Status: "+ matricula.status);
        System.out.println("Matrícula Data: "+ matricula.dataHora);
        System.out.println();
    }
    //sobre carga de métodos
    // A OO permite declarar métodos com a mesma assinatura
    // porém, com parâmetros distintos 

    public void imprimirDados(int ordem) {
        System.out.println("\nAluno: "+ ordem);
        imprimirDados();
    }
}
