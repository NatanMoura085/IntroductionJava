package classes.padroes;

public class AniversarioSupressa {
    public static void main(String[] args) {
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();
        porteiro.registrarObservador(e->{
            System.out.print("Aqui esta");
            System.out.print(e.getMomento());
        });

        porteiro.monitorar();

    }

}
