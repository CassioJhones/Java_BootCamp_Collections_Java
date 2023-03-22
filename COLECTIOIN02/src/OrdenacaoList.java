import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoList {
    public static void main(String[] args) throws Exception {
        List<Gato> meusGatos = new ArrayList<>(){{
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

        System.out.println("\n--- Ordem Natural (Nome)---");
        Collections.sort(meusGatos);
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
        return "[\nnome =  " + nome + ", cor =  " + cor + ", idade =  " + idade + "]";
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
    
}
