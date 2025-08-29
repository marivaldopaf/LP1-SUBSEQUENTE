package aula11_29_08_2025;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Pedido {
    private UUID id;
    private LocalDateTime data;
    private BigDecimal valorTotal;
    private Operador operador;
    private Cliente cliente;
    private List <Produto> produtos;
   
    public Pedido(UUID id, LocalDateTime data, BigDecimal valorTotal, Operador operador, Cliente cliente,
            List<Produto> produtos) {
        this.id = id;
        this.data = data;
        this.valorTotal = valorTotal;
        this.operador = operador;
        this.cliente = cliente;
        this.produtos = produtos;
    }
    public Pedido() {
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public LocalDateTime getData() {
        return data;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }
    public BigDecimal getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    public Operador getOperador() {
        return operador;
    }
    public void setOperador(Operador operador) {
        this.operador = operador;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}
