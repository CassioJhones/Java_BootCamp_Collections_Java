import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploLista {
    public static void main(final String[] args) throws Exception {
        System.out.println("\nCrie uma lista e adicione SETE notas:");
        final List<Double> notas = new ArrayList<Double>(); // --CRIAÇÃO DA LISTA/COLEÇÃO
        notas.add(7.5);
        notas.add(2.5);
        notas.add(5.0);
        notas.add(8.5);
        notas.add(2.3);
        notas.add(8.8);
        notas.add(1.5);
        System.out.println(notas); // --mostra a lista na tela
        System.out.println("\nExiba o posição da nota 2.3:  " + notas.indexOf(2.3d)); // --mostra o index solicitado

        System.out.println("\nADICIONE a nota 8 na posicao 4: ");
        notas.add(4, 8d); // --ADD Adiciona elemento (posicao,valor)
        System.out.println(notas);

        System.out.println("\nSUBSTITUA a nota 5 pela nota 6: ");
        notas.set(notas.indexOf(5d), 6d); // --SET altera elemento (posicao,valor)
        System.out.println(notas);

        System.out.println("\nCONFIRA se a nota 2.5 esta na lista: " + notas.contains(2.5)); // --contains realiza a
                                                                                             // verificacao
        System.out.println("EXIBIR as notas na ordem: ");
        for (Double nota : notas)
            System.out.println(nota);

        System.out.println("\nEXIBIR a TERCEIRA nota: " + notas.get(2)); // --GET seleciona um item da lista
        System.out.println(notas);

        System.out.println("\nExiba a MENOR nota:  " + Collections.min(notas));
        System.out.println("Exiba a MAIOR nota:  " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A SOMA DOS VALORES:  " + soma);
        System.out.println("A MÉDIA DOS VALORES:  " + (soma / notas.size()));
        System.out.println("\nREMOVER a nota 8.8: ");
        notas.remove(8.8); // --REMOVE deleta um numero da lista.
        System.out.println(notas);

        System.out.println("\nREMOVER a nota da posição 5: ");
        notas.remove(5);
        System.out.println(notas);

        System.out.println("\nREMOVER notas menores que 7: ");
        System.out.println("A lista esta vazia: -" + notas.isEmpty());// --Verifica se a lista esta vazia - boleano

        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next < 7)
                iterator2.remove();
        }
        System.out.println(notas);

        System.out.println("APAGAR a Lista toda: ");
        notas.clear(); // -- limpa toda a lista
        System.out.println(notas);
        System.out.println("A lista esta vazia: -" + notas.isEmpty()); // --Verifica se a lista esta vazia - boleano

    }
}
