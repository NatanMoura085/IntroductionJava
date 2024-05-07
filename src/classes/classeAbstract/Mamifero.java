package classes.classeAbstract;

public  abstract class Mamifero  extends  Animal{
    @Override
    public String respira() {
        return "respira com  zoi";
    }

    @Override
    public double mover() {
        return 20.6;
    }

    public abstract String mamar();
}
