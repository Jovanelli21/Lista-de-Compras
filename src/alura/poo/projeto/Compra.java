package alura.poo.projeto;

public class Compra implements Comparable<Compra> {
    //Atributos
    private String descricao;
    private float valor;
    
    //Modificadores
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setValor(float valor){
        this.valor = valor;
    }
    
    //Acessores
    public String getDescricao(){
        return descricao;
    }
    
    public float getValor(){
        return valor;
    }
        
    //Sobreposição compareTo
    @Override
    public int compareTo(Compra compra) {
        return Float.compare(this.valor, compra.valor);
    }
    
    //Sobreposição toString.
    @Override
    public String toString(){
        return this.getDescricao();
    }
}
