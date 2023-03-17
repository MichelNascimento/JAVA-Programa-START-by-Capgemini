package EstruturaCondicional;

public class Main {
    
    public static void main(String[] args) {
       
        //ESTRUTURAS DE SELECAO
        //======================================================================
        /*
            Como voce ja deve ter visto, estruturas de selecao servem para
            fazer desvios pelo co'digo, fazendo com que trechos de co'digo sejam
            executados ou ignorados durante a a execucao dependendo de uma 
            condicao previamente definida.
            Em Java existem duas estruturas de selecao:
            
            1 - if (Correspondente ao "se" no portugol)
            2 - switch (Correspondente ao "caso" no portugol)
        
            Em ambas estruturas e' possivel utilizar os operadores relacionais e
            lo'gicos
        
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
            2           Pre' fixo e Una'rio       ++expr   �expr   +expr   -expr   !
            3           Multiplicativo          *    /    %
            4           Aditivo                 +    �
            5           Relacional              >    >=    <=    <
            6           Igualdade               ==    !=
            7           AND Lo'gico              &&
            8           OR Lo'gico               ||
            9           Atribuicao              =   +=   -=   *=   /=   %=
         */
        //======================================================================
        // ESTRUTURA IF
        //======================================================================
        /*
            A estrutura if pode ser montada de forma simples ou aninhada.
         */
        //Exemplo de estrutura simples
        int media = 7;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Aprovado");
        }

        //Exemplo de estrututa aninhada
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            if (media >= 5) {
                System.out.println("Em recupera��o");
            } else {
                System.out.println("Reprovado");
            }
        }
        //======================================================================

        // ESTRUTURA SWITCH
        //======================================================================
        /* 
            A estrutura de selecao switch testa o valor contido em uma varia'vel 
            e o compara com os valores fornecidos em cada caso, representados pela
            palavra reservada case. Podemos ter quantos casos forem necessa'rios
            na estrutura, e quando um dos valores corresponder ao da varia'vel de
            teste, todo o co'digo que esta' dentro daquele bloco do caso sera' 
            executado.
        
            A va'riavel que sera' utilizada no controle da estrutura pode ser dos
            tipos primitivos como: int, char, byte e tambe'm do tipo String (
            nao sao permitidos tipos como float, double pois estes trabalham
            com nu'meros com casas decimais)
        
         */
        int codigoProduto = 1;
        switch (codigoProduto) {
            case 1:
                System.out.println("Produto 1");
                break;

            case 2:
                System.out.println("Produto 2");
                break;

            case 3:
                System.out.println("Produto 3");
                break;

            default:

        }
    }
    
}
