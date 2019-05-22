/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.dc.ex1;

/**
 *
 * @author Faculdade
 */
public class Produto {
    private int id;
    private String descricao;
    private int qtd;
    private float preco;
    //metodo construtor
   public Produto(int id,String descricao,int qtd, float preco){
       this.id = id;
       this.descricao = descricao;
       this.qtd = qtd;
       this.preco = preco;
   }
   //metodo que comprar um produto e aumento a qtd no estoque
   public void comprar(int x){
       this.qtd =  this.qtd + x;
   }
   // metodo que vende um produto abaixando a qtd no estoque
   public void vender(int x){
       this.qtd = this.qtd - x;
   } 
   //metodo que aumenta o preco do produto em x unidades
   public void subir(float x){
       this.preco = this.preco + x;
   }
   //metodo que diminui o preco do produto em x unidades
   public void descer(float x){
       this.preco = this.preco - x;
   }
   // metodo que mostra todas as informacoes do produto
   public String mostrar(){
       return "Id do Produto " + this.id + "\n" + "Qtd de Estoque: " + this.qtd + "\n" + "Preco do Produto: R$" + this.preco;
   }
}
