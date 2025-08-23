package aula10_22_08_2025;

public class Teste {
    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.setTitulo("Java como programar");


        Ebook ebook = new Ebook();
        ebook.setTitulo("Manual de Código Civil");


        //Obra obra = new Obra();
        //Obra.setTitulo("O rei do Cangaço");

        
        //POLIMORFISMO
        //possibilita que um tipo receba outro compativel.
        Obra obraLivro = new Livro();
        Obra obraEbook = new Ebook();

        
        //Fazendo CASTING de superclasse(classe mãe) para a subclasse (Classe filha).
        Livro liv = (Livro) obraLivro;
        liv.setTiragem(300);

        Ebook ebo = (Ebook) obraEbook;
        ebo.setUrlMarcaDagua("https:// imagem.com");    

    }
}
