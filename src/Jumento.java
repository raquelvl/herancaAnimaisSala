import java.util.Objects;
import java.util.Random;

public class Jumento extends Animal {
    private double pesoDeCarga;

    public Jumento(double peso, int idade, double pesoDeCarga) {
        super(peso, idade);
        this.pesoDeCarga = pesoDeCarga;
    }

    public double getPesoDeCarga() {
        return pesoDeCarga;
    }

    public void setPesoDeCarga(double pesoDeCarga) {
        this.pesoDeCarga = pesoDeCarga;
    }

    @Override
    public String toString() {
        return "Jumento{" +
                super.toString() +
                ", pesoDeCarga=" + pesoDeCarga +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jumento jumento)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(getPesoDeCarga(), jumento.getPesoDeCarga()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPesoDeCarga());
    }

    public static Jumento criaJumento() {
        Random r = new Random();
        return new Jumento(r.nextDouble(30, 90), r.nextInt(45), r.nextDouble(0, 80));
    }
}
