package alura.poo.projeto;

import java.util.Scanner;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        //Objeto de ebtrada
        Scanner entrada = new Scanner(System.in);
        
        //Adicionando limite do cartão.
        System.out.println("Digite o limite do cartão: ");
        float limite = entrada.nextFloat();
        Cartao cartao = new Cartao(limite);
        
        //Saída do Loop
        int sair = 1;
        while (sair != 0){
        //Limpeza do Buffer
        entrada.nextLine();
            
        //Criação das variáveis
        System.out.println("Digite o produto adicionado: ");
        String nomeProduto = entrada.nextLine();
        System.out.println("Digite o valor do produto: ");
        float precoProduto = entrada.nextFloat();
        
        //Adição de objeto a cada compra.
        Compra compra = new Compra();
        compra.setDescricao(nomeProduto);
        compra.setValor(precoProduto);
        
        //Lançamento da compra no cartão.
        boolean compraRealizada = cartao.lancaCompra(compra);
        
        //Perguntra para quebra de Loop.
        System.out.println("Deseja continuar comprando ? [S/N]");
        
        if(compraRealizada){
            System.out.println("Compra realizada.");
            System.out.println("Digite 0 para sair ou 1 para continuar:");
            sair = entrada.nextInt();
        }
        else{
            System.out.println("Saldo insuficiente");
            sair = 0;
        }
      }
        //Ordenando a lista de Compras.
        Collections.sort(cartao.getCompras());
        
        System.out.println("\n========================================");
        System.out.println("Compras Realizadas: \n");
        
        for(Compra c : cartao.getCompras()){
            System.out.println(c.getDescricao() + " - R$: " + c.getValor());
        }
        
        //Saldo do cartão.
        System.out.println("Saldo do Cartão: " + cartao.getSaldo());
    }
    
    
    
}
