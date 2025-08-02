package aula06_listas;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    int id;
    LocalDateTime data;
    String status;
    double valorTotal;
    List<Produto> produtos;
}
