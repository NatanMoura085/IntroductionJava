package classes.classeAbstract;

public class Cachorro  extends  Mamifero{
    @Override
    public String respira() {
        return "respira com nariz";
    }

    @Override
    public double mover() {
        return 999;
    }

    @Override
    public String mamar() {
        return "mamando";
    }
}
