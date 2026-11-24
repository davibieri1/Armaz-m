package com.example.model;
import java.util.ArrayList;
public class Pedido {
    private ArrayList<ItemPedido> itens;
    private Cliente cliente;
    private Armazem armazem;
    private String status;
    
    public Pedido(ArrayList<ItemPedido> itens, Cliente cliente, Armazem armazem, String status) {
        this.itens = itens;
        this.cliente = cliente;
        this.armazem = armazem;
        this.status = status;
    }

    public void adicionarItem(Produto p, int quantidade){
       ItemPedido a = new ItemPedido(p, quantidade);
        if(itens.contains(a)){
            a.setQuantidade(a.setQantidade()+ quantidade) += 1;
        }
        if(p == null || quantidade <=0 || quantidade > p.getQuantEmEstoque()){
        System.out.println("Pedido inválido.");
    }
    }

    
}
