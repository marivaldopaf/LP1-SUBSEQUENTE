package aula04;

import java.time.LocalDateTime;

public class app {
    public static void main(String[] args) {

        Matricula m = new Matricula();
        m.id = 1;
        m.status = "Pendente";
        m.numero = "2025.22.0001";
        m.dataHora = LocalDateTime.now();


        Aluno aluno = new Aluno();
        aluno.id = 10;
        aluno.idade = 35;
        aluno.nome = "Jose Cicero";
        aluno.matricula = m;

        Aluno aluno2 = new Aluno();
        aluno2.id = 1;
        aluno2.idade = 34;
        aluno2.nome = "Marivaldo";
        aluno2.matricula = m;

        System.out.println("Alunos");
        System.out.println("Nome: "+aluno.nome);
        System.out.println("Idade: "+aluno.idade);
        System.out.println("Matrícula Código: "+aluno.matricula.numero);
        System.out.println("Matrícula Status: "+aluno.matricula.status);
        System.out.println("Matrícula Data: "+aluno.matricula.dataHora); 


        System.out.println("\nNome: "+aluno2.nome);
        System.out.println("Idade: "+aluno2.idade);
        System.out.println("Matrícula Código: "+aluno2.matricula.numero);
        System.out.println("Matrícula Status: "+aluno2.matricula.status);
        System.out.println("Matrícula Data: "+aluno2.matricula.dataHora);
            

    }
}
