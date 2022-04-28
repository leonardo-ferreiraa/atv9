/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author 11211100857@alunos.umc.br
 */
public class Empregado {

    protected String nome;
    protected String endereco;
    protected double salario;
    //constructor

    public Empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;

    }

    //Metodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;

    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularIrpf() {
        double desc_irpf = 0;
        if (salario < 1903.38) {
            desc_irpf = 0 * salario;
            
        } else if (salario >= 1903.38 && salario <= 2826.65) {
            desc_irpf = 0.0075 * salario;
            
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            desc_irpf = 0.015 * salario;
            
        } else if (salario >= 3751.06 && salario < 4664.68) {
            desc_irpf = 0.0225 * salario;
            
        } else {
            desc_irpf = 0.0275 * salario;
        }
        return (desc_irpf);
    }

    public double calcularInss() {
        double sal = 0;
        if (salario <= 1212) {
            sal = salario * 0.075;

        } else if (salario <= 2427.35) {
            sal = salario * 0.09;

        } else if (salario <= 3641.03) {
            sal = salario * 0.12;

        } else if (salario <= 7087.22) {
            sal = salario * 0.14;

        }
        return (sal);
    }
    public void imprimir(){
        System.out.println("Nome:" + nome);
        System.out.println("Endereco:" + endereco);
        System.out.println("Salario:" + salario);
    }
}
