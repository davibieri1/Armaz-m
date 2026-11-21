package com.example.model;

public abstract class Produto {
    private String nome;
    private String descricao;
    private double precoUnitario;
    private double peso;
    private int quantEmEstoque;
    private int estoqueMin;
    private double tempoDeSeparacao;
    
    public Produto(){

    }
    public Produto(String nome, String descricao, double precoUnitario, double peso, int quantEmEstoque, int estoqueMin,
            double tempoDeSeparacao) {
        setNome(nome);
        setDescricao(descricao);
        setPrecoUnitario(precoUnitario);
        setPeso(peso);
        setQuantEmEstoque(quantEmEstoque);
        setEstoqueMin(estoqueMin);
        setTempoDeSeparacao(tempoDeSeparacao);
    }

    public void reabastecer(int quant){
        if(quant > 0)
        quantEmEstoque += quant;
    }

    public abstract String exibirDetalhes();

    public abstract double calcularTaxaManuseio();

    public boolean estoqueBaixo(){
        if(quantEmEstoque<= estoqueMin){
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
       if(nome.length()>=3){
        this.nome = nome;
        return true;
    }
    else{
        System.out.println("Nome Inválido.");
        return false;
    }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if(precoUnitario > 0){
            this.precoUnitario = precoUnitario;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso > 0){
            this.peso = peso;
        }
    }

    public int getQuantEmEstoque() {
        return quantEmEstoque;
    }

    public void setQuantEmEstoque(int quantEmEstoque) {
        if(quantEmEstoque>=0){
            this.quantEmEstoque = quantEmEstoque;
        }
    }

    public int getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(int estoqueMin) {
        if(estoqueMin>=0){
            this.estoqueMin = estoqueMin;
        }
    }

    public double getTempoDeSeparacao() {
        return tempoDeSeparacao;
    }

    public void setTempoDeSeparacao(double tempoDeSeparacao) {
       if(tempoDeSeparacao > 0){
        this.tempoDeSeparacao = tempoDeSeparacao;
    }
}
    
   
}
