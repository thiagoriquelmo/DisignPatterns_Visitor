/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.produtos;

/**
 *
 * @author rThiago Riquelmos
 */
public class Eletronico extends Produto{

    public Eletronico(double preco) {
        super("Eletronico", preco);
    }

    @Override
    double PrecoComTaxa(Visitor_ProtocoloTaxa taxa) {
        return taxa.calcularTaxaEletronico(this);
    }
    
}
