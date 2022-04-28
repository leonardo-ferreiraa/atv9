/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author 11211100857@alunos.umc.br
 */
public class Mensalista extends Empregado {

    private String cargo;

    //constructor
    public Mensalista(String n, String e, String c) {
        super(n, e);
        cargo = c;
    }

    //Metodos de acesso
    public void set_cargo(String c) {
        cargo = c;
    }

    public String get_cargo() {
        return (cargo);
    }

    public void calcularSalario() {
        if (cargo.equals("Junior") || (cargo.equals("junior"))) {
            salario = 2500;
        } else if (cargo.equals("Pleno") || (cargo.equals("pleno"))) {
            salario = 3500;
        } else if (cargo.equals("Senior") || (cargo.equals("senior"))) {
            salario = 5500;
        } else {

            salario = 0;
        }
    }
}
