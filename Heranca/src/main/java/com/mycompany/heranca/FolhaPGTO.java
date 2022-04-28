/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author 11211100857@alunos.umc.br
 * 
 *  PS: Eu cheguei a testar o programa na faculdade e funcionou, mas quando fui fazer o desafio
 *    e testar em casa ele simplesmente estava dando erro no comando de execução
 */
public class FolhaPGTO {

    public static void main(String[] args) {
        Mensalista men1, men2;
        Horista hora1, hora2;
        //Empregados sensalistas
        men1 = new Mensalista("Jose", "Rua abc", "Junior");
        men1.calcularSalario();
        men1.calcularInss();
        men1.imprimir();

        men2 = new Mensalista("Ana", "Rua sem fim", "Senior");
        men2.calcularSalario();
        men2.calcularInss();
        men2.imprimir();

        //Empregados horistas
        hora1 = new Horista("Carlos", "Rua xyz", 20);
        hora1.calcularSalario();
        hora1.imprimir();

        hora2 = new Horista("Cristina", "Rua do centro", 100);
        hora2.calcularSalario();
        hora2.imprimir();

    }
}
