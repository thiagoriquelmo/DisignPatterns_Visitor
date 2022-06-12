/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.produtos;

/**
 *
 * @author Thiago Riquelmo
 */
public class Visitor_TaxasPortugal implements Visitor_ProtocoloTaxa{

    @Override
    public double calcularTaxaAlimento(Alimento alimento) {
        return alimento.getPreco() + alimento.getPreco() * 0.6;
    }

    @Override
    public double calcularTaxaEletronico(Eletronico eletronico) {
        return eletronico.getPreco() + eletronico.getPreco() * 0.10;
    }

    @Override
    public double calcularTaxaVestimenta(Vestimenta vestimenta) {
        return vestimenta.getPreco() + vestimenta.getPreco() * 0.08;
    }
    
}
