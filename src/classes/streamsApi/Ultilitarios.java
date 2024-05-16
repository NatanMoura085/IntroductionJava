package classes.streamsApi;

import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Ultilitarios {



    public final static UnaryOperator<String> DeixaMaiuscula = (n) -> n.toUpperCase();
    public final static UnaryOperator<String> pegaPrimeiraLetra = (n) -> n.charAt(0) + "";
    public final static Function<Integer, String> StringBinaryy = (n) -> Integer.toBinaryString(n).replace("", " ");
    public final static Function<String, String> StringIverte = (n1) -> new StringBuilder(n1).reverse().toString();
   public final static Function<String,String > converteParaInteiro = (n2) ->{
       String transfor =  new StringBuilder(n2).reverse().toString().replace(" ","");
       List<String> partes = new ArrayList<>();
       for (int i =0; i<transfor.length();i+=4) partes.add(transfor.substring(i, Math.min(i+4,transfor.length())));
       Stream<Integer> traaaa =  partes.stream().map(n->Integer.parseInt(n,2));

       traaaa.forEach(System.out::println);

       return   "\n";
   };

}