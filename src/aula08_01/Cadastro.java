package aula08_01;

import java.util.List;
import java.util.UUID;

public class Cadastro {
    
    public static void main(String[] args) {

    Endereco end1 = new Endereco();
    Endereco end2 = new Endereco();
    Piloto piloto = new Piloto();
    Piloto copiloto = new Piloto();
    Passageiro passageiro = new Passageiro();
    Passageiro passageiro2 = new Passageiro();
    Aeronave aeronave = new Aeronave();
    Voo voo = new Voo();

    end1.setId(UUID.randomUUID());
    end1.setBairro("Barroca");
    end1.setRua("Rua D");
    end2.setId(UUID.randomUUID());
    end2.setBairro("BTN");
    end2.setRua("Rua E");


    piloto.setId(UUID.randomUUID());
    piloto.setNome("Zezinho");
    piloto.setCpf("12345678989");
    piloto.setEndereco(end1);
    copiloto.setId(UUID.randomUUID());
    copiloto.setNome("Zezinho");
    copiloto.setCpf("12345678989");
    copiloto.setEndereco(end1);

    passageiro.setId(UUID.randomUUID());
    passageiro.setCpf("456987123");
    passageiro.setNome("Aya Nakamura");
    passageiro.setEndResidencial(end1);
    passageiro2.setId(UUID.randomUUID());
    passageiro2.setCpf("98765432155");
    passageiro2.setNome("Ze Ramalho");
    passageiro2.setEndResidencial(end1);

    aeronave.setId(UUID.randomUUID());
    aeronave.setCodigo("3054");
    aeronave.setModelo("A320-233");
    aeronave.setPiloto(piloto);
    aeronave.setCopiloto(copiloto);

    voo.setId(UUID.randomUUID());
    voo.setDestino("São Paulo");
    voo.setOrigem("Paulo Afonso");
    voo.setAeronave(aeronave);
    voo.setPassageiros(List.of(passageiro,passageiro2));
 
    }
    
    
}
