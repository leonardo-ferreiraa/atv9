/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author 11211100857@alunos.umc.br
 */
public class Horista extends Empregado {

    private double horas;

    //Constructor
    public Horista(String n, String e, double h) {
        super(n, e);
        horas = h;
    }
    //Metodos de acesso

    public void set_horas(double h) {
        horas = h;
    }

    public double get_horas() {
        return horas;
    }

    public void calcularSalario() {
        salario = horas * 50;
    }
}
