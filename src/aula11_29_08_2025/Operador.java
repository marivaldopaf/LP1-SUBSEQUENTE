package aula11_29_08_2025;

import java.util.UUID;

public class Operador extends Pessoa {
    private String ctps;

    public Operador(UUID id, String nome, String ctps) {
        super(id, nome);
        this.ctps = ctps;
    }

    public Operador() {
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

}
