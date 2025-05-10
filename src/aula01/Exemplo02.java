package aula01;
public class Exemplo02 {

    public static void main(String[] args) {
        int idade = 37; //primitivo
        Integer idade2 = 37; //classe wrapper (ínvolucro)
        Integer idadeTemp = idade; // a partir do java 5, a conversão do ti´po primitivo é automática.
        idade = idadeTemp; // o contrário também

        double altura = 1.85; // primitiva
        Double altura2 = 1.85; //classe wrapper
        altura = altura2; //conversão (Cast ou Casting) automática
        altura2 = altura; // o contrário também converte
        
        String idadeText = "37";
        idade = Integer.parseInt(idadeText);
        
        String alturaTexto = "1.85";
        altura = Double.parseDouble(alturaTexto);


        boolean ativo = true;
        Boolean ativo2 = false;
        ativo = ativo2;
        ativo2 = ativo;

        //Convertendo de numerico para string
        //Sempre que concatenamos qualquer tipo com uma String, ouseja, com aspas,
        //todod o contexto se torna string
        alturaTexto = altura +"";
        alturaTexto = String.valueOf(altura); //Casting usando a classe

    }
    
}
