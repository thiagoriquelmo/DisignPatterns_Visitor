/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.produtos;

/**
 *
 * @author Thiago Riquelmo
 */
public class Program {
    public static void main(String[] args) {
        Alimento a = new Alimento(10.0);
        Eletronico e = new Eletronico(1000.0);
        Vestimenta v = new Vestimenta(100.0);
        
        Visitor_TaxasBrasil taxaBrasil = new Visitor_TaxasBrasil();
        Visitor_TaxasPortugal taxaPortugal = new Visitor_TaxasPortugal();
        
        
        System.out.println("--PREÇOS BRASIL--");
        System.out.println("\nPreço alimento sem taxa: " + a.getPreco());
        System.out.println("Preço alimento com taxa: " + a.PrecoComTaxa(taxaBrasil));
        
        System.out.println("\nPreço eletronico sem taxa: " + e.getPreco());
        System.out.println("Preço eletronico com taxa: " + e.PrecoComTaxa(taxaBrasil));
        
        System.out.println("\nPreço vestimenta sem taxa: " + v.getPreco());
        System.out.println("Preço vestimenta com taxa: " + v.PrecoComTaxa(taxaBrasil));
        
        System.out.println("\n--PREÇOS PORTUGAL--");
        System.out.println("Preço alimento sem taxa: " + a.getPreco());
        System.out.println("Preço alimento com taxa: " + a.PrecoComTaxa(taxaPortugal));
        
        System.out.println("\nPreço eletronico sem taxa: " + e.getPreco());
        System.out.println("Preço eletronico com taxa: " + e.PrecoComTaxa(taxaPortugal));
        
        System.out.println("\nPreço vestimenta sem taxa: " + v.getPreco());
        System.out.println("Preço vestimenta com taxa: " + v.PrecoComTaxa(taxaPortugal));
    }
}
