package EntradaESaida;

//1 - Importar o pacote java.util
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      
      //COMANDOS DE ENTRADA
      //======================================================================
      /*
          Uma das possibilidades de entrada e sai'da de dados em Java e' a 
          utilizacao da classe Scanner.
      
          Passos para a utilizacao do Scanner:
          
          1 - Importar o pacote java.util
          2 - Instanciar e criar um objeto Scanner
          3 - Ler valores atrave's do teclado
      */
     
      //2 - Instanciar e criar um objeto Scanner
      Scanner leitor = new Scanner(System.in);
      
      int n = leitor.nextInt();
      float f = leitor.nextFloat();
      double d = leitor.nextDouble();
      String s = leitor.next(); //Le apenas uma palavra, nao e' permitido o uso do caractere espaco
      String ss = leitor.nextLine(); //Leitura de texto com mais de uma palavra
      
      /*
          Como o me'todo next retorna um texto precisamos pegar o caractere da
          primeira posicao da palavra para isso usamos o me'todo charAt() na
          posicao zero
      */
      char c = leitor.next().charAt(0);
      //======================================================================
      
      //COMANDOS DE SAI'DA
      //======================================================================
      /*
          Existem algumas opcoes de comandos de sai'da utilizando a classe 
          System. Sao elas: 
          
          1 - print() - Imprime o valor de uma varia'vel
          2 - printf() - Imprime o valor de uma varia'vel conforme uma formatacao especificada
          3 - println() - Imprime o valorm de uma varia'vel e pula uma linha
      */
      
      String texto = "Esse texto sera' impresso no console";
      String outroTexto = "Esse texto tambe'm sera' impresso no console";
      System.out.println(texto);
      System.out.print(outroTexto);
      //======================================================================
  }
  
}
