package aula11_29_08_2025;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Cadastro {
    public static void main(String[] args) {
        Operador operador = new Operador();
        operador.setId(UUID.randomUUID());
        operador.setCtps("123456-BA");
        operador.setNome("Marivaldo");

        Cliente cliente = new Cliente();
        cliente.setId(UUID.randomUUID());
        cliente.setNome("Eliomar");
        cliente.setPontos(10);

        Produto produto1 = new Produto();
        produto1.setId(UUID.randomUUID());
        produto1.setCodigo("125564643");
        produto1.setNome("Cuscuz");
        produto1.setValor(new BigDecimal(2.59));

        Produto produto2 = new Produto();
        produto2.setId(UUID.randomUUID());
        produto2.setCodigo("545555455");
        produto2.setNome("Mel");
        produto2.setValor(new BigDecimal(13.00));


        Pedido pedido = new Pedido();
        pedido.setId(UUID.randomUUID());
        pedido.setCliente(cliente);
        pedido.setData(LocalDateTime.now());
        pedido.setOperador(operador);
        pedido.setProdutos(List.of(produto1, produto2));
        pedido.setValorTotal(new BigDecimal(500));


        System.out.println("********* RECIBO ***********");
        System.out.println("ID: " + pedido.getId());
        System.out.println("Data: " + pedido.getData());
        System.out.println("Cliente " + pedido.getCliente().getNome());
        System.out.println("Operador" + pedido.getOperador().getNome());
        System.out.println("ITENS");
        
        //enheacend = melhorado
        for(Produto p: pedido.getProdutos()){
            System.out.println("Código: " + p.getCodigo());
            System.out.println("Nome: " + p.getNome());
            System.out.println("Valor: " + p.getValor());
        }
        System.out.println("TOTAL: " + pedido.getValorTotal());
       
        
    }
}
