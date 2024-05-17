package classes.streamsApi;

public class MediaTest {
    public static void main(String[] args) {
        Media media = new Media().AdicionaValor(4.6).AdicionaValor(7.0);
        Media media1 = new Media().AdicionaValor(9.0).AdicionaValor(10.0);

        System.out.print(media.combinar(media,media1).getValor());
    }
}
