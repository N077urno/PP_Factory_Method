/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP_Factory_Method_Pessoa;

/**
 *
 * @author IFGoiano
 */
public class Mulher extends Pessoa {
    public Mulher(String nome){
        this.nome = nome;
        System.out.println("Ola Senhora "+this.nome);
    }
}
