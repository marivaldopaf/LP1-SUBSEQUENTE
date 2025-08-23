package aula10_22_08_2025;

public class Ebook extends Obra{
    
    private String urlMarcaDagua;
 
    public Ebook() {
        super();
    }
    public Ebook(int id, String titulo, String iSBN, double valor, String urlMarcaDagua) {
            super(id, titulo, iSBN, valor);
            this.urlMarcaDagua = urlMarcaDagua;
    }
    public String getUrlMarcaDagua() {
        return urlMarcaDagua;
    }
    public void setUrlMarcaDagua(String urlMarcaDagua) {
        this.urlMarcaDagua = urlMarcaDagua;
    }

    
}
