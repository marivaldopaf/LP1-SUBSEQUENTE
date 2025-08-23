package aula10_22_08_2025;

public class Livro extends Obra{
    
    private int tiragem;

    public Livro() {
        super(); //invoca o super construtor da classe Obra
                 
    }
    // o comando THIS acessa a raiz da classe atual. (classe filha)
    // o comando SUPER acessa a raiz da superclasse. (classe mãe)
    public Livro(int id, String titulo, String iSBN, double valor, int tiragem) {
        super(id, titulo, iSBN, valor);
        this.tiragem = tiragem;        
    }
    public int getTiragem() {
        return tiragem;
    }
    public void setTiragem(int tiragem) {
        this.tiragem = tiragem;
    }
    


}
