package classes.streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FiltroDesafio {
    public static void main(String[] args) {
        Consumer<Object> print = System.out::print;
        Predicate<ClienteAposentadoria> temContribuicoes = (c)->c.contribuicoes >=180;
        Predicate<ClienteAposentadoria> tempoDeTrabalaho = (c)->c.tempoDeTrabalho >=15;
        Function<ClienteAposentadoria,String>mensagens = (m)-> m.nome + " " + "PARABENS VOCÊ CONSEGUI SUA APOSENTADORIA" + "\n";

        ClienteAposentadoria c1 = new ClienteAposentadoria("Natan",10,14,30);
        ClienteAposentadoria c2 = new ClienteAposentadoria("Carlos",200,10,59);
        ClienteAposentadoria c3 = new ClienteAposentadoria("Rita", 180,20,60);
        ClienteAposentadoria c4 = new ClienteAposentadoria("Latin",180,23,62);
        List<ClienteAposentadoria> clienteAposentadorias = Arrays.asList(c1,c2,c3,c4);

        clienteAposentadorias.stream().filter(temContribuicoes).filter(tempoDeTrabalaho).map(mensagens).forEach(print);
    }
}
