import java.util.Objects;
import java.util.Random;

public class Girafa extends Animal {
    private double tamanhoDoPescoco;

    public Girafa(double peso, int idade, double tamanhoDoPescoco) {
        super(peso, idade);
        this.tamanhoDoPescoco = tamanhoDoPescoco;
    }

    public double getTamanhoDoPescoco() {
        return tamanhoDoPescoco;
    }

    public void setTamanhoDoPescoco(double tamanhoDoPescoco) {
        this.tamanhoDoPescoco = tamanhoDoPescoco;
    }

    @Override
    public String toString() {
        return "Girafa{" +
                "peso=" + super.getPeso() +
                ", idade=" + super.getIdade() +
                ", tamanhoDoPescoco=" + tamanhoDoPescoco +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Girafa girafa)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(getTamanhoDoPescoco(), girafa.getTamanhoDoPescoco()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTamanhoDoPescoco());
    }

    public static Girafa criaGirafa() {
        Random r = new Random();
        return new Girafa(r.nextDouble(90, 150), r.nextInt(100), r.nextDouble(0.3, 1.5));
    }
}
