package strategy;

public class Automotriz implements Via{
    @Override
    public void enviar() {
        System.out.println("enviar por auto");
    }
}
