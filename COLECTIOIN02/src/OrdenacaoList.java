import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoList {
    public static void main(String[] args) throws Exception {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Anny", "Verde", 9));
            add(new Gato("Kira", "Rosa", 2));
            add(new Gato("Lucy", "Branca", 1));
            add(new Gato("Rob", "Preta", 5));
            add(new Gato("Peter", "Roxa", 3));
            add(new Gato("Maik", "Amarela", 7));
        }};
        
        System.out.println("\n--- Ordem Inserida ---");
        System.out.println(meusGatos);

        System.out.println("\n--- Ordem Aleatoria ---");
        Collections.shuffle(meusGatos);//--metodo para embaralhar
        System.out.println(meusGatos);

        System.out.println("\n--- Ordem Nome ---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\n--- Ordem Idade ---");
        Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("\n--- Ordem Cor ---");
        Collections.sort(meusGatos, new ComparatorCor());
        System.out.println(meusGatos);






    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private String cor;
    private Integer idade;

    public Gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "\n\t[nome = " + nome + ",  cor = " + cor + ",  idade = " + idade + "]";
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}