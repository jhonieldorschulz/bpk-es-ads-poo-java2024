import java.util.ArrayList;

public class ExemploVariaveisWrapper {
    public static void main(String[] args) {
        /**
         * Os tipos wrapper em Java, como Integer, Double, Boolean, entre outros, são classes que encapsulam
         * tipos primitivos, oferecendo várias vantagens adicionais.
         *
         * 1. Compatibilidade com Coleções
         * As coleções do Java (como ArrayList, HashMap, etc.) trabalham apenas com objetos.
         * Tipos wrapper permitem armazenar e manipular valores primitivos dentro dessas coleções.
         */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);  // Inteiro primitivo 'int' é automaticamente convertido para 'Integer'
        numbers.add(20);
        System.out.println(numbers);
        /**
         * Sem tipos wrapper, seria impossível adicionar diretamente tipos primitivos às coleções.
         */
        /**
         * 2. Funcionalidades de Classe
         * Os tipos wrapper fornecem métodos úteis para manipulação e conversão de dados.
         * Por exemplo, métodos para conversão de string para números, comparação de valores, e mais.
         */
        String str = "123";
        int num = Integer.parseInt(str);  // Converte string para int
        System.out.println(num);
        /**
         * Outro exemplo
         */
        Integer a = 100;
        Integer b = 200;
        int comparison = a.compareTo(b);  // Compara dois valores Integer
        System.out.println(comparison);   // Saída será negativa porque 100 < 200
        /**
         * Outra forma de comparar dois números é o compare direto usando
         * dois valores do tipo int
         */
        int comparisonInt = Integer.compare(1,2);
        /**
         * No caso o retorno é -1
         * O método Integer.compare(x,y) retorna -1 se x < y, 0 se x = y e 1 se x>y
         */
        int x = 1;
        int y = 2;
        System.out.println(Integer.compare(x,y));
    }


}
