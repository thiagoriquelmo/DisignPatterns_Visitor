/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.produtos;

/**
 *
 * @author Thiago Riquelmo
 */
public class Alimento extends Produto{  

    public Alimento( double preco) {
        super("Alimento", preco);
    }   

    @Override
    double PrecoComTaxa(Visitor_ProtocoloTaxa taxa) {
        return taxa.calcularTaxaAlimento(this);
    }
}
