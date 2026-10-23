package alura.poo.projeto;

import java.util.List;
import java.util.ArrayList;

public class Cartao {
    //Atributos
    private float limite;
    private float saldo;
    private final List<Compra> compras;
    
    //Construtor
    public Cartao(float limite){
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }
    
    //Modificadores
    public void setLimite(float limite){
        this.limite = limite;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    //Acessores
    public float getLimite(){
        return limite;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    //Lançamento de Compra
    public boolean lancaCompra(Compra compra){
        if(this.getSaldo() >= compra.getValor()){
            System.out.println("Produto comprado!");
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }
    
    //Acesso a lista de compras
    public List<Compra> getCompras(){
        return compras;
    }
}

