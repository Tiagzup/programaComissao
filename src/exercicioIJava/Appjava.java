package exercicioIJava;
import java.util.Scanner;
public class Appjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
      String ID = "";
      
      String produto = "";
     
      int qVendas = 0;
      
      double  preço = 0;
      
      double porcentagem = 0;
     
      double comissao = (qVendas * preço * porcentagem ) /0; 
      
      
      
       Scanner entrada = new Scanner (System.in);
      
      System.out.println("informe o nome do vendedor?");
      
      ID = entrada.next();
      
      System.out.println("informe o produto vendido");
      
      produto = entrada.next();
      
      System.out.println("informe o valor da peça");
      
      preço = entrada.nextDouble();
      
      System.out.println("informa a quantidade vendida");
      
      qVendas =  entrada.nextInt();
      
      
      System.out.println(" informe a porcentagem");
      
      porcentagem = entrada.nextDouble();
      
      comissao = (qVendas * preço * porcentagem) /100;
        	
      
      System.out.println("Valor a receber?" + comissao );
      
      
      
      
      
      }

}
