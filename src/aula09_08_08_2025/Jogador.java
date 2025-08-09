package aula09_08_08_2025;

import java.util.UUID;

public class Jogador {
    private UUID id;
    private String nome;
    private String numero;

    
    public Jogador(UUID id, String nome, String numero) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
    }
    public Jogador() {
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    
}
