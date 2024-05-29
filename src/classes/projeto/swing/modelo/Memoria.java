package classes.projeto.swing.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
    
    public static final  Memoria instanciar = new Memoria();
    private  String textoAtual ="";
    private final List<MemoriaObservador> observadors = new ArrayList<>();
    private TipoComando ultimaOperaçao = null;
    private  boolean substituir = false;
    private String textoDeAgora = "";
    private String textoBuffer = "";


    private  enum TipoComando{
      ZERAR,NUMERO,DIV,MULT,SUB,SOMA,IGUAL,VIRGULA;
    }
    private Memoria(){

    }

    public void adicionarObservador(MemoriaObservador observador){
        observadors.add(observador);
    }

    public static  Memoria getInstancia(){
        return instanciar;
    }

    public String getTextoAtual(){
        return textoAtual.isEmpty() ?"0": textoAtual;
    }

    public void processaComando(String texto){
        TipoComando tipoComando = detectarTipoComando(texto);

        if (tipoComando == null){
            return;
        }else if(tipoComando == TipoComando.ZERAR){
          substituir = false;
            textoAtual = "";
          textoBuffer = "";
          textoDeAgora = "";
          ultimaOperaçao = null;
        }else if(tipoComando == TipoComando.NUMERO || tipoComando == TipoComando.VIRGULA){
            textoAtual = substituir ? texto : texto + textoAtual;
            substituir = false;
        }else{
            substituir = true;
            textoAtual = obterResultadoOperacao();
            textoBuffer = textoAtual;
            ultimaOperaçao = tipoComando;
        }

        textoAtual+=texto;
        observadors.forEach(o->o.valorAlterado(getTextoAtual()));

    }

    private String obterResultadoOperacao() {
        if (ultimaOperaçao == null || ultimaOperaçao == TipoComando.IGUAL){
         return textoAtual;
        }
        double numeroBuffer = Double.parseDouble(textoBuffer.replace(",","."));
        double numeroAtual = Double.parseDouble(textoAtual.replace(",","."));
        double resultado = 0;

        if (ultimaOperaçao == TipoComando.SOMA){
             resultado = numeroBuffer + numeroAtual;
        }else if(ultimaOperaçao == TipoComando.SUB){
          resultado = numeroBuffer - numeroAtual;
        }else if(ultimaOperaçao == TipoComando.MULT){
            resultado = numeroBuffer * numeroAtual;
        }else if(ultimaOperaçao == TipoComando.DIV){
            resultado = numeroBuffer / numeroAtual;
        }
        String resultadoString = Double.toString(resultado).replace(".",",");
        boolean inteiro = resultadoString.endsWith(",0");


        return  inteiro ? resultadoString.replace(",0",""): resultadoString;
    }

    private TipoComando detectarTipoComando(String texto) {
        if (texto.isEmpty() && texto == "0") {
            return null;
        }

        try {
            Integer.parseInt(texto);
            return TipoComando.NUMERO;
        }catch (NumberFormatException e){
           if ("AC".equals(texto)){
                 return TipoComando.ZERAR;
           }else if("/".equals(texto)){
               return TipoComando.DIV;
           }else if("*".equals(texto)){
            return TipoComando.MULT;
           }else if("+".equals(texto)){
                return TipoComando.SOMA;
           }else if("-".equals(texto)){
               return TipoComando.SUB;
           }else if("=".equals(texto)){
               return TipoComando.IGUAL;
           }else if(",".equals(texto) && !textoAtual.contains(",")){
            return TipoComando.VIRGULA;
           }



        }

        return  null;
    }

}
