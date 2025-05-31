package aula02;

public class CadastroAluno2 {
    public static void main(String[] args) {

        //Trabalhando o acesso e preenchimento dos
        //objetos através de suas variáveis

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.nome = "Marivaldo";
        aluno1.idade = 34;
        aluno1.matricula = "123456789";


        aluno2.nome = "Eliomar";
        aluno2.idade = 40;
        aluno2.matricula = "12365479";

        System.out.println("---------Aluno 01--------");
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Idade: "+ aluno1.idade);
        System.out.println("Matrícula: "+ aluno1.matricula);

        System.out.println("---------Aluno 02--------");
        System.out.println("Nome: " + aluno2.nome);
        System.out.println("Idade: "+ aluno2.idade);
        System.out.println("Matrícula: "+ aluno2.matricula);

        System.out.println("End memória aluno1:"+ aluno1);
        System.out.println("End memória aluno2:"+ aluno2);

        
    }
}
