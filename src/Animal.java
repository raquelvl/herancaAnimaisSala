import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public abstract class Animal {
    private double peso;
    private int idade;

    public Animal(double peso, int idade) {
        this.peso = peso;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "peso=" + peso +
                ", idade=" + idade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return Double.compare(getPeso(), animal.getPeso()) == 0 && getIdade() == animal.getIdade();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPeso(), getIdade());
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {

        Random r = new Random();
        List<Animal> as = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            int tipo = r.nextInt(2);
            if(tipo == 0)
                as.add(Girafa.criaGirafa());
            else
                as.add(Jumento.criaJumento());
        }
        for (int i = 0; i < as.size(); i++) {
            System.out.println(as.get(i).toString());
        }


    }

}
