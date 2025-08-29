package aula11_29_08_2025;

import java.util.UUID;

public class Cliente extends Pessoa{
    private int pontos;

    public Cliente() {
    }

    public Cliente(UUID id, String nome, int pontos) {
        super(id, nome);
        this.pontos = pontos;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }


}
