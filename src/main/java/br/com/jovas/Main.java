package br.com.jovas;


import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Kia"));
        queueCarros.add(new Carro("Ferrari"));
        queueCarros.add(new Carro("Fiat"));
        queueCarros.add(new Carro("Alfa Romeu"));

        System.out.println(queueCarros.add(new Carro("Gurgel")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("Ford")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());
        System.out.println(queueCarros);
    }
}
