package EstruturaRepeticao;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //ESTRUTURAS DE REPETICAO
        //======================================================================
        /*
            Como voce ja' deve ter visto, estruturas de repeticao servem para
            fazer com que um trecho de co'digo deseja executado de forma repetida,
            podendo essa repeticao ter um nu'mero conhecido ou nao de vezes.
            Em Java existem duas estruturas de repeticao:
            
            1 - while (Correspondente ao "enquanto" no portugol)
            2 - for (Correspondente ao "para" no portugol)
        
            Em ambas estruturas e' preciso definir uma condicao de parada para
            garantir que nao haja um loop infinito. Os oepradores possi'veis de
            serem utilizados sao os operadores relacionais e lo'gicos
        
            Os operadores relacionais existentes na linguagem sao:
            1 - Maior           (>) 
            2 - Maior ou igual  (>=)
            3 - Menor           (<)
            4 - Menor ou igual  (<=) 
            5 - Diferente       (!=)
            6 - Igual           (==)
        
            Os operadores lo'gicos existentes na linguagem sao:
            1 - Operador E      (&&)
            2 - Operador OU     (||)
            3 - Operador NaO    (!)
        
            Precedencia dos Operadores:
            Ordem 	Tipo de Operador 	Precedencia
            1           Po's Fixo                expr++   expr�
            2           Pre fixo e Un�rio       ++expr   �expr   +expr   -expr   !
            3           Multiplicativo          *    /    %
            4           Aditivo                 +    �
            5           Relacional              >    >=    <=    <
            6           Igualdade               ==    !=
            7           AND Lo'gico              &&
            8           OR Lo'gico               ||
            9           Atribuicao              =   +=   -=   *=   /=   %=
         */
        //======================================================================
        // ESTRUTURA WHILE
        //======================================================================
        /*
            A estrutura while e' utilizada quando a quantidade de repeticoes
            necessa'rias nao for preciamente conhecida. Ex: quando voce quer 
            repetir algumas instrucoes N vezes.
         */
        //Exemplo de estrutura simples
        boolean desejaRepetir = true;

        Scanner leitor = new Scanner(System.in);

        String nome;
        byte idade;

        while (desejaRepetir = true) {
            System.out.println("Digite o nome do usua'rio");
            nome = leitor.nextLine();

            System.out.println("Digite a idade do usua'rio");
            idade = leitor.nextByte();

            System.out.println(nome + " tem " + idade + " anos!");

            desejaRepetir = leitor.nextBoolean();
        }

        //======================================================================
        // ESTRUTURA FOR
        //======================================================================
        /* 
            A estrutura de repeticao for e' indicada para as situacoes onde
            previamente se sabe quantas repeticoes serao necessa'rias. 
        
            Essa estrutura e' composta por 3 partes:
            1 - Criacao da varia'vel de controle da estrutura
            2 - Condicao de parada
            3 - Incremento
        
            Cada uma dessas partes e' separada por um ";"
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("O valor de i e': " + i);
        }

        /*
            Algumas coisas que voce deve tormar cuidado quando trabalha com
            estruturas de repeticao e' em garantir que a condicao de parada
            em algum momento seja atentida caso contra'rio sua estrutura de
            repeticao ficara' em um loop infinito
        
            Outra coisa que voce nao deve fazer e' criar varia'veis dentro de uma
            estrutura de repeticao. Caso voce faca isso, a cada repeticao da 
            estrutura seu algoritmo estara' alocando memo'ria do computador e 
            isso fara' com que sua aplicacao tenha um alto consumo de memo'ria.
            Caso voce precise ler valores dentro da estrutura, crie as varia'veis
            de leitura fora da estrutura repeticao 
         */
    }
}
