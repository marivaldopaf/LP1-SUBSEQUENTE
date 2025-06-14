package aula04;

public class App2 {
    public static void main(String[] args) {
        Aluno aluno  = new Aluno();
        System.out.println("Nome  " + aluno.nome);

        aluno.nome = " Mari";
        System.out.println("Nome: " + aluno.nome);

        Aluno aluno2 = new Aluno("Goku");
        aluno2.nome = "Madimbu";
        System.out.println("Nome: " + aluno2.nome);

        
        //CONSTRUTOR COM PARÂMETROS
        Aluno aluno3 = new Aluno(10, "Pelé", 90, null);
        System.out.println();
        System.out.println("Nome: " + aluno3.nome);
    }
}
