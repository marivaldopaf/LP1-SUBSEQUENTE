package aula09_08_08_2025;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class CadastroPartida {
    public static void main(String[] args) {
        
        Endereco endereco = new Endereco();
        Estadio estadio = new Estadio();
        Jogador jog1 = new Jogador();
        Jogador jog2 = new Jogador();
        Jogador jog3 = new Jogador();
        Jogador jog4 = new Jogador();
        Jogador jog5 = new Jogador();
        Jogador jog6 = new Jogador();
        Partida partida = new Partida();
        Time mandante = new Time();
        Time visitante = new Time();

        endereco.setId(UUID.randomUUID());
        endereco.setRua("Da Gangorra");
        endereco.setBairro("Alves de Souza");

        estadio.setId(UUID.randomUUID());
        estadio.setNome("Rubeleno");
        estadio.setEndereco(endereco);

        jog1.setId(UUID.randomUUID());
        jog1.setNome("Marivaldo");;
        jog1.setNumero("13");

        jog2.setId(UUID.randomUUID());
        jog2.setNome("Eliomar");;
        jog2.setNumero("10");

        jog3.setId(UUID.randomUUID());
        jog3.setNome("Maria Eduarda - Madú");;
        jog3.setNumero("09");

        jog4.setId(UUID.randomUUID());
        jog4.setNome("Othon");;
        jog4.setNumero("22");

        jog5.setId(UUID.randomUUID());
        jog5.setNome("Fabiano");;
        jog5.setNumero("07");

        jog6.setId(UUID.randomUUID());
        jog6.setNome("Silvio");;
        jog6.setNumero("99");

        mandante.setId(UUID.randomUUID());
        mandante.setNome("Corinthians");
        mandante.setJogadores(List.of(jog1,jog3,jog2));

        visitante.setId(UUID.randomUUID());
        visitante.setNome("Flamengo");
        visitante.setJogadores(List.of(jog5,jog4,jog6));     

            
        partida.setId(UUID.randomUUID());
        partida.setData(LocalDateTime.now());
        partida.setEstadio(estadio);
        partida.setTimeMandante(mandante);
        partida.setTimeVisitante(visitante);



        System.out.println("==============================================");
        System.out.println("Amistoso entre: " + partida.getTimeMandante().getNome()+" vs "+partida.getTimeVisitante().getNome());
        System.out.println("Jogadores do time Mandante: ");
                            for (Jogador j : partida.getTimeMandante().getJogadores()) {
                                System.out.println("ID: "+ j.getId());
                                System.out.println("Nome: "+ j.getNome());
                                System.out.println("Número: "+ j.getNumero());
                            }
                            System.out.println("Jogadores do time Visitante: ");
                            for (Jogador j : partida.getTimeVisitante().getJogadores()) {
                                System.out.println("ID: "+ j.getId());
                                System.out.println("Nome: "+ j.getNome());
                                System.out.println("Número: "+ j.getNumero());    
                            }
        System.out.println("======= Endereço da Partida ====");
        System.out.println("Estadio: " + partida.getEstadio().getNome());
        System.out.println("Rua: " + partida.getEstadio().getEndereco().getRua());
        System.out.println("Bairro: " + partida.getEstadio().getEndereco().getBairro());
              

    }
}
