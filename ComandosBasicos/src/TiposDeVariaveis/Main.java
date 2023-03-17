package TiposDeVariaveis;
import java.util.Date;


public class Main {

    public static void main(String[] args) {

        // TIPOS DE VARIA'VEIS
        //======================================================================
        /*
            As va'riaveis podem ser divididas em dois tipos: Variaveis primitivas e nao primitivas (referencia)
            
            Varia'veis primitivas sao aquelas que foram criadas com a linguagem 
            de programacao e servem para armazenar valores simples, como por 
            exemplo um nu'mero, um valor lo'gico ou ate' mesmo um caractere.
        
            Ja' as varia'veis nao primitivas (referencia) sao aquelas que foram 
            criadas com o aprimoramento da linguagem. Elas servem para armazenar 
            valores mais complexos.
         */
        
        
        //Exemplos de tipos de varia''veis primitivas
        byte idade;
        short pontosAcumulados;
        int quantidadeUsuarios;
        float cotacaoDolar;
        double consumoMedio;
        boolean estaLogado;
        char genero;
        
        
        /*  
            Tipos, tamanhos e valores default das varia'veis primitivas:
        
            Tipo 	Tamanho (bits) 	Faixa                                                           Valor Padrao
            byte 	8               -128 a 127                                                      0
            short 	16              -32.768 a 32.767                                                0
            int 	32              -231 a 231 � 1                                                  0
            long 	64              -263 a 263 -1                                                   0L
            float 	32              IEEE 754 �1,40129846432481707e-45 a 3,40282346638528860e+38 	0.0f
            double 	64              IEEE 754 �4,94065645841246544e-324 a 1,79769313486231570e+308   0.0d
        */
        
        
        //Exemplos de tipos varia'ries nao primitivas
        String nome;
        Date dataNascimento;
        
        
        /*
            Note que nas varia'veis primitivas o tipo inicia com uma letra minu'scula,
            ja' nas varia'veis nao primitivas inicia com uma letra maiuscula
        */
        //======================================================================
        
        
        //OPERADORES
        //======================================================================
        /*
            Java conta com 5 operadores aritme'ticos:
        
            Soma            (+)
            Subtracao       (-)
            Multiplicacao   (*)
            Divisao         (/)
            Resto           (%)
        */
        
        
        int pontosEquipeA = 10;
        int pontosEquipeB = 20;
        
        //Exemplo de utilizacao do operador da ADICAO
        int totalSoma = pontosEquipeA + pontosEquipeB;
        //Exemplo de utilizacao do operador da SUBTRACAO
        int totalSubtracao = pontosEquipeA - pontosEquipeB;
        //Exemplo de utilizacao do operador da MULTIPLICACAO
        int totalMultiplicacao = pontosEquipeA * pontosEquipeB;
        //Exemplo de utilizacao do operador da DIVISAO
        int totalDivisao = pontosEquipeA / pontosEquipeB;
        //Exemplo de utilizacao do operador de RESTO  
        int totalResto = pontosEquipeA % pontosEquipeB;
        //======================================================================
    }

}
