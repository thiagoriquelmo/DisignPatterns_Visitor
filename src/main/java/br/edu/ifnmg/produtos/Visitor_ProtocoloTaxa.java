/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifnmg.produtos;

/**
 *
 * @author Thiago Riquelmo
 */
public interface Visitor_ProtocoloTaxa {
    public double calcularTaxaAlimento(Alimento alimento);
    public double calcularTaxaEletronico(Eletronico eletronico);
    public double calcularTaxaVestimenta(Vestimenta vestimenta);
}
