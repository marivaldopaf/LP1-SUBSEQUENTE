package aula11_29_08_2025;

import java.math.BigDecimal;
import java.util.UUID;

public class Produto {
    private UUID id;
    private String codigo;
    private String nome;
    private BigDecimal valor;
    public Produto() {
    }
    public Produto(UUID id, String codigo, String nome, BigDecimal valor) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    

}
