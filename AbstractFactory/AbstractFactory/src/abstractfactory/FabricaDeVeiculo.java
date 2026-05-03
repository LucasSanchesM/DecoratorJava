/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author lucas
 */
interface FabricaDeVeiculo {
    Carro criarCarro();
    Motocicleta criarMoto();
}
